package com.soft.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.model.Product;
import com.soft.repositary.ProductRepositary;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepositary productRepositary;

	@Override
	public HashMap<String, Object> addNewProductService(Product product) {

		HashMap<String, Object> serviceResponse = new HashMap<>();
		try {
			Product savedProduct = productRepositary.save(product);
			if (savedProduct != null) {

				serviceResponse.put("Massage", "Product Added Sucessfully..!");
				serviceResponse.put("status", true);
				serviceResponse.put("SavedProductData", savedProduct);
			} else {
				serviceResponse.put("Massage", "Product Not Added Sucessfully..!");
				serviceResponse.put("status", false);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return serviceResponse;
	}

	@Override
	public HashMap<String, Object> getAllProductService() {

		HashMap<String, Object> serviceResponse = new HashMap<>();
		try {
			List<Product> getAllproduct = productRepositary.findAll();

			if (getAllproduct != null) {
				serviceResponse.put("Massage", "getAllProduct Sucessfully..!");
				serviceResponse.put("status", true);
				serviceResponse.put("getAllProductData",getAllproduct);
			} else {
				serviceResponse.put("Massage", " getAllProduct Not Sucessfully..!");
				serviceResponse.put("status", false);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return serviceResponse;
	}
//===============================ORRRRRR=======================================
	@Override
	public List<Product> getAllProduct() {
		
		return productRepositary.findAll();
	}

	@Override
	public HashMap<String, Object>  deleteProductById(int pid) {
		HashMap<String, Object> response = new HashMap<>();
		
		if(productRepositary.existsById(pid)) {
			productRepositary.deleteById(pid);
			response.put("message", "Product deleted...!");
			response.put("status", true);
		}else {
			response.put("message", "Product not deleted...!");
			response.put("status", false);
			
		}
		return response;
		
	}

	@Override
	public HashMap<String, Object> deleteProductHashSevice(int pid) {
		HashMap<String,Object> serviceResponse=new HashMap<>();
		
		try {
			if(productRepositary.existsById(pid)) {
				productRepositary.deleteById(pid);
				serviceResponse.put("Message","Product Delete SucessFully..!");
				serviceResponse.put("status",true);
				
			}else {
				serviceResponse.put("Message","Product NOT Delete SucessFully..!");
				serviceResponse.put("status",false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return serviceResponse;
	}
	
	@Override
	public HashMap<String, Object> updateProductById(Product product, int pid) {
		
		HashMap<String, Object> response = new HashMap<>();
		Optional<Product> checkProduct = productRepositary.findById(pid);
		if(checkProduct.isPresent()) {
			
			Product updatedProdcut = checkProduct.get();
			updatedProdcut.setPname(product.getPname());
			updatedProdcut.setPqty(product.getPqty());
			updatedProdcut.setPrice(product.getPrice());
			
			response.put("Updateddata::", productRepositary.save(updatedProdcut));
			response.put("message", "Product updated sucessfull...");
			response.put("status", true);
			
			
		}else {
			response.put("message", "Product not updated please check pid...");
			response.put("status", false);
			
		}
			
		return response;
	}
	@Override
	public Product findByidService(int pid) {
		Optional<Product> checkProduct = productRepositary.findById(pid);
		Product product = null;
		if(checkProduct.isPresent()) {
			product = checkProduct.get();
		}else {
			product = null;
		}
		return product;
	}
}

	
