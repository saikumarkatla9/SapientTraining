package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SapEmpUpdateSal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		int eid = sc.nextInt();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@10.151.61.127:1521:xe";
		Connection con = DriverManager.getConnection(url,"system","sapient123");
		String sql = "update sap_emp set sal=sal+sal*0.1 where eid=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1,eid);
		int rows = pst.executeUpdate();


	}

}
