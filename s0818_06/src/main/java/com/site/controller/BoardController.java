package com.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.dto.BoardDto;
import com.site.service.BoardServInt;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired BoardServInt boardServ;
	
	@GetMapping("/board")
	public String board(Model model) {
		return "/board/board";
	}
	
	@GetMapping("/view")
	public String view(Model model) {
		BoardDto boardDto = boardServ.getBoardData();
		model.addAttribute("boardDto",boardDto);
		
		return "board/view";
	}
	
}
