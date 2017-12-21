package com.sapient.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.valueobject.Emp;

public class EmpMemDao implements Idao{

	public static Map<Integer,Emp> emap;
	static{
		emap = new HashMap<Integer,Emp>();
		emap.put(1001,new Emp(1001,"virat",45000,1,LocalDate.of(2014, 7, 21)));
		emap.put(1005,new Emp(1005,"rohith",40000,1,LocalDate.of(2011, 6, 11)));
		emap.put(1003,new Emp(1003,"dhawan",38000,1,LocalDate.of(2013, 9, 01)));
		
	}
	
	@Override
	public List<Emp> viewEmployee() {
		List<Emp> list =new ArrayList<Emp>();
		list.addAll(emap.values());
		return list;
	}
	@Override
	public Emp viewEmployee(int eid) throws NotFoundException {
		if(!emap.containsKey(eid))
			throw new NotFoundException("Employee not found");
		Emp emp=emap.get(eid);
		return emp;
	}
	@Override
	public int addEmployee(Emp emp) throws IdException {
		if(emap.containsKey(emp.getEid()))
			throw new IdException("Id already exists");
		emap.put(emp.getEid(),emp);
		return 0;
	}
	@Override
	public int removeEmployee(int eid) throws NotFoundException {
		
		return 0;
	}
	@Override
	public int updateSalary(int eid, double sal) throws NotFoundException {
		
		return 0;
	}
}
