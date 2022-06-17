package com.example.springbootrestexampleb11;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
   @Autowired
   private IProductService productService;
   
   //mapping the getproduct()method
   
   @GetMapping(value="/product")
   
   public List<Product>getProduct()
   {
	   //find all the products
	   
	   List<Product>products=productService.findAll();
	   
	   return products;
   }
}

