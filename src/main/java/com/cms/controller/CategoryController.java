package com.cms.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cms.entities.Category;
import com.cms.services.CategoryServices;

@Controller
@RequestMapping("/category")/// localhot:8081/cateogry/add-category
public class CategoryController {

	final private static String cateFoleder = "category";
	Logger log = LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	CategoryServices categoryServices;

	@GetMapping("/add-category")
	public String showCategoryPage(Model model) {
		
		model.addAttribute("pageAction", "add-category");
		model.addAttribute("pageBtn", "Save");
		model.addAttribute("category", new Category());
		return cateFoleder + "/add-category";
	}

	@PostMapping("/add-category")
	public String addCategorySubmitForm(Category categories,RedirectAttributes redirectAttributes) {
		
		log.debug("CategoriesController:addCategorySubmitForm:{}", categories);
		categories.setCreatedAt(new Date());
	
		categoryServices.saveCategory(categories);
		redirectAttributes.addFlashAttribute("saveMsg", "Category Saved Successfully!");
		return "redirect:add-category";
	}

	@GetMapping({ "/list-categories" })
	public String getAllCategories(Model model) {
		log.debug("CategoriesController:getAllCategories:{}", categoryServices.getAllCatgories());
		List<Category> categories = categoryServices.getAllCatgories();
		model.addAttribute("categories", categories);
		model.addAttribute("currentPage1", true);
		return cateFoleder + "/list-categories";
	}

	@PostMapping("/delete-category")
	public String deleteCategory(HttpServletRequest request,RedirectAttributes redirectAttributes) {
		Integer catId = Integer.parseInt(request.getParameter("catId"));
		categoryServices.deleteCategory(catId);
		redirectAttributes.addFlashAttribute("deleteMsg", "Category Deleted Succussfully..");
		return "redirect:list-categories";

	}

	@GetMapping("/update-category")
	public String editCategory(HttpServletRequest request, Model model) {
		Integer catId = Integer.parseInt(request.getParameter("catId"));
		Category category = categoryServices.getCatgoryById(catId);
		System.out.println("category---------->" + category);
		model.addAttribute("category", category);
		model.addAttribute("pageAction", "update-category");
		model.addAttribute("pageBtn", "Update");
		return cateFoleder + "/add-category";
	}
	
	@PostMapping("/update-category")
	public String updateCategory(Category category, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("updateMsg", "Category Updated Successfully..");
		category.setUpdatedAt(new Date());
		categoryServices.saveCategory(category);
		return "redirect:list-categories";
	}
	
	
	@GetMapping("/update-status-category/{catId}")
	public String updateStatusCategory(@PathVariable String catId, HttpServletRequest request) {
		//Integer catId = Integer.parseInt(request.getParameter("catId"));
		//String status = request.getParameter("");
		System.out.println("------------delete-categories----------->" + catId);
		//categoryServices.deleteCategory(catId);
		//return "redirect:list-categories";
		return cateFoleder + "/list-categories";
	}
}
