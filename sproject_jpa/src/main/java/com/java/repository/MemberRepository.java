package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.dto.Member;

public interface MemberRepository extends JpaRepository<Member, String>{
	// findById, findAll, save, deleteById: 메서드 자동 생성, 정의 불필요
	// 메서드 정의 필요
	// pageable: 자동 페이징 처리
	// sort: 자동 정렬
	Member findByIdAndPw(String id, String pw);
}
