package com.cms.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cms.entities.Post;
import com.cms.repository.CategoryRepo;
import com.cms.repository.PostRepo;
import com.cms.services.PostServices;

@Service
public class PostServicesImpl implements PostServices{

@Autowired
PostRepo postRepo;

@Autowired
CategoryRepo categoryRepo;
	
	@Override
	public int savePost(Post post) {
		String title=post.getTitle().trim();
		title=title.replaceAll(" ", "-");
		post.setSlug((title));
		postRepo.save(post);
		return 0;
	}

	@Override
	public void deletePost(int postId) {
		System.out.println("ID-------->"+postId);
		postRepo.deleteById(postId);
		
	}

	@Override
	public int updatePost(Post Post) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public Post getPostByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Post> getAllPost(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getAllPost() {
		
		return postRepo.findAll();
	}

	@Override
	public Optional<Post> getPostByCategoryIdAndPostId(String cateName, int postId) {
		
		return postRepo.findById(postId);
	}

	@Override
	public Optional<Post> getPostByTitle(String title) {
		
		
		return postRepo.findBySlug(title);
	}

	@Override
	public Post getPostById(Integer postId) {
		return postRepo.findById(postId).get();
	}

}
