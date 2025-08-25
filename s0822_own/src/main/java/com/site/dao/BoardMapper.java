package com.site.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.site.dto.Board;

@Mapper
public interface BoardMapper {

	List<Board> findAll();

	Board findByBno(int bno);

	void save(Board b);

	void delete(int bno);

	void update(Board b);

	List<Board> findByCaAndSword(@Param("category") String category, @Param("sWord") String sWord);

	

}
