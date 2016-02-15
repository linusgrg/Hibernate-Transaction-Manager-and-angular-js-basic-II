package com.price.shortage.DAO.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.price.shortage.DAO.ProductDAO;
import com.price.shortage.domain.Product;

@Repository
public class ProductDAOImp implements ProductDAO {

	@PersistenceContext
	EntityManager em;

	@Override
	public void save(Product product) {

		
	       em.persist(product);
	        
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return em.createQuery("from Product").getResultList();
		
	}

	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		Product product = em.getReference(Product.class, id);
		em.remove(product);
	}

	@Override
	public void editProduct(Integer id) {
		Product product = em.getReference(Product.class, id);
		em.persist(product);
		
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		em.merge(product);
		
	}
	
	

}
