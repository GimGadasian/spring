package com.site.service;

import java.util.List;

import com.site.dto.Member;

public interface Mservice {

	List<Member> selectAll();

	Member selectLogin(String id, String pw);

	void addMem(Member member);

	Member findAndId(String id);

}
