package org.hotsix.job;

import java.util.List;

import org.hotsix.page.Criteria;

public interface JobService {

	public List<JobVO> jobList(Criteria cri) throws Exception;
	
	public List<JobVO> readJobName(String depth) throws Exception;
	
	public void insertJobVal(JobVO vo) throws Exception;
	
	public void deleteJobVal(int jobNo) throws Exception;

	public List<JobVO> jobChoice(JobVO vo) throws Exception;
}
