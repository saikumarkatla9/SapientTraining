package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SumAndAvgSalary {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@10.151.61.127:1521:xe";
		Connection con = DriverManager.getConnection(url,"system","sapient123");
		String sql = "select sum(sal) totsal,avg(sal) avgsal,count(eid) noOfEmp from sap_emp";
		PreparedStatement pst = con.prepareStatement(sql);
		
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			System.out.println("sum="+rs.getDouble("totsal"));
			System.out.println("avg="+rs.getString("avgsal"));
			System.out.println("noOfEmp="+rs.getDouble("noOfEmp"));
			
		}
		
		con.close();

	}

}
