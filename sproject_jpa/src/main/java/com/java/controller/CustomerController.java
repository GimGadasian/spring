package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.java.dto.Board;
import com.java.dto.Member;
import com.java.service.CustomerService;
import com.java.service.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class CustomerController {

	@Autowired CustomerService customerService;
	@Autowired HttpSession session;
	@Autowired MemberService memberService;
	
	@GetMapping("/customer/view") //상세페이지 열기
	public String view(@RequestParam("bno") int bno, Model model) {
		System.out.println("controller bno : "+bno);
		Board board = customerService.findByBno(bno);
		model.addAttribute("board",board);
		return "customer/view";
	}
	
	
	@GetMapping("/customer/list") //게시판리스트
	public String list(Model model) {
		//List<Board> controller -> service -> serviceImpl -> Jpa
		// 정렬
		Sort sort = Sort.by(
			Sort.Order.desc("bgroup"),Sort.Order.asc("bstep")
		);
		
		//게시글 전체가져오기
		List<Board> list = customerService.findAll(sort);
		System.out.println("list 개수 : "+list.size());
		model.addAttribute("list",list);
		return "customer/list";
	}
	
	@GetMapping("/customer/delete")
	public String delete(RedirectAttributes redirect, Board b) {
	    String sessionId = (String) session.getAttribute("session_id");
	    Board board = customerService.findByBno(b.getBno());

	    if (sessionId != null && sessionId.equals(board.getMember().getId())) {
	        customerService.deleteById(b.getBno());
	        redirect.addFlashAttribute("flag", "-1"); // 삭제 성공
	    } else {
	        redirect.addFlashAttribute("flag", "0"); // 권한 없음
	    }

	    return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/write")
	public String write() {
		return "customer/write";
	}
	
	@PostMapping("/customer/write") //글쓰기 저장
	public String write( Board b,RedirectAttributes redirect ) {
		System.out.println("b title : "+b.getBtitle());
		System.out.println("b content : "+b.getBcontent());
		//System.out.println("b member id : "+b.getMember().getId());
	    String id = (String) session.getAttribute("session_id");
	    Member member = memberService.findById(id);
	    b.setMember(member); //글쓰기가 가능함. - member객체가 아니면 글쓰기가 안됨.
	    customerService.save(b);
	    redirect.addFlashAttribute("flag", "1");
		
		return "redirect:/customer/list";
	}
	
	
}