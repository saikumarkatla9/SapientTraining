package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class SpyTest {

	@Test
	public void m1(){
		List<String> list = Mockito.mock(List.class);
		list.add("ram");
		list.add("tom");
		System.out.println(list.size());
		assertTrue(list.size()==0);
	}
	@Test
	public void m2(){
		List<String> list = Mockito.spy(new ArrayList<>());
		list.add("ram");
		list.add("tom");
		System.out.println(list.size());
		assertTrue(list.size()==2);
	}
	
	@Test
	public void m3(){
		List<String> list = Mockito.spy(new ArrayList<>());
		Mockito.when(list.size()).thenReturn(100);
		System.out.println(list.size());
		assertTrue(list.size()==100);
	}
}
