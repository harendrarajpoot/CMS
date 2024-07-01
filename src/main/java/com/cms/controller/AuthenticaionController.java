package com.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/authentication")
public class AuthenticaionController {
	
	private final static String authFolder="auth";
	
	@GetMapping("/login")
	public String login()
	{
		return authFolder+"/login";
	}
	
	

}
