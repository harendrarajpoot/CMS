package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cms.entities.MainMenu;
import com.cms.services.MainMenuService;

@Controller
@RequestMapping("/menu")
public class MainMenuController {
	@Autowired
	private MainMenuService mainMenuService;

	@ModelAttribute
	public void addAttributes(Model model) {
		model.addAttribute("msg", "Welcome to BestProgammer!");
	}

	@GetMapping("/add-menu")
	public String addMainMenu(Model model) {
		List<MainMenu> findAllMenu = mainMenuService.getAllMainMenu();
		model.addAttribute("menus", findAllMenu);
		return "menu/add-menu";
	}

	@PostMapping("/save-menu")
	public String saveMainMenu(@ModelAttribute("") MainMenu mainMenu) {
		mainMenuService.saveMenu(mainMenu);
		return "redirect:/add-main-menu";
	}
}
