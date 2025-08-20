package com.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.site.service.MemServInt;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Memcontroller {
	@Autowired MemServInt ms;
	
	@GetMapping("/member/login") // get
	public String login() {
		return "/member/login";
	}
	
	@PostMapping("/member/login") // post
	public String login(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("nick", nick);
		return "/member/loginRes";
	}
}
