package com.sapient.service;

import com.sapient.exceptions.BalanceException;
import com.sapient.exceptions.IdException;

public interface ISer {

	public boolean transferFund(int fid,int pid,double amt)throws BalanceException,IdException;
}
