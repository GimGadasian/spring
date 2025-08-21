package com.site.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.dto.Member;
import com.site.service.Mservice;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired Mservice mService;
	@GetMapping("/mlist")
	public String mlist(Model model) {
		List<Member> list = mService.selectAll();
		//System.out.println("elements amount: "+list.size());
		model.addAttribute("list", list);
		return "/member/mlist";
	}
	
	@GetMapping("/mview")
	public String mview(
			@RequestParam(name="id",defaultValue = "aaa") String id,
			Model model) {
		Member member = mService.findAndId(id);
		model.addAttribute("member",member);
		return "member/mview";
	}
	
	@GetMapping("/login")
	public String login(@RequestParam(name="flag", required = false) String flag, Model model) {
		model.addAttribute("flag", flag);
		return "/member/login";
	}
	
	@PostMapping("/login")
	public String login(Member member, Model model, HttpSession session) {
		String id = member.getId();
		String pw = member.getPw();
		Member m = mService.selectLogin(id, pw);
		if(m==null) {
			System.out.println("invalid id or password");
			
			return "redirect:/member/login?flag=-1";
		} else { 
			System.out.println("login successed");
			 model.addAttribute("m", m);
			 session.setAttribute("session_id", m.getId());
			 session.setAttribute("session_name", m.getName());
			 return "/member/loginMem";
			}
		
	}
	
	@GetMapping("/logout")
	public String logout(@RequestParam(name="flag", required = false) String flag, Model model, HttpSession session) {
		model.addAttribute("flag", flag);
		session.invalidate();
		return "redirect:/?flag=2";
	}
	
	@GetMapping("/signUp")
	public String signUp() {
		return "/member/signUp";
	}
	
	@PostMapping("/signUp")
	public String signUp(Member member, Model model) {
		 mService.addMem(member);
		 model.addAttribute("m", member);
		 return "/member/loginMem";
		}
}

