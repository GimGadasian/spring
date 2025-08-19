package com.site.service;

import java.util.List;

import com.site.dto.Member;

public interface MemberService {
	Member selectOne();
	List<Member> selectAll();
	void insertOne(Member member);
}
