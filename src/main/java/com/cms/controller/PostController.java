package com.cms.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cms.entities.Category;
import com.cms.entities.Post;
import com.cms.services.CategoryServices;
import com.cms.services.PostServices;

@Controller
@RequestMapping("/post")
public class PostController {

	final private static String postFolder="post";
	private static String redirect="redirect:add-post";
	
	@Autowired
	PostServices postServices;
	
	@Autowired
	CategoryServices categoryServices;
	
	
	
	@GetMapping("/add-post")
	public String showSavePostPage(Model model)
	{
		List<Category> allCatgories = categoryServices.getAllCatgories();
		model.addAttribute("allCatgories",allCatgories);
		
		model.addAttribute("pageAction", "add-post");
		model.addAttribute("pageBtn", "Save");
		model.addAttribute("post", new Post());
		return postFolder+"/add-post";
	}
	
	@PostMapping("/add-post")
	public String savePost(Post post,RedirectAttributes redirectAttributes)
	{
		post.setCreatedAt(new Date());
		post.setUpdatedAt(new Date());
		redirectAttributes.addFlashAttribute("saveMsg", "Post Saved Successfully!");
		String setUrl=post.getTitle();
		setUrl=setUrl.replaceAll(" ", "_");
		post.setUrl(setUrl+".jsp");
		postServices.savePost(post);
		return redirect;
	}
	
	@GetMapping("/list-post")
	public String showAllPost(Model model)
	{
		System.out.println("List Category Page Opened==================>:");
		
		List<Post> allPost = postServices.getAllPost();
		
			System.out.println(allPost);
			model.addAttribute("posts", allPost);
			model.addAttribute("currentPage1", true);
			return postFolder + "/list-post";
	}
	
	
	@PostMapping("/delete-post")
	public String deletePost(HttpServletRequest request,RedirectAttributes redirectAttributes) {
		
		System.out.println("Delete-- HARNEDRA -------------------------------->"+request.getParameter("postId"));
		Integer postId = Integer.parseInt(request.getParameter("postId"));
		postServices.deletePost(postId);
		redirectAttributes.addFlashAttribute("deleteMsg", "Post Deleted Succussfully..");
		System.out.println("After Delete--------------");
		return "redirect:list-post";

	}
	
	@GetMapping("/update-post")
	public String editCategory(HttpServletRequest request, Model model) {
		Integer postId = Integer.parseInt(request.getParameter("postId"));
		Post post = postServices.getPostById(postId);
		System.out.println("Post Harnedra---------->" + post.getCategoryId().getCatName());
		model.addAttribute("post", post);
		model.addAttribute("pageAction", "update-post");
		model.addAttribute("pageBtn", "Update");
		
		return postFolder + "/add-post";
	}
	
	@PostMapping("/update-post")
	public String updateCategory(Post post, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("updateMsg", "Post Updated Successfully..");
		post.setUpdatedAt(new Date());
		//post.setCreatedAt(new Date());
		postServices.savePost(post);

		return "redirect:list-post";
	}
	
	
}
