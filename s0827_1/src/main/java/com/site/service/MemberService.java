package com.site.service;

import com.site.dto.Member;

public interface MemberService {

	Member findById(String id);

	Member findByIdAndPw(String id, String pw);

}
