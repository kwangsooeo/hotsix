package org.hotsix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.hotsix.notice.NoticeVO;
import org.hotsix.page.Criteria;
import org.hotsix.page.PageMaker;

public interface NoticeMapper {
	
	
	@Select("select now()")
	public String noticeTime()throws Exception;
	
	@Insert("insert into tbl_notice(title,contents,filename) values(#{title},#{contents},#{filename})")
	public void noticeCreat(NoticeVO vo) throws Exception;
	
	@Select("select noticeNo,title,contents,regdate,viewCnt from tbl_notice where noticeNo=#{noticeNo}")
	public NoticeVO	noticeRead(Integer noticeNo) throws Exception;
	
	@Select("select noticeNo,title,contents,regdate,viewCnt from tbl_notice where noticeNo > 0 order by noticeNo desc limit 0,10")
	public List<NoticeVO> noticeList(Criteria cri) throws Exception;
	
	@Delete("delete from tbl_notice where noticeNo=#{noticeNo}")
	public void noticeDelete(Integer noticeNo) throws Exception;
	
	@Update("update tbl_notice set title=#{title},contents=#{contents},filename=#{filename} where noticeNo=#{noticeNo}")
	public void noticeUpdate(NoticeVO vo) throws Exception;

	@Select("select noticeNo,title,contents,regdate,viewCnt from tbl_notice where noticeNo > 0 order by noticeNo desc limit #{pageStart},#{pageNum}")
	public List<NoticeVO> listCriteria(Criteria cri);
	
	@Select("select count(noticeNo) totalCount from tbl_notice where noticeNo > 0")
	public PageMaker countPaging(Criteria cri)throws Exception;
}
