package com.soft.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.soft.model.Product;

public interface ProductService {
	
	public HashMap<String,Object> addNewProductService(Product product);
	
	public HashMap<String,Object> getAllProductService();
	
	public List<Product> getAllProduct();
	
	public HashMap<String, Object> deleteProductById(int pid);
	
	public HashMap<String,Object> deleteProductHashSevice(int pid);
	
	public HashMap<String, Object> updateProductById(Product product, int pid);
   
	public Product findByidService(int pid);

}
