package com.xyz.springbootrestexamplebatch3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private IProductService productService;
	
	//Mapping the getProducts()methods to product
	
	@GetMapping(value="/product")
	public List<Product>getProduct()
	{
		//find all the Products
		
		List<Product>products=productService.findAll();
		
		return products;
	}
	
}
