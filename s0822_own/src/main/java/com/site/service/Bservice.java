package com.site.service;

import java.util.List;

import com.site.dto.Board;

public interface Bservice {

	List<Board> findAll();

	Board findByBno(int bno);

	void save(Board b);

	void delete(int bno);

	void update(Board b);

	List<Board> findByCaAndSword(String category, String sWord);

	

}
