package com.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.dto.Member;
import com.site.service.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired MemberService ms;
	@Autowired HttpSession session;
	
	@GetMapping("/login")
	public String login() {
		return "/member/login";
	}
	
	@PostMapping("/login")
	public String login(Member m, Model model) {
		System.out.println("id: "+m.getId());
		System.out.println("pw: "+m.getPw());
		// jpa로 전달
		// id있는지 체크
		//Member member = ms.findById(m.getId());
		//System.out.println("member: "+member);
		
		// id&pw로 찾기
		String url = "";
		Member member = ms.findByIdAndPw(m.getId(), m.getPw());
		if (member.getId() != null) {
			System.out.println("member: "+member);
			url = "redirect:/?flag=1";
		} else {
			System.out.println("invalid id or password");
			url = "member/login";
		}
		
		return url;
		
	}
}
