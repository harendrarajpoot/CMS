package com.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cms.entities.Category;
import com.cms.entities.Post;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

	/*@Query("select u from Category u where u.catId=?1")
	Category findCategoryByCatId(int  catId);*/
	@Query("select u from Category u where u.catName=?1")
	Category findCategoryByCatName(String catName);

	Post findBycatIdAndPostId(String cateName, int postId);
}
