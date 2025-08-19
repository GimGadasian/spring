package com.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.dto.Member;
import com.site.service.MemberService;
import com.site.service.MemberServiceImp;
import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;

//@RestControllerAdvice
@Controller
@RequestMapping("/member")
public class MemberController {

    private final MemberServiceImp memberServiceImp;

    MemberController(MemberServiceImp memberServiceImp) {
        this.memberServiceImp = memberServiceImp;
    }
	
    @GetMapping("/login")
    public String login() {
        return "member/loginForm"; 
    }
    
    @PostMapping("/login")
    public String login(HttpServletRequest request, Model model) {
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String nick = request.getParameter("nick");
    	
    	model.addAttribute("id", id);
    	model.addAttribute("pw", pw);
    	model.addAttribute("nick", nick);
    	
    	return "member/login";
    }
    
     @Autowired MemberService ms;
   
     
    @PostMapping("/signUp")
    public String signUp( Member member, Model model) {
    	model.addAttribute("member", member);
    	// String finTel = member.getFormattedTel();
    	// model.addAttribute("tel", finTel);
    	ms.insertOne(member);
        return "member/signUp";
    }
    
    @GetMapping("/signUp")
    public String signUp() {
    	return "member/signUpForm"; 
    }
    
   
    @GetMapping("/memberView")
    public String mView(Model model) {
    	// MemberServiceImp mServiceImp = new MemberServiceImp();
    	Member member = ms.selectOne();
    	model.addAttribute("member", member);
    	String finTel = member.getFormattedTel();
    	model.addAttribute("tel", finTel);
    	return "member/memberView"; 
    }
    
    @GetMapping("/memberList")
    public String mList(Model model) {
        List<Member> memberList = ms.selectAll();
        model.addAttribute("memberList", memberList);
        return "member/memberList";
    }

//    
//    @PostMapping("/signUp")
//    public String signUp(
//        @RequestParam("name") String name,
//        @RequestParam("age") int age,
//        @RequestParam("id") String id,
//        @RequestParam("pw") String pw,
//        @RequestParam("nick") String nick,
//        @RequestParam("tel") String tel,
//        Model model) {
//
//        model.addAttribute("name", name);
//        model.addAttribute("age", age);
//        model.addAttribute("id", id);
//        model.addAttribute("pw", pw);
//        model.addAttribute("nick", nick);
//        model.addAttribute("tel", tel);
//    	
//    	return "member/signUp";
//    }
}


