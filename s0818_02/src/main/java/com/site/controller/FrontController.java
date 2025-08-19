package com.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.service.*;

@Controller
public class FrontController {
	
	@Autowired Mservice mService;
	
	@PostMapping("/doLogin")
	public String doLogin() {
		return "doLogin";	
	}
	
	
	@GetMapping("/")
	public String index() {
		String name = mService.select();
		System.out.println("name1: "+name);
		return "index";
		
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/board")
	public String board() {
		return "board";
	}
	
	@GetMapping("/member")
	public String member() {
		return "member";
		
	}
}
