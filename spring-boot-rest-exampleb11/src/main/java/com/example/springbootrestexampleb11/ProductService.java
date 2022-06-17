package com.example.springbootrestexampleb11;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{

	@Override
	public List<Product> findAll() {
		
		//creating an object of arraylist
		
		ArrayList<Product>products=new ArrayList<>();
		
		//adding products to the list
		
		products.add(new Product(100,"mobile1","motoe1",10000.00,6));
		products.add(new Product(101,"mobile2","motoe2",20000.00,10));
		products.add(new Product(102,"mobile3","motoe3",30000.00,16));
		
		return products;
		
	}

}
