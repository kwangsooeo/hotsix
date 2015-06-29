package org.hotsix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.hotsix.contents.ContentsVO;

public interface ContentsMapper {
	
	//생성
	@Insert("insert into tbl_contents (title, link, jobNo) values(#{title}, #{link}, #{jobNo})")
	public void regContents(ContentsVO contents)throws Exception;
	
	//삭제
	@Delete("delete from tbl_contents where jobNo=#{jobNo}")
	public void deleteContents(ContentsVO vo)throws Exception;
	
	//조회
	@Select("select jobNo, contentsNo, title, link from tbl_contents where jobNo=#{jobNo}")
	public ContentsVO read(Integer no)throws Exception;	
	
	//리스트
	@Select("select jobNo, contentsNo, link, title, regdate from tbl_contents where contentsNo > 0 order by regdate desc")
	public List<ContentsVO> list()throws Exception;
	
	//수정
	@Update("update tbl_contents set title=#{title}, link=#{link} where jobNo=#{jobNo}")
	public ContentsVO update(ContentsVO vo)throws Exception;
	
}
