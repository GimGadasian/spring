package com.site.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private String id;
	private String pw;
	private String name;
	private String tel;
	private int age;
	private String nick;
	
	public String getFormattedTel() {
	    if (tel == null || tel.length() != 11) return tel;
	    return tel.substring(0, 3) + "-" + tel.substring(3, 7) + "-" + tel.substring(7);
	}

}
