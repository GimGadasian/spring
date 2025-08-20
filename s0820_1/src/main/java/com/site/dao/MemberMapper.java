package com.site.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.site.dto.Member;

@Mapper
public interface MemberMapper {

	List<Member> selectAll();

	Member selectLogin(@Param("id") String id, @Param("pw") String pw);

}
