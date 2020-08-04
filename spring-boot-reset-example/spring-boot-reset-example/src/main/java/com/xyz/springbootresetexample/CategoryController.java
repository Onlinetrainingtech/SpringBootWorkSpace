package com.xyz.springbootresetexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

	
	@Autowired
	private ICategoryService categoryServices;
	
	
	@GetMapping(value="/category")
	
	public List<Category>getCategory()
	{
		List<Category>categorys=categoryServices.viewAll();
		
		return categorys;
	}
}
