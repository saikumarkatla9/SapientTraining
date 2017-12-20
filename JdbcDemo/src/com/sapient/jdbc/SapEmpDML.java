package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SapEmpDML {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter eid");
		int eid = sc.nextInt();
		System.out.println("enter ename");
		String ename = sc.next();
		System.out.println("enter salary");
		double sal = sc.nextDouble();
		System.out.println("enter department id");
		int did = sc.nextInt();
		System.out.println("enter date of joining");
		String date = sc.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@10.151.61.127:1521:xe";
		Connection con = DriverManager.getConnection(url,"system","sapient123");
		String sql = "insert into sap_emp values(?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, eid);
		pst.setString(2, ename);
		pst.setDouble(3, sal);
		pst.setInt(4,did);
		pst.setString(5,date);
		int rows = pst.executeUpdate();
		System.out.println(rows+" row affected");
		con.close();
		sc.close();

	}

}
