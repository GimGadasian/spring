package com.site.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.site.dto.Board;
import com.site.service.Bservice;



@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired Bservice bs;
	
	@GetMapping("blist")
	public String blist(Model model) {
		List<Board> list = bs.findAll();
		model.addAttribute("list", list);
		return "/board/blist";
	}
	
	@GetMapping("/bview")
	public String bview(Board b, Model model) {
		int bno = b.getBno();
		Board board = bs.findByBno(bno);
		model.addAttribute("board",board);
		return "/board/bview";
	}
	
	@GetMapping("/bwrite")
	public String bwrite() {
		return "/board/bwrite";
	}
	
	@PostMapping("/bwrite") //게시글 글쓰기저장
	public String bwrite(Board b,@RequestPart("files") MultipartFile file ) {
		b.setBfile("1.jpg"); //null경우 에러가 나서, 빈공백을 추가
		System.out.println("제목 : "+b.getBtitle());
		System.out.println("내용 : "+b.getBcontent());
		//파일첨부가 되어 있어야 진행
		if(!file.isEmpty()) {
			// 원본파일이름 가져오기
			String originFileName = file.getOriginalFilename();
			// 동일이름이 생기지 않도록 시간을 이름에 추가
			long time = System.currentTimeMillis();
			// 1.jpg -> 48459848493939_1.jpg
			String uploadName = String.format("%d_%s", time,originFileName);
			System.out.println("파일이름 : "+uploadName);
			// 파일저장위치
			String fileLocation = "d:/upload/";
			File f = new File(fileLocation+uploadName); //c:upload/48459848493939_1.jpg 
			b.setBfile(uploadName); //board객체의 bfile 이름추가
			try { file.transferTo(f); //파일업로드 진행
			} catch (Exception e) { e.printStackTrace(); } 
		}
		// 파일첨부가 없으면 글만 저장
		bs.save(b);
		return "redirect:/board/blist?flag=1";
	}
	
	@GetMapping("/bdelete")
	public String bdelete(@RequestParam(name="bno",defaultValue="0") int bno) {
		bs.delete(bno);
		return "redirect:/board/blist?flag=-1";
	}
	
	@GetMapping("/bupdate")
	public String bupdate(Board b, Model model) {
		int bno = b.getBno();
		Board board = bs.findByBno(bno);
		model.addAttribute("board", board);
		return "board/bupdate";
	}
	
	@PostMapping("/bupdate")
	public String bupdate(Board b, @RequestParam("bfile2") String bfile2, Model model) {
		// 첨부된 파일이 없으면 기존 첨부된 파일을 업데이트 함.
		if(b.getBfile() == "") {
			b.setBfile(bfile2);
		}	
		bs.update(b);
		return "redirect:/board/blist?flag=2";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("category") String category, @RequestParam("sWord") String sWord, Model model) {
		List<Board> list = bs.findByCaAndSword(category, sWord);
		model.addAttribute("list", list);
		System.out.println(category);
		System.out.println(sWord);
		return "board/blist";
	}

}
