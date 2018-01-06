package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.EmpService;
import com.sapient.service.Factory;
import com.sapient.service.NotFoundException;
import com.sapient.vo.Emp;

@RunWith(JUnitPlatform.class)
@DisplayName("EmpDao Test")
public class EmpTest {

	@Test
	@DisplayName("Test emp by obj")
	public void testEmp1(){
		Emp e1 = new Emp(1002,"ram",9000);
		Emp e2 = new Emp(1002,"ram",9000);
		assertEquals(e1, e2);
	}
	
	
	@Test
	@DisplayName("Test emp by id=1002")
	public void testEmp2() throws NotFoundException, ClassNotFoundException, SQLException{
		EmpService ser = Factory.getEmpService();
		assumeTrue(ser!=null);
		Emp expected = new Emp(1002,"Tom",15000.0);
		assertEquals(expected, ser.getEmployee(1002));
	}
	
	
	@Test
	@DisplayName("Test emp by id =1003")
	public void testEmp3() throws NotFoundException, ClassNotFoundException, SQLException{
		EmpService ser = Factory.getEmpService();
		assumeTrue(ser!=null);
		Emp expected = new Emp(1003,"Sam",23000.0);
		Emp actual = ser.getEmployee(1003);
		assertAll("test all states",
				()->assertEquals(expected.getEid(),actual.getEid()),
				()->assertEquals(expected.getEname(),actual.getEname()),
				()->assertEquals(expected.getSal(),actual.getSal())	);
	}
	
	@Test
	@DisplayName("Test emp by id")
	public void testEmp4() throws NotFoundException{
		EmpService ser = Factory.getEmpService();
		assumeTrue(ser!=null);
		assertThrows(NotFoundException.class, ()->ser.getEmployee(1016));	
	}
	
	

	
}















