package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.dto.Board;
import com.java.dto.Member;

//@Repository //생략가능 <Board,Integer> <리턴객체타입,객체Primary Key>
public interface CustomerRepository extends JpaRepository<Board, Integer> {
	
	Object findByBno(int bno);
	
}
