package org.hotsix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.hotsix.mentee.MemberVO;
import org.hotsix.mentee.MenteeVO;
import org.hotsix.page.Criteria;
import org.hotsix.page.PageMaker;

public interface MenteeMapper {
	
	@Insert("insert into tbl_member(id,nickname,pw,name,gender,birth,location,comment) values(#{id},#{nickname},#{pw},#{name},#{gender},#{birth},#{location},#{comment})")
	public void regist(MemberVO membervo)throws Exception;

	@Insert("insert into tbl_mentee(id,nickname,pw,name,gender,birth,location,comment) values(#{id},#{nickname},#{pw},#{name},#{gender},#{birth},#{location},#{comment})")
	public void registTest(MenteeVO menteevo)throws Exception;
	
	@Delete("delete from tbl_mentee where mentee=#{menteeNo}")
	public void delete(int MenteeNo)throws Exception;

	@Select("select *from tbl_member where memberNo=#{memberNo}")
	public MemberVO read(int MemberNo)throws Exception;
	
	@Select("select id,nickname,name, (select"
			+ " (select id from tbl_member where tbl_member.memberNo=tbl_mento.memberNo)"
			+ " from tbl_mento where tbl_mento.mentoNo=tbl_mentee.mentoNo) "
			+ "as mentoid ,regdate,logdate "
			+ "from tbl_member, tbl_mentee "
			+ "where tbl_mentee.memberNo=tbl_member.memberNo "
			+ "group by tbl_member.id order by tbl_member.regdate desc")
	public List<MemberVO> list()throws Exception;
	
	public PageMaker totalCount(Criteria cri)throws Exception;
	
	public List<MemberVO> menteeCri(Criteria cri)throws Exception;
	

}
