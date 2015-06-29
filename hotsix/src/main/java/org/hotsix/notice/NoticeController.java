package org.hotsix.notice;

import javax.inject.Inject;

import org.hotsix.page.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	private Logger logger = LoggerFactory.getLogger(NoticeController.class);
	
	@Inject
	private NoticeService service;
	

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String noticeList(@ModelAttribute("cri")Criteria cri,Model model)throws Exception{
		model.addAttribute("list", service.noticeList(cri));
		model.addAttribute("pageMaker", service.countPaging(cri).calcPage(cri));
		
		return "/notice/noticeList";
	}
	
	@RequestMapping(value="/noticeRegist",method=RequestMethod.GET)
	public void registGET()throws Exception{
	
		logger.info("registGET...");
	}
	
	@RequestMapping(value="/noticeRegist",method=RequestMethod.POST)
	public String registPOST(@ModelAttribute("cri")Criteria cri, NoticeVO vo,Model model)throws Exception{
		
		logger.info("registPOST...");
		logger.info(vo.toString());
		
		service.regist(vo);
		
		return "/notice/success";
	}
	
	@RequestMapping(value="/noticeRead",method=RequestMethod.GET)
	public void read(@ModelAttribute("cri") Criteria cri,Integer noticeNo, Model model)throws Exception{
		model.addAttribute(service.noticeRead(noticeNo));
		
	}
	@RequestMapping(value="/noticeUpdate",method=RequestMethod.GET)
	public void modGET(@ModelAttribute("cri")Criteria cri,NoticeVO vo,Model model)throws Exception{
			
		model.addAttribute(service.noticeRead(cri.getNoticeNo()));
		
		
	}
	@RequestMapping(value="/noticeUpdate",method=RequestMethod.POST)
	public String modPOST(@ModelAttribute("cri")Criteria cri,NoticeVO vo,Model model)throws Exception{
		
		service.modify(vo);
		
		return "/notice/success";
		
	}
	@RequestMapping(value="/del",method=RequestMethod.POST)
	public String delete(@ModelAttribute("cri")Criteria cri)throws Exception{
		
		service.delete(cri.getNoticeNo());
		return "notice/success";
		
	}
	
	
	
}
