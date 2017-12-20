package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SapEmpDisplay {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@10.151.61.127:1521:xe";
		Connection con = DriverManager.getConnection(url,"system","sapient123");
		String sql = "select e.eid,e.ename,e.sal,d.dname from sap_emp e inner join sap_dept d on d.did=e.dept_id";
		PreparedStatement pst = con.prepareStatement(sql);
		
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			System.out.print("eid=    "+rs.getInt(1)+"    ");
			System.out.print("ename=  "+rs.getString(2)+"    ");
			System.out.print("sal=    "+rs.getDouble(3)+"    ");
			System.out.print("dname=  "+rs.getString(4)+"    ");
			System.out.println();
			
		}
		
		con.close();

	}

}
