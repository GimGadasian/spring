package com.site.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.site.dto.Board;

@Mapper
public interface BoardMapper { // 미완성 메서드

	//게시글 전체가져오기
	List<Board> findAll();

	//게시글 1개
	Board findByBno(int bno);

	//게시글저장
	void save(Board board);

	void delete(int bno);

}
