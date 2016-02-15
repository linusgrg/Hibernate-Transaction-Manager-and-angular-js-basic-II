package com.price.shortage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.price.shortage.DAO.ProductDAO;
import com.price.shortage.domain.Product;
import com.price.shortage.service.ProductService;

@Service
@Transactional
public class ProductServiceImp implements ProductService{

	
	@Autowired
	ProductDAO productDAO;
	
	@Override
	public void saveProduct(Product product) {
		
		productDAO.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDAO.getAllProduct();
	}

	@Override
	public void deleteProductService(Integer id) {
		// TODO Auto-generated method stub
		productDAO.deleteProduct(id);
	}

	@Override
	public void editProductService(Integer id) {
		productDAO.editProduct(id);
		
	}

	@Override
	public void updateProduct(Product product) {
		productDAO.updateProduct(product);
		
	}

	

}
