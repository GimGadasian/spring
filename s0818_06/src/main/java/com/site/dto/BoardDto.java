package com.site.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardDto {
	private int bno;
	private String btitle;
	private String bwriter;
	private String bcontent;
	private int bgroup;
	private int bstep;
	private int bindent;
	private int bhit;
	private Date bdate;
	private String bfile;
	
	BoardDto() {}
	BoardDto(int bno, String btitle, String bwriter, String bcontent, int bhit, Date bdate) {
		this.bno = bno;
		this.btitle = btitle;
		this.bwriter = bwriter;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bhit = bhit;
	}
}
