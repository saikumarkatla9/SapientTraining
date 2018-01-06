package com.sapient.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sapient.vo.Emp;

public class EmpService {

	public EmpService(){
		
	}
	public Emp getEmployee(int eid) throws NotFoundException, ClassNotFoundException, SQLException{
		Emp emp=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sapient123");
		PreparedStatement pst = con.prepareStatement("select * from sap_emp where eid=?",eid);
		pst.setDouble(1,eid);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()){
			int id = rs.getInt("eid");
			String name = rs.getString("ename");
			double salary = rs.getDouble("sal");
			emp =new Emp(id,name,salary);
		
			
		}
		if(emp==null)
			throw new NotFoundException();
		else
			return emp;
		
	}
}
