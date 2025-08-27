package com.site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dto.Member;
import com.site.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired MemberRepository mr;
	@Override
	public Member findById(String id) {
		// get(): 데이터를 검색하지 못했을 시 에러 발생
		//orElseGet(): 에러 시 빈 객체를 생성하여 전달
		//orElseThrow(): 에러 처리 신행 -> 에러 코드 리턴
		
		//Member member = mr.findById(id).get();
		Member member = mr.findById(id).orElseGet(
				()-> {return new Member();}
				);
//		Member member = mr.findById(id).orElseThrow(
//				()-> {return new IllegalArgumentException();}
//				);
		return member;
	}
	// findAll, findBById: 기본적으로 내장된 함수
	@Override
	public Member findByIdAndPw(String id, String pw) {
		Member member = mr.findByIdAndPw(id, pw).orElseGet(()-> {return new Member();}
		);
		
		return member;
	}

}
