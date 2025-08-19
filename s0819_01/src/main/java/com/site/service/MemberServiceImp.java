package com.site.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.site.dto.Member;

@Service
public class MemberServiceImp implements MemberService{
	static List<Member> memberList = new ArrayList<>();
	{
		memberList.add(new Member("aaa", "1111", "gildong hong", "010-1111-1111", 21, "hong"));
		memberList.add(new Member("bbb", "2222", "gildong song", "010-2222-2222", 22, "song"));
		memberList.add(new Member("ccc", "3333", "gildong yong", "010-3333-3333", 23, "yong"));
	}
	
	@Override
	public Member selectOne() {
	    List<Member> memberList = selectAll();
	    return memberList.get(memberList.size() - 1); 
	}

	@Override
	public List<Member> selectAll() {
		// TODO Auto-generated method stub
		return memberList;
	}

	
	@Override
	public void insertOne(Member member) {
		// TODO Auto-generated method stub
		memberList.add(member);
	}

	
}
