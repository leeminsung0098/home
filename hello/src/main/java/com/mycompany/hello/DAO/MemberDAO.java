package com.mycompany.hello.DAO;

import java.util.List;

import com.mycompany.hello.domain.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> selectAll();

	public MemberVO select(String user_uid);

	public void insert(MemberVO member);

	public void update(MemberVO member);

	public void delete(String user_uid);
}
