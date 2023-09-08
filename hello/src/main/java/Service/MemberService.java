package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.hello.domain.MemberVO;

@Service
public interface MemberService {
	
	public List<MemberVO> selectList();
	
	public MemberVO selectOne(String user_uid);
	
	public void insertOne(MemberVO member);
	
	public void updateOne(MemberVO member);
	
	public void deleteOne(String user_uid);
}
