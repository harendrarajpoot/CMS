package com.cms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.cms.entities.Post;

public interface PostServices {

	public int savePost(Post Post);
	public void deletePost( int postId);
	public int updatePost(Post Post);
	public Page<Post> getAllPost(int page);
	public List<Post> getAllPost();	
	public Post getPostByCategoryId(int catId);	
	public Optional<Post> getPostByCategoryIdAndPostId(String cateName,int catId);
	public Optional<Post> getPostByTitle(String title);
	public Post getPostById(Integer postId);
}
