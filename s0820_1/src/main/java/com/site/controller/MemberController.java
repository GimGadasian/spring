package com.site.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.dto.Member;
import com.site.service.Mservice;


@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired Mservice mService;
	@GetMapping("/mlist")
	public String mlist(Model model) {
		List<Member> list = mService.selectAll();
		System.out.println("elements amount: "+list.size());
		model.addAttribute("list", list);
		return "/member/mlist";
	}
	
	@GetMapping("/login")
	public String login() {
		return "/member/login";
	}
	
	@PostMapping("/login")
	public String login(Member member, Model model) {
		String id = member.getId();
		String pw = member.getPw();
		Member m = mService.selectLogin(id, pw);
		if(m==null) {
			System.out.println("invalid id or password");
			return "/member/login";
		} else { 
			System.out.println("login successed");
			 model.addAttribute("m", m);
			 return "/member/loginMem";
			}
		
	}
	
	
}

