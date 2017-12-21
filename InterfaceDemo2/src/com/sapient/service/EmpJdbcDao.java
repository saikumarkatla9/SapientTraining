package com.sapient.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpJdbcDao implements Idao{

	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public List<String> viewEmployee() {
		List<String> list = new ArrayList<String>();
		Connection con=null;
		try{
			String url="jdbc:oracle:thin:@10.151.61.127:1521:xe";
			con=DriverManager.getConnection(url);
			String sql="select ename from sap_emp";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				list.add(rs.getString("ename"));
			}
		}
		catch(SQLException se){
			System.out.println(se.getMessage());
		}
		finally{
			closeConnection(con);
		}
		return list;
	}

	public void closeConnection(Connection con){
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
