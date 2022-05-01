package com.example.springbootrestexampleb8;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product>products=new ArrayList<>();
		
		products.add(new Product(100,"mobile1","motoe1",1000.00,6));
		products.add(new Product(101,"mobile2","motoe2",2000.00,6));
		products.add(new Product(102,"mobile3","motoe3",3000.00,6));
		
		return products;
	}
  
}
