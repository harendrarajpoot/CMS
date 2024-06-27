package com.cms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sub-category")
public class SubCategoryController {

	
	@GetMapping("/add")
	public String addSubCategory()
	{
		System.out.println("Executing Subcatgory Method...");
		return "";
	}
}
