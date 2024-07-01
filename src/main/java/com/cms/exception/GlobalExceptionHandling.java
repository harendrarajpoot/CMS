package com.cms.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class GlobalExceptionHandling  {
/*
	@ExceptionHandler(value=NullPointerException.class)
	public String nullPointException(Model model)
	{
		model.addAttribute("error", "Something Went Wrong");
		
		return "error/error";
	}*/
	
	/*@ExceptionHandler(value=ArithmeticException.class)
	public String airthmeticException(Model model)
	{
		model.addAttribute("error", "Something Went Wrong");
		
		return "error/404";
	}*/
	
	
}
