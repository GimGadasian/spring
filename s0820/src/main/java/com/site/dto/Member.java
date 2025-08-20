package com.site.dto;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String pw;
	private String nick;
	
	public Member(){}
	
	public Member(String id, String pw, String nick){
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
}

