package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalcService;
import com.sapient.service.Factory;

@RunWith(JUnitPlatform.class)
public class CalcTest {

	@Test
	public void testService1(){
		CalcService ser = Factory.getCalcService();
		assumeTrue(ser!=null);
		assertEquals(7.5,ser.calcService(5,5,5));
	}
	
	@Test
	public void testService2(){
		CalcService ser = Factory.getCalcService();
		//this type of aasumption is introduced in junit5
		assumingThat(ser!=null, ()->assertEquals(10.0,ser.calcService(5, 5, 10)));
	}
}
