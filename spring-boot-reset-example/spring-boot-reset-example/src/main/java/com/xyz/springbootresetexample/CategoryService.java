package com.xyz.springbootresetexample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService
{

	@Override
	public List<Category> viewAll() {
		
		ArrayList<Category>catgorys=new ArrayList<>();
		
		//adding the category list
		
		catgorys.add(new Category(201,"tv"));
		catgorys.add(new Category(202,"mobiles"));
		
		return catgorys;
	}

}
