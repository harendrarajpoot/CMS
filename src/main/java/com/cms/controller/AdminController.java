package com.cms.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth/admin")
public class AdminController {

	
	private final static String adminFolder="admin";
	
	@GetMapping({"/login"})
	public String adminPage()
	{		
		
		return "redirect:dashboard";
	}
	
	@GetMapping({"/dashboard"})
	public String dashboard( Principal principal ,Model model)
	{
		
		
		model.addAttribute("username", principal.getName().toUpperCase());
		
		return adminFolder+"/dashboard";
	}
	
	@GetMapping("/profile")
	public String profilePage()
	{
		return adminFolder+"/profile";
	}
	
}
