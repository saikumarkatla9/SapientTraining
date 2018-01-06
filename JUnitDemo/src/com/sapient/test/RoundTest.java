package com.sapient.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalcService;

@RunWith(JUnitPlatform.class)
public class RoundTest {

	@Test
	public void testRound1(){
		CalcService ser = new CalcService();
		double expected = 56.328;
		double actual = ser.roundToN(56.3277, 3);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testRound2(){
		CalcService ser = new CalcService();
		double expected = 56.325;
		double actual = ser.roundToN(56.3248, 3);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testRound3(){
		CalcService ser = new CalcService();
		double expected = 56.33;
		double actual = ser.roundToN(56.32768, 2);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testRound4(){
		CalcService ser = new CalcService();
		double expected = 56.3277;
		double actual = ser.roundToN(56.32774, 4);
		assertEquals(expected,actual);
	}
	@Test
	@Disabled
	public void testRound5(){
		CalcService ser = new CalcService();
		double expected = 56;
		double actual = ser.roundToN(56.3345, 0);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testRound6(){
		CalcService ser = new CalcService();
		double expected = 57;
		double actual = ser.roundToN(56.8765, 0);
		assertEquals(expected,actual);
	}
}
