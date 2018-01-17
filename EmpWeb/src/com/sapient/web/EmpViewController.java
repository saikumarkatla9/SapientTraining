package com.sapient.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.IDao;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;


public class EmpViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IDao dao = DaoFactory.getDaoInstance();   
    
    public EmpViewController() {
        super();
        
    }
  public void init(){
	  
	  ServletContext ctx = getServletContext();
	  List<Emp> lst = dao.viewEmployee();
	  ctx.setAttribute("elist", dao.viewEmployee());
  }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri= request.getRequestURI();
		RequestDispatcher rd =null;
		String view =null;
		ServletContext ctx = getServletContext();
		switch(uri){
		case "/EmpWeb/viewall":
			view = viewAll(request);
		
			break;
		case "/EmpWeb/update":
			view = updateEmp(request);
			break;
		}
		    rd = request.getRequestDispatcher(response.encodeURL(view));
		    rd.forward(request, response);
	}
	
	private String updateEmp(HttpServletRequest request){
		int eid= Integer.parseInt(request.getParameter("hideid"));
		double sal= Double.parseDouble(request.getParameter("txtsal"));
		int pgno = Integer.parseInt(request.getParameter("pgid"));
		ServletContext ctx= getServletContext();
		try{
			dao.updateEmployee(eid, sal);
			request.setAttribute("msg", "employee salary for" + eid + "is updated");
			ctx.setAttribute("elist", dao.viewEmployee());
		}catch(NotFoundException e){
			request.setAttribute("msg", "employee salary is not updated");
			e.printStackTrace();
		}
		return "viewall?pg="+pgno;
		
	}
	
	
	
    private String viewAll(HttpServletRequest request){
    	String uri= request.getRequestURI();
		
			String strpg= request.getParameter("pg");
			int pgno = 0;
			if(strpg == null)
				pgno = 1;
			else
				pgno = Integer.parseInt(strpg);
			System.out.println(pgno);
			int end = pgno * 3;
			int start = end - 3;
			System.out.println(end + " " + start);
			ServletContext ctx = getServletContext();
			List<Emp> lst = (List<Emp>)ctx.getAttribute("elist");
			if(end >= lst.size())
				end =lst.size();
			List<Emp> sublst = lst.subList(start, end);
			request.setAttribute("emplist", sublst);
			request.setAttribute("pgno", pgno);
			ctx.setAttribute("esize", Math.ceil(lst.size()/3.0));
			String view = "EmpView.jsp";
			return view;
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
