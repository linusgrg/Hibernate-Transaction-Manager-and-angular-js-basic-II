package com.price.shortage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.price.shortage.domain.Product;
import com.price.shortage.service.ProductService;


@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product(Product product) {
		System.out.println("hello change in master");
		return "product";
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	@ResponseBody
	public Product save(@RequestBody Product product) {
		System.out.println("change on different place");
		productService.saveProduct(product);
		
		return product;
	}
	
	@RequestMapping(value="/displayInfo")
	@ResponseBody 
	public List<Product> displayList(){
		System.out.println("list all the product");
		return productService.getAllProduct();
		
	}
	
	@RequestMapping(value = "/display")
    public String display(){
		
        return "display"; 
    }
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	@ResponseBody
	public boolean deleteProduct(Product product,@PathVariable("id") Integer id){
		
		productService.deleteProductService(id);
		return true;
		
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Product saveEditedProduct(Product product, @PathVariable("id") Integer id) {
		return product;

	}
	@RequestMapping(value = "/product", method = RequestMethod.PUT)
	@ResponseBody
	public Product update(@RequestBody Product product) {
		System.out.println("hello");
		productService.updateProduct(product);
		System.out.println("hello");
		return product;
	}
	
	
//method done in master
	@RequestMapping(value = "/product1", method = RequestMethod.PUT)
	@ResponseBody
	public Product update1(@RequestBody Product product) {
		System.out.println("hello1");
		productService.updateProduct(product);
		System.out.println("hello1");
		return product;
	}
}
