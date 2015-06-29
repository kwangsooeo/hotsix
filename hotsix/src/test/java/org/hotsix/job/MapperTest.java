package org.hotsix.job;

import org.hotsix.mapper.JobMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MapperTest {

	private Logger logger = LoggerFactory.getLogger(MapperTest.class);
	
	@Autowired
	private JobMapper jmapper;
	
	@Test
	public void timeTest() throws Exception{
		System.out.println(jmapper.whatTime());
	}
	
	@Test
	public void jobListTest(){
			logger.info(jmapper.jobList(null).toString());
	}
}
