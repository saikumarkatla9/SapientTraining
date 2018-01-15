package com.sapient.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sapient.service.ExamSerImpl;
import com.sapient.service.IExamSer;
import com.sapient.vo.Answer;
import com.sapient.vo.Question;

/**
 * Servlet implementation class QuizController
 */
public class QuizController extends HttpServlet {
	private static final long serialVersionUID = 1L;      
	private IExamSer ser = ExamSerImpl.getInstance();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuizController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getRequestURI();
		RequestDispatcher rd=null;
		String view=null;
		switch(url){
		case "/OnlineQuiz/start":
			view= startExam(request);
			break;
		case "/OnlineQuiz/quiz":
			view = getNextPrevFinish(request);
			break;
		}
		rd= request.getRequestDispatcher(response.encodeURL(view));
		rd.forward(request, response);
	}
	
	private String startExam(HttpServletRequest request){
		HttpSession ses = request.getSession();
		ServletConfig cfg = getServletConfig();
		int noOfQuestions = Integer.parseInt(cfg.getInitParameter("pquestions"));
		ServletContext ctx = getServletContext();
		ctx.setAttribute("size", noOfQuestions);
		List<Question> qlist =ser.generateQuestions(noOfQuestions);
		Map<Integer,Answer> amap = new HashMap();
		ses.setAttribute("ansmap", amap);
		ses.setAttribute("queslist", qlist);
		ses.setAttribute("curridx", 0);
		request.setAttribute("question", qlist.get(0));
		String view="QuizView.jsp";
		return view;
	}
	
	private String getNextPrevFinish(HttpServletRequest request){
		String view="";
		String btn=request.getParameter("btn");
		HttpSession ses = request.getSession();
		List<Question> qlist =  (List<Question>) ses.getAttribute("queslist");
		int idx = (int) ses.getAttribute("curridx");
		Map<Integer,Answer> amap = (Map<Integer, Answer>) ses.getAttribute("ansmap");
		int qid = Integer.parseInt(request.getParameter("quesid"));
		String ans = request.getParameter("ques");
		Answer obj = new Answer(qid, ans);
		amap.put(obj.getQid(),obj);
		switch(btn){
			case "next":
				request.setAttribute("question", qlist.get(++idx));
				view ="QuizView.jsp";
				ses.setAttribute("curridx",idx);
				break;
			case "prev":
				request.setAttribute("question", qlist.get(--idx));
				view ="QuizView.jsp";
				ses.setAttribute("curridx",idx);
				break;
			case "finish":
				List<Answer> alist = new ArrayList<>();
				alist.addAll(amap.values());
				int score = ser.evaluate(alist);
				request.setAttribute("queslist", ses.getAttribute("queslist"));
				request.setAttribute("ansmap", ses.getAttribute("ansmap"));
				request.setAttribute("score", score);
				ses.invalidate();
				view = "QuizScore.jsp";
				
		}
		
		return view;
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
