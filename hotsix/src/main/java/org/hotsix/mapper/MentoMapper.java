package org.hotsix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Update;
import org.hotsix.mento.MentoVO;
import org.hotsix.page.Criteria;
import org.hotsix.page.PageMaker;


public interface MentoMapper {

/*	  private String id;
	   private String nickname;
	   private String pw;
	   private String name;
	   private String gender;
	   private String birth;
	   private String location;
	   private String comment;
	   private Date regdate;
	   private Date logdate;*/
	
/*	@Select("select id,nickname,name,career,"
			+ " (select"
			+ " (select id from tbl_member"
			+ " where tbl_member.memberNo=tbl_mentee.memberNo)"
			+ " from tbl_mentee"
			+ " where tbl_mentee.menteeNo=tbl_mento.menteeNo)"
			+ " as menteeId ,regdate,logdate, status"
			+ " from tbl_member, tbl_mento, tbl_mentee"
			+ " where tbl_mento.memberNo=tbl_member.memberNo"
			+ " group by tbl_member.id"
			+ " order by tbl_member.regdate desc"
			+ " limit #{pageStart}, #{perPageNum}")*/
	public List<MentoVO> listMento(Criteria cri)throws Exception;
	
	
/*	@Select("select count(mentoNo) total from tbl_mento where mentoNo>0")
*/	public PageMaker countPaging(Criteria cri)throws Exception;
	
	@Update ("update tbl_mento set status=true where mentoNo=#{mentoNo}")
	public void registmento(MentoVO mvo)throws Exception;

}
