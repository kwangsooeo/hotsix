package org.hotsix.mentee;

import java.util.List;

import org.hotsix.page.Criteria;
import org.hotsix.page.PageMaker;

public interface MenteeService {

	public void regist(MemberVO membervo)throws Exception;
	
	public void delete(int MenteeNo)throws Exception;
	
	public MemberVO read(int MemberNo)throws Exception;
	
	public List<MemberVO> list()throws Exception;
	
	public List<MemberVO> criAll(Criteria cri) throws Exception;
	
	public PageMaker totalCount(Criteria cri) throws Exception;
}
