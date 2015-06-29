package org.hotsix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.hotsix.page.Criteria;
import org.hotsix.page.PageMaker;
import org.hotsix.qna.QnAVO;

public interface QnAMapper {

	@Select("select qnaNo,memberNo,title,contents,regdate,qna_type,qna_status,parents,depth "
			+ "from tbl_qna "
			+ "where depth='a' "
			+ "order by parents desc "
			+ "limit #{pageStart}, #{perPageNum}")
	public List<QnAVO> allList(Criteria cri) throws Exception;
	
	@Select("select qnaNo,memberNo,title,contents,regdate,qna_type,qna_status,parents,depth "
			+ "from tbl_qna "
			+ "where parents=#{parents} and depth='b' "
			+ "order by parents desc "
			+ "limit 0, 20")
	public List<QnAVO> replyList(int parents) throws Exception;
	
	@Select("select qnaNo,memberNo,title,contents,regdate,qna_type,qna_status,parents,depth "
			+ "from tbl_qna "
			+ "where qnaNo=#{qnaNo} and depth='a'")
	public QnAVO read(int qnaNo) throws Exception;
	
	@Insert("insert into tbl_qna (memberNo,title,contents,qna_type,parents,depth) "
			+ "values(#{memberNo},#{title},#{contents},#{qna_type},#{parents},#{depth})")
	public void create(QnAVO qvo) throws Exception;
	
	@Delete("delete from tbl_qna where qnaNo=#{qnaNo}")
	public void delete(int qnaNo) throws Exception;
	
	@Update("update tbl_qna set title=#{title}, contents=#{contents}, where qnaNo=#{qnaNo}")
	public void update(QnAVO qvo) throws Exception;
	
	@Select("select count(*) totalCount from tbl_qna")
	public PageMaker total(Criteria cri) throws Exception; 
}
