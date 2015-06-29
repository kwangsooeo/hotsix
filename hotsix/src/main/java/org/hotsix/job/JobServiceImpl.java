package org.hotsix.job;

import java.util.List;

import javax.inject.Inject;

import org.hotsix.mapper.JobMapper;
import org.hotsix.page.Criteria;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{

	@Inject
	private JobMapper jmapper;
	
	@Override
	public List<JobVO> jobList(Criteria cri) {
		return jmapper.jobList(cri);
	}

	@Override
	public List<JobVO> readJobName(String depth) {
		return jmapper.readJobName(depth);
	}

	@Override
	public void insertJobVal(JobVO vo) {
		jmapper.insertJobVal(vo);
	}

	@Override
	public void deleteJobVal(int jobNo) {
		jmapper.deleteJobVal(jobNo);
	}

	@Override
	public List<JobVO> jobChoice(JobVO vo) throws Exception {
		return jmapper.jobChoice(vo);
	}
}
