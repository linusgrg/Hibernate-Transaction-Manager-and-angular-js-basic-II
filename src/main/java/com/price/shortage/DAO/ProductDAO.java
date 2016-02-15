package com.price.shortage.DAO;

import java.util.List;

import com.price.shortage.domain.Product;

public interface ProductDAO {
	public void save(Product product);

	public List<Product> getAllProduct();
	
	public void deleteProduct(Integer id);
	
	public void editProduct(Integer id);
	
	public void updateProduct(Product product);
}
