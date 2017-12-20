package com.sapient.service;

public interface Interest extends Basic {

	double calcSimple(double amt,int years,float rate);
	double calcCompound(double amt,int years,float rate);
}
