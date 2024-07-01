package com.cms.controller;



	

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cms.dto.UserDto;
import com.cms.entities.User;
import com.cms.services.UserServices;

@Controller
@RequestMapping("/auth/user")

public class UserController {
	final private static String userfolder = "user";
	private UserServices userServices;

	public UserController(UserServices userServices) {
		this.userServices = userServices;
	}

	@GetMapping("/login")
	public String LoginPage() {
		
		return "redirect:dashboard";
	}
	@GetMapping("/dashboard")
	public String dashboard(Principal principal,Model model) {
		
		model.addAttribute("username", principal.getName().toUpperCase());
		return userfolder+"/user-dashboard";
	}
	
	@GetMapping("/profile")
	public String profile() {
		System.out.println("USER PROFILE PAGE--------------");
		return userfolder+"/profile";
	}

	@GetMapping("/forget-password")
	public String forgetPassword() {
		System.out.println("forgetPassword");

		return "auth/forget-password";
	}

	@GetMapping("/registration")
	public String userRegistration(Model model) {
		model.addAttribute("user", new User());
		return userfolder + "/registration";
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
			return userfolder + "/registration";
		} else if (user.getEmail() == null || user.getEmail() == "" || user.getEmail().isEmpty()) {
			model.addAttribute("error", "Email Can't be Empty");
			return userfolder + "/registration";
		}

		else if (existingUser != null) {
			model.addAttribute("error", "Email Already Exits ");
			return userfolder + "/registration";
		}

		saveUser = userServices.saveUser(user);
		if (saveUser != null) {

			model.addAttribute("saveMsg", "User has been registered successfully");

		}

		return userfolder + "/registration";
	}


}
