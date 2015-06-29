package org.hotsix.job;

import java.util.List;

import javax.inject.Inject;

import org.hotsix.mapper.JobMapper;
import org.hotsix.page.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/job/*")
public class JobController {

	Logger logger = LoggerFactory.getLogger(JobController.class);
	
	@Inject
	private JobService jService;
	@Inject
	private JobMapper jmapper;
	
	@RequestMapping("test")
	public String test(){
		return "/job/test";
	}
	
	@RequestMapping("list")
	public String jobList(@ModelAttribute("cri")Criteria cri, Model model) throws Exception{
		model.addAttribute("list",jService.jobList(cri));
		model.addAttribute("page", jmapper.jobCount(cri).calcPage(cri));
		return "/job/jobList";
	}
	
	@RequestMapping(value = "regist", method = RequestMethod.GET)
	public String jobRegistGet(Model model) throws Exception{
		model.addAttribute("jobName",jService.readJobName("a"));
		return "/job/jobRegist";
	}
	
	@RequestMapping(value = "regist", method = RequestMethod.POST)
	public String jobRegistPost(JobVO vo, Model model) throws Exception{
		jService.insertJobVal(vo);
		return "/suc/success";
	}
	
	@RequestMapping("jobChoice")
	@ResponseBody
	public List<JobVO> jobView(JobVO vo) throws Exception{
		System.out.println(vo.toString());
		return jService.jobChoice(vo);
	}
	
	@RequestMapping("nameCheck/{jobName}")
	@ResponseBody
	public String idCheck(@PathVariable("jobName") String jobName) throws Exception{
		if(jmapper.nameChk(jobName)!=0){
			return "yes";
		}
			return "no";
	}
	
	@RequestMapping("del/{jobNo}")
	public String jobDelete(@PathVariable("jobNo")int jobNo) throws Exception{
		jService.deleteJobVal(jobNo);
		return "Delete Success!!!";
	}
}
