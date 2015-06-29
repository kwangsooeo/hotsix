package org.hotsix.contents;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/contents/*")
public class ContentsController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentsController.class);
	
	@Inject
	private ContentsService service;
	
	//리스트 조회
	@RequestMapping(value="/contentsList", method=RequestMethod.GET)
	public void contentsList(ContentsVO vo, Model model)throws Exception{
		logger.info(vo.toString());
		model.addAttribute("list",service.list());
	}
	
	//등록
	@RequestMapping(value = "/contentsRegist" , method = RequestMethod.GET)
	public void registGET()throws Exception{
		logger.info("등록");
	}
	
	@RequestMapping(value="/contentsRegist", method = RequestMethod.POST)
	public String registPOST(ContentsVO contents, Model model)throws Exception{
		logger.info("POST 방식으로 등록");
		logger.info(contents.toString());
		
		service.regContents(contents);
		
		return "/contents/success";
	}
	
	//조회 페이지
	@RequestMapping(value="/contentsRead", method = RequestMethod.GET)
	public void read(int jobNo, Model model) throws Exception{
		model.addAttribute(service.readContents(jobNo));
	}
	
	//삭제
	@RequestMapping(value="/contentsRemove", method = RequestMethod.POST)
	public String remove(ContentsVO vo)throws Exception{
		
		logger.info("제거 완료");
		
		service.deleteContents(vo);
		
		return "/contents/success";
	}
	
	//수정
	@RequestMapping(value="/contentsModify", method = RequestMethod.GET)
	public String update(ContentsVO vo, Model model)throws Exception{
		
		service.update(vo);
		
		return "/contents/success";
	}
	
	
	
}
