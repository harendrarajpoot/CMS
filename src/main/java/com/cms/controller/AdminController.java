package com.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	
	private final static String authFolder="auth";
	
	@GetMapping({"/login"})
	public String adminPage()
	{
		return "index";
	}
	
	@GetMapping({"/profile"})
	public String profilePage()
	{
		return authFolder+"/profile";
	}
	
}
