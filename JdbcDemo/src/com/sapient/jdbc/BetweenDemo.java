package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BetweenDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lowest range");
		double minsal=sc.nextDouble();
		System.out.println("enter the highest range");
		double maxsal=sc.nextDouble();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@10.151.61.127:1521:xe";
		Connection con = DriverManager.getConnection(url,"system","sapient123");
		String sql = "select * from sap_emp where sal between ? and ?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setDouble(1,minsal);
		pst.setDouble(2,maxsal);
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getDouble("sal"));
			System.out.println(rs.getDouble("dept_id"));
			System.out.println(rs.getDate("doj"));
		}
		con.close();
	}

}
