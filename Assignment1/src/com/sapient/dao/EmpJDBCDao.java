package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.valueobject.Emp;

public class EmpJDBCDao implements Idao{

	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		System.out.println(e.getMessage());
		}
		String url = "jdbc:oracle:thin:@10.151.61.127:1521:xe";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,"system","sapient123");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		String sql = "insert into sap_emp values(?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	@Override
	public List<Emp> viewEmployee() {
		List<Emp> list =new ArrayList<Emp>();
		return list;
		
	}

	@Override
	public Emp viewEmployee(int eid) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmployee(Emp emp) throws IdException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeEmployee(int eid) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSalary(int eid, double sal) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

}
