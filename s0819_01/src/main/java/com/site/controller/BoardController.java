package com.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BoardController {
	@GetMapping("/board/list/{page}")
	public String list(HttpServletRequest request, @PathVariable("page") int page, Model model) {
		model.addAttribute("page", page);
		return "board/list";
	}
	
	@GetMapping("/board/board/default")
	public String listDef(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
		model.addAttribute("page", page);
		return "board/list";
	}
	
	@GetMapping("/board/board")
	public String list(@RequestParam("page") int page, Model model) {
	    model.addAttribute("page", page);
	    return "board/list";
	}
}
