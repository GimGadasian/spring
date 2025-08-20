package com.site.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.dto.Member;
import com.site.service.MemberServInt;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	/**
	 * @return
	 */
	@Autowired MemberServInt ms;
	
	@GetMapping("/memList")
	public String mList(Model model) {
		List<Member> mList = ms.getAllMem();
		model.addAttribute("mList", mList);
		return "/member/memList";
	}
	
	
	@GetMapping("/signUp")
	public String signUp() {
		return "/member/signUp";
	}
	
	@PostMapping("/signUp")
	public String signUp(Member member, Model model) {
		ms.addMem(member);
		model.addAttribute("mem", member);
		return "/member/signUpDone";
	}
	
	
}
