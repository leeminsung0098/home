package com.mycompany.hello.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mycompany.hello.domain.MemberVO;

@Mapper
public interface MemberMapper {
	List<MemberVO> selectAll();
	
	MemberVO selectOne(String user_uid);
	
	void insertOne(MemberVO member);
	
	void updateOne(MemberVO member);
	
	void deleteOne(String user_uid);
	
}
