package com.cms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.cms.entities.Category;
import com.cms.entities.Post;
import com.cms.repository.CategoryRepo;
import com.cms.services.CategoryServices;

@Service
public class CategoryServicesImpl implements CategoryServices{

	@Autowired
	CategoryRepo categoryRepo;
	
	
	public CategoryServicesImpl() {
		System.out.println("Category Instance created");
	}

	@Override
	public int saveCategory(Category category) {
		categoryRepo.save(category);
		return 0;
	}

	@Override
	public void deleteCategory(int catId) {
		categoryRepo.deleteById(catId);
		
	}

	@Override
	public int updateCategory(Category Category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Category> getAllCatgories() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public Page<Category> getAllCatgory(int page) {
		// find sorting by name
		/*List<Categories> findAll = categoriesRepo.findAll(Sort.by("catName"));
		System.out.println(findAll);*/
		
		//Sort sort=Sort.by(Sort.Direction.ASC, "catName");
		/*Pageable pageable = PageRequest.of(0, 4);
		Page<Categories> page = categoriesRepo.findAll(pageable);*/
		return categoryRepo.findAll(PageRequest.of(page, 3));
	}

	@Override
	public Category getCatgoryById(int catId) {
		return categoryRepo.findById(catId).get();
		//return categoryRepo.findCategoryByCatId(catId);
	}

	@Override
	public Category getCategoryByName(String catName) {
		
		return categoryRepo.findCategoryByCatName(catName);
	}

	
	


}
