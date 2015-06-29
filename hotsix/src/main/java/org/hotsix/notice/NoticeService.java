package org.hotsix.notice;

import java.util.List;

import org.hotsix.page.Criteria;
import org.hotsix.page.PageMaker;


public interface NoticeService {

	public void regist(NoticeVO vo)throws Exception;
	
	public NoticeVO noticeRead(Integer noticeNo)throws Exception;
	
	public List<NoticeVO> noticeList(Criteria cri)throws Exception;
	
	public void modify(NoticeVO vo)throws Exception;
	
	public void delete(Integer noticeNo)throws Exception;

	public PageMaker countPaging(Criteria cri)throws Exception;
}
