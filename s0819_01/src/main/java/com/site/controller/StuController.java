package com.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.dto.Score;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student")
public class StuController {
	@GetMapping("/score")
	public String score() {
		return "student/stuInput";
	}
	
	@PostMapping("/score")
	public String stuInput(Score score, Model model) {
	    score.calculate(); // avr, total calc

	    model.addAttribute("score", score); // 객체를 모델로 통째로 넘기기
	    return "student/score";
	}

	
//	@PostMapping("/score")
//	public String stuInput(HttpServletRequest request, Model model) {
//		String no = request.getParameter("no");
//		String name = request.getParameter("name");
//		String kor = request.getParameter("kor");
//		String eng = request.getParameter("eng");
//		String math = request.getParameter("math");
//		
//		int total = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
//		float avr = total/3f;
//		
//		model.addAttribute("no", no);
//		model.addAttribute("name", name);
//		model.addAttribute("kor", kor);
//		model.addAttribute("eng", eng);
//		model.addAttribute("math", math);
//		model.addAttribute("total", total);
//		model.addAttribute("avr", avr);
//		
//		return "student/score";
//	}
}
