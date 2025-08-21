package com.site.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dao.MemberMapper;
import com.site.dto.Member;

@Service
public class MserviceImpl implements Mservice{
	private List<Member> list = new ArrayList<>();
	@Autowired MemberMapper memberMapper;
	@Override
	public List<Member> selectAll() {
		// TODO Auto-generated method stub
		List<Member> list = memberMapper.selectAll();
		return list;
	}
	@Override
	public Member selectLogin(String id, String pw) {
		// TODO Auto-generated method stub
		Member member = memberMapper.selectLogin(id, pw);
		return member;
	}
	
	@Override
	public void addMem(Member member) {
		list.add(member);
	}
	@Override
	public Member findAndId(String id) {
		Member member = memberMapper.findAndId(id);
		return member;
	}

}
