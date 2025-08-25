package com.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dao.BoardMapper;
import com.site.dto.Board;

@Service
public class BserviceImpl implements Bservice{
	@Autowired BoardMapper bm;
	
	@Override
	public List<Board> findAll() {
		List<Board> list = bm.findAll();
		
		return list;
	}

	@Override
	public Board findByBno(int bno) {
		Board board = bm.findByBno(bno);
		return board;
	}

	@Override
	public void save(Board b) {
		// TODO Auto-generated method stub
		System.out.println("BserviceImpl 데이터 : "+b.getBfile());
		bm.save(b);
	}

	@Override
	public void delete(int bno) {
		// TODO Auto-generated method stub
		bm.delete(bno);
		
	}

	@Override
	public void update(Board b) {
		// TODO Auto-generated method stub
		bm.update(b);
	}

	@Override
	public List<Board> findByCaAndSword(String category, String sWord) {
		List<Board> list = bm.findByCaAndSword(category, sWord);
		return list;
	}
	
}
