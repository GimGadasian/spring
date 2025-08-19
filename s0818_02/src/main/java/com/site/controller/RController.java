package com.site.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

	@GetMapping("rest")
	public String restpage() {
		return "hello world!";
	}
}
