package com.cms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.entities.Post;

public interface PostRepo extends JpaRepository<Post, Integer>{

	Optional<Post> findBySlug(String slug);

//	@Query("select p from Post p join Category cat on cat.catId=p.postId where p.categoryId=?1")
//	public Post getPostByCategoryId(int categoryId);
}
