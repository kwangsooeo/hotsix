package org.hotsix.mentee;

import java.util.List;

import javax.inject.Inject;

import org.hotsix.mapper.MenteeMapper;
import org.hotsix.page.Criteria;
import org.hotsix.page.PageMaker;
import org.springframework.stereotype.Service;

@Service
public class MenteeServiceImp implements MenteeService {

	@Inject
	private MenteeMapper mapper;
	
	@Override
	public void regist(MemberVO membervo) throws Exception {
		
		mapper.regist(membervo);
	}

	@Override
	public void delete(int MenteeNo) throws Exception {
		
		mapper.delete(MenteeNo);
	}

	@Override
	public MemberVO read(int MemberNo) throws Exception {
		
		return mapper.read(MemberNo);
	}

	@Override
	public List<MemberVO> list() throws Exception {
		
		return mapper.list();
	}

	@Override
	public List<MemberVO> criAll(Criteria cri) throws Exception {
		return mapper.menteeCri(cri);
	}

	@Override
	public PageMaker totalCount(Criteria cri) throws Exception {
		return mapper.totalCount(cri);
	}

}
