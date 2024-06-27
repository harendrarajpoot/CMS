package com.cms.restcontroller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@GetMapping("/home")
	public ResponseEntity<List<String>> Home()
	{
		List<String> list = Arrays.asList("One","Two","Three","four");
		List<String> collect = list.stream().map(m->m.toUpperCase()).collect(Collectors.toList());
		return new ResponseEntity<List<String>>(collect,HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/komal")
	public String  heyKomoal()
	{
		return "Welcome Komal";
	}
}
