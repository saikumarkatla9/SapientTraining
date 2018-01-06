package com.sapient.service;

import com.sapient.dao.IDao;
import com.sapient.exceptions.BalanceException;
import com.sapient.exceptions.IdException;
import com.sapient.vo.Account;

public class SerImpl implements ISer{

	private IDao dao;
	
	public void setDao(IDao dao) {
		System.out.println("injecting mock");
		this.dao = dao;
	}

	@Override
	public boolean transferFund(int fid, int tid, double amt) throws BalanceException, IdException {
		Account from = dao.getAccount(fid);
		Account to = dao.getAccount(tid);
		if(from.getBal()<amt)
			throw new BalanceException();
		from.setBal(from.getBal()-amt);
		to.setBal(to.getBal()+amt);
		return true;
	}

}
