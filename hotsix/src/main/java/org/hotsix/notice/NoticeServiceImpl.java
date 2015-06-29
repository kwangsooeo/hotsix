package org.hotsix.notice;

import java.util.List;

import javax.inject.Inject;

import org.hotsix.mapper.NoticeMapper;
import org.hotsix.page.Criteria;
import org.hotsix.page.PageMaker;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Inject
	private NoticeMapper mapper;
	
	
	@Override
	public void regist(NoticeVO vo) throws Exception {


		mapper.noticeCreat(vo);

	}

	@Override
	public NoticeVO noticeRead(Integer noticeNo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.noticeRead(noticeNo);
	}

	@Override
	public List<NoticeVO> noticeList(Criteria cri) throws Exception {
		
		return mapper.noticeList(cri);
	}

	@Override
	public void modify(NoticeVO vo) throws Exception {
		
		mapper.noticeUpdate(vo);

	}

	@Override
	public void delete(Integer noticeNo) throws Exception {
		
		mapper.noticeDelete(noticeNo);

	}
	
	

	@Override
	public PageMaker countPaging(Criteria cri) throws Exception {
	
		return mapper.countPaging(cri);
	}

}
