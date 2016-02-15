package com.price.shortage.service;

import java.util.List;

import com.price.shortage.domain.Product;

public interface ProductService {
	public void saveProduct(Product produt);
	public List<Product> getAllProduct();
	public void deleteProductService(Integer id);
	
	public void editProductService(Integer id);
	public void updateProduct(Product produt);
	
}
