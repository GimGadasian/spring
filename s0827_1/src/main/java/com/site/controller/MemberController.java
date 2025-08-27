package com.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String login(RedirectAttributes redirect,  Member m, Model model) {

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
			redirect.addFlashAttribute("flag", 1);
			session.setAttribute("session_id", member.getId());
			session.setAttribute("session_name", member.getName());
			url = "redirect:/";
		} else {
			System.out.println("invalid id or password");
			url = "member/login";
		}
		
		return url;
	}
	
	@GetMapping("logout")
	public String logout(RedirectAttributes redirect) {
		redirect.addFlashAttribute("flag", -1);
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("insert01")
	public String insert01(RedirectAttributes redirect) {
		return "/member/insert01";
	}
	@GetMapping("insert02")
	public String insert02(RedirectAttributes redirect) {
		return "/member/insert02";
	}
	
	//ajax -> json데이터 전송
		@ResponseBody
		@PostMapping("/idBtn") // 중복id확인
		public Member idBtn(Member m) {
			System.out.println("controller id : "+m.getId());
			// findById(m.getId) -> service,serviceImpl,repository
			Member member = ms.findById(m.getId());
				
//			String flag = "";
//			if(member.getId() != null) {
//				flag = "-1"; //아이디 사용불가
//			}else {
//				flag = "1";  // 아이디 사용가능
//			}
			
			return member;
		}
}
