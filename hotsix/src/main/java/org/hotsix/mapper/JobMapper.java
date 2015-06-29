package org.hotsix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.hotsix.job.JobVO;
import org.hotsix.page.Criteria;
import org.hotsix.page.PageMaker;

public interface JobMapper {

	@Select("select now()")
	public String whatTime() throws Exception;
	
	@Select("select jobNo, jobName, parent, depth from tbl_job where jobNo>0 limit #{pageStart}, #{perPageNum}")
	public List<JobVO> jobList(Criteria cri);
	
	@Select("select jobName,depth,jobNo,parent from tbl_job where depth = #{depth}")
	public List<JobVO> readJobName(String depth);
	
	@Insert("insert into tbl_job(jobName, parent, depth) values(#{jobName}, #{realParent}, #{depth})")
	public void insertJobVal(JobVO vo);
	
	@Delete("delete from tbl_job where jobNo = #{jobNo}")
	public void deleteJobVal(int jobNo);
	
	@Select("select jobName,depth,jobNo,parent from tbl_job where depth = #{depth} and parent=#{parent}")
	public List<JobVO> jobChoice(JobVO vo);
	
	@Select("select count(jobNo) from tbl_job where jobName=#{jobName}")
	public int nameChk(String jobName);
	
	@Select("select count(jobNo) totalCount from tbl_job")
	public PageMaker jobCount(Criteria cri);
}
