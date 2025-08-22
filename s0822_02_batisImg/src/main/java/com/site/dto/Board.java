package com.site.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {

	private int bno;
	private String btitle;
	private String bcontent;
	private String id;
	
	//답글달기
	private int bgroup; // 답변 그룹
	private int bstep; // 출력 순서
	private int bindent; // 답변 들여쓰기
	
	private String bhit;
	private String bfile;
	private Timestamp bdate;
}
