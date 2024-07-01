package com.cms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cms.entities.Category;
import com.cms.entities.Post;
import com.cms.services.CategoryServices;
import com.cms.services.PostServices;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	CategoryServices categoryServices;
	
	@Autowired
	PostServices postServices;
	

	
	@ModelAttribute
	public void  getCategoryCommon( Model model)
	{
		model.addAttribute("categories", categoryServices.getAllCatgories());
		model.addAttribute("title", "Best Programmer");
	}

	@GetMapping({ "/", "/index"})
	public String HomePage(Model model) {
	model.addAttribute("allPost", postServices.getAllPost());
			return "content/home";
	}
	
	@GetMapping({"{catName}"})
	public String showPostByCategory(@PathVariable("catName") String catName ,Model model)
	{
	
	Category category = categoryServices.getCategoryByName(catName);
	//category.getPostId().forEach(postId->postId.getSlug());
	
	if(category.getPostId()!=null&& !category.getPostId().isEmpty())
	{
		model.addAttribute("postByCategory", category.getPostId());
		model.addAttribute("category", category.getCatName());
		}
	else
	{
		model.addAttribute("postNotFoundByCategory","There is no post relate to this Category");
	}
		
		return  "content/home";
	}
	
	@RequestMapping(value={"{catName}/{title}"} ,method=RequestMethod.GET)
	public String showPostByCategoryAndId(
			@PathVariable("catName")String catName ,
			@PathVariable("title") String title, 
			Model model)
	{
		
		
		System.out.println("=======================================Harendra");
		
		Optional<Post> post = postServices.getPostByTitle(title);
		
		
	//Optional<Post> post = postServices.getPostByCategoryIdAndPostId(catName,postId);
	Category category = categoryServices.getCategoryByName(catName);
	
	if(post.isPresent()){
			model.addAttribute("content",post.get().getContents());
			model.addAttribute("title",post.get().getTitle());
			model.addAttribute("updateDate",post.get().getUpdatedAt().toLocaleString());
			model.addAttribute("category", category.getCatName());
			model.addAttribute("postByCategoryAndPostId", category.getPostId());
			
		}
		//model.addAttribute("category", category.getCatName());
		
	
	else
	{
		model.addAttribute("postNotFoundByCategory","There is no post relate to this Category");
	}
	
		
		return "content/home";
	}

	
	@GetMapping("/about")
	public String about()
	{
		return "content/about";
	}
	
	
}
