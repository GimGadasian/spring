package com.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/num")
public class NumController {
	@GetMapping("/numResult")
	public String numResult() {
		return "num/numInput";
	}
	
	@PostMapping("/numResult")
	public String numInput(
	    @RequestParam("name") String name,
	    @RequestParam("kor") int kor,
	    @RequestParam("eng") int eng,
	    @RequestParam("math") int math,
	    Model model) {

	    int total = kor + eng + math;
	    float avr = total / 3f;

	    model.addAttribute("name", name);
	    model.addAttribute("kor", kor);
	    model.addAttribute("eng", eng);
	    model.addAttribute("math", math);
	    model.addAttribute("total", total);
	    model.addAttribute("avr", avr);

	    return "num/numResult";
	}
}