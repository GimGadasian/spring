package com.site.service;

import java.util.List;

import com.site.dto.Member;

public interface MemberServInt {
	List<Member> getAllMem();
	void addMem(Member member);
}
