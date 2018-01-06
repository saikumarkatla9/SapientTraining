package com.sapient.dao;

import java.util.List;
import java.util.Map;

import com.sapient.vo.Product;

public interface IProductDao {

	Map<String,Map<Integer,Product>> getCatNProds();
	Product getProduct(int pid);
	List<String> getProductSpecs(String pname);
	
}
