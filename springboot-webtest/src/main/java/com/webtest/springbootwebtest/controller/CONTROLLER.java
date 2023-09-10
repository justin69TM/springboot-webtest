package com.webtest.springbootwebtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CONTROLLER {

	@GetMapping("/")
	public String index(){
		return "index";
	}
	
}
