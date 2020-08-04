package com.xyz.springbootresetexample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService 
{

	@Override
	public List<Product> findAll() {
		
		//Creating an object of ArrayList
		
		ArrayList<Product>products=new ArrayList<>();
		
		//adding products to the list
		
		products.add(new Product(100,"mobile1","motoe4",1000.00,6));
		products.add(new Product(101,"mobile2","motoe5",2000.00,6));
		products.add(new Product(102,"mobile3","motoe6",3000.00,6));
		
		//return a list of product
		return products;
	}

}
