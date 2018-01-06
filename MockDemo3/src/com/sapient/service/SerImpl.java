package com.sapient.service;

import java.util.List;
import java.util.Map;

import com.sapient.dao.IProductDao;
import com.sapient.vo.Product;

public class SerImpl implements ISer{

	private IProductDao dao;

	
	//setter is used by mockito to inject mock instances
	public void setDao(IProductDao dao) {
		this.dao = dao;
	}

	@Override
	public Product getProductInfo(String cat,int pid) throws NotFoundException{
		Map<String,Map<Integer,Product>> catMap = dao.getCatNProds();
		if(!catMap.containsKey(cat))
			throw new NotFoundException("category not found");
		Map<Integer,Product> pMap = catMap.get(cat);
		
		if(!pMap.containsKey(pid))
			throw new NotFoundException("product id not found");
		Product prod = pMap.get(pid);
		List<String> specList = dao.getProductSpecs(prod.getProdName());
		prod.setSpecList(specList);
		return prod;
	}
}
