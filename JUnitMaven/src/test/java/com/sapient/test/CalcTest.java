package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalcService;

@RunWith(JUnitPlatform.class)
public class CalcTest {

	private static CalcService ser;
	
	@BeforeAll
	public static void beforeAll(){
		ser=new CalcService();
		System.out.println("Before All");
	}

	@AfterAll
	public static void afterAll(){
		System.out.println("After All");
		ser=null;
	}
	@BeforeEach
	public void beforeEach(){
		System.out.println("Before each");
	}
	
	@AfterEach
	public void afterEach(){
		System.out.println("After each");
	}
	
	@Tag("prod")
	@Test
	public void seriesTest(){
		System.out.println("Test 1");
		double expected = 10.0;
		double actual = ser.calcService(5, 5, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	public void seriesTest2(){
		System.out.println("Test 2"); 
		double expected = 7.5;
		double actual = ser.calcService(5, 5, 5);
		assertEquals(expected,actual);
	}
	
	
}
