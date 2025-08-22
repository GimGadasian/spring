package com.site.service;

import java.util.List;

import com.site.dto.Board;

public interface BService { // 미완성 메서드

	// 게시글 전체가져오기
	List<Board> findAll();

	// 게시글 1개
	Board findByBno(int bno);

	// 게시글저장
	void save(Board board);

	// 게시글 삭제
	void delete(int bno);

}
