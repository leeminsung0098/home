package com.mycompany.hello.DAO;

import java.lang.reflect.Member;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.hello.domain.MemberVO;
import com.mycompany.hello.mapper.MemberMapper;

@Repository("MemberDAO")
public class MemberDAOJDBC implements MemberDAO {
	
	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public List<MemberVO> selectAll() {
		List<MemberVO> list = memberMapper.selectAll();
		return list;
	}

	@Override
	public MemberVO select(String wr_uid) {
		MemberVO board = memberMapper.selectOne(wr_uid);
		return board;
	}

	@Override
	public void insert(MemberVO member) {
		memberMapper.insertOne(member);
	}

	@Override
	public void update(MemberVO member) {
		memberMapper.updateOne(member);
	}

	@Override
	public void delete(String user_uid) {
		memberMapper.deleteOne(user_uid);
	}

}
