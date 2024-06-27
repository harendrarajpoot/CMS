package com.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cms.dto.UserDto;
import com.cms.entities.User;
import com.cms.services.UserServices;

@Controller
@RequestMapping("/auth")
public class AuthController {

	final private static String authfolder = "auth";
	private UserServices userServices;

	public AuthController(UserServices userServices) {
		this.userServices = userServices;
	}

	@GetMapping("/login")
	public String LoginPage() {
		return "auth/login";
	}

	@PostMapping("/login")
	public String loginSubmit() {
		System.out.println("loginSubmit");

		return "auth/login";
	}

	@GetMapping("/forget-password")
	public String forgetPassword() {
		System.out.println("forgetPassword");

		return "auth/forget-password";
	}

	@GetMapping("/registration")
	public String userRegistration(Model model) {
		model.addAttribute("user", new User());
		return authfolder + "/registration";
	}

	@PostMapping(value = "/registration")
	public String userRegistrationSave(Model model, UserDto user) {

		/*
		 * if(result.hasErrors()) {
		 * 
		 * return authfolder+"/registration"; }
		 */
		User existingUser = userServices.findUserByEmail(user.getEmail());
		User saveUser = null;

		if (user.getFname().trim() == null || user.getFname().trim() == "" || user.getFname().trim().isEmpty()) {
			model.addAttribute("name", "Name Can't be Empty");
			return authfolder + "/registration";
		} else if (user.getEmail() == null || user.getEmail() == "" || user.getEmail().isEmpty()) {
			model.addAttribute("error", "Email Can't be Empty");
			return authfolder + "/registration";
		}

		else if (existingUser != null) {
			model.addAttribute("error", "Email Already Exits ");
			return authfolder + "/registration";
		}

		saveUser = userServices.saveUser(user);
		if (saveUser != null) {

			model.addAttribute("saveMsg", "User has been registered successfully");

		}

		return authfolder + "/registration";
	}

}
