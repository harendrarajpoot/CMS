package com.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/submenu")
public class SubMenuController {

	
	@GetMapping("/add-sub-menu")
	public String addMainMenu()
	{
		return "menu/add-sub-menu";
	}
}
