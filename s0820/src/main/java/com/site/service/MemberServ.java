package com.site.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.site.dto.Member;

@Service
public class MemberServ implements MemberServInt{
	private List<Member> memList = new ArrayList<>();
	
	public MemberServ() { // default constructor
	// initialized member sample
	memList.add(new Member("bio", "0619", "king"));
	memList.add(new Member("bibi", "0326", "bb"));
	memList.add(new Member("steph", "0111", "daddy"));
	memList.add(new Member("yes", "0505", "jerry"));
	memList.add(new Member("testuser", "1111", "tester"));
	}
	
	@Override
	public List<Member> getAllMem() {
		return memList; // need forEach in jsp file
	}
	
	@Override
	public void addMem(Member member) {
		memList.add(member);
	}
}
