package org.hotsix.job;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ServiceTest {

	Logger logger = LoggerFactory.getLogger(ServiceTest.class);
	
	@Inject
	private JobService service;
	
	@Test
	public void serviceListTest() throws Exception{
		List<JobVO> list = service.jobList(null);
		for (JobVO jobVO : list) {
			logger.info(jobVO.toString());
		}
	}
}
