package com.cms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.cms.entities.Category;
import com.cms.entities.Post;


public interface CategoryServices {

	public int saveCategory(Category Category);
	public void deleteCategory( int catId);
	public int updateCategory(Category Category);
	public Page<Category> getAllCatgory(int page);
	public List<Category> getAllCatgories();	
	public Category getCatgoryById(int catId);	
	public Category getCategoryByName(String catName);
	
	
}
