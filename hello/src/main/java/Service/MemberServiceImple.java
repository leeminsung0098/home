package Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.hello.DAO.MemberDAO;
import com.mycompany.hello.domain.MemberVO;

@Service
@XmlType
public class MemberServiceImple implements MemberService {
	
	@Autowired
	private MemberDAO memberDao;
	
	@Override
	public List<MemberVO> selectList() {
		List<MemberVO> list = memberDao.selectAll();
		return list;
	}

	@Override
	public MemberVO selectOne(String user_uid) {
		MemberVO member = memberDao.select(user_uid);
		return member;
	}

	@Override
	public void insertOne(MemberVO member) {
		memberDao.insert(member);
	}

	@Override
	public void updateOne(MemberVO member) {
		memberDao.update(member);
	}

	@Override
	public void deleteOne(String user_uid) {
		memberDao.delete(user_uid);
	}
}
