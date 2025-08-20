package com.site.service;

import java.sql.Date;

import org.springframework.stereotype.Service;

import com.site.dto.BoardDto;

@Service
public class BoardServ {
	public BoardDto getBoardData() {
		BoardDto boardDto = new BoardDto(
		        1, 
		        "sleepy monday", 
		        "meg", 
		        "today is a sleepy day, very very sleepy day.", 
		        0, 
		        0,
		        0,
		        0,
		        Date.valueOf("2025-08-18"),
		        ""
		        );
		return boardDto;
	} 
}

	