package com.site.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.site.dto.Member;

public interface MemberRepository extends JpaRepository<Member, String>{

	// select할 때 데이터가 있으면 Member 객체를 리턴하지만, 없으면 Optional.empty()를 리턴
	// select * from member where id = #{id} and pw = #{pw
	Optional<Member> findByIdAndPw(String id, String pw);

//	@Query(value="select * from member where id = ?1 and pw = ?2", nativeQuery=true)
//	Optional<Member> findLogin(String id, String pw);
}
