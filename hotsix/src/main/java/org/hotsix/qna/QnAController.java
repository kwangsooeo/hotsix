package org.hotsix.qna;

import java.util.List;

import javax.inject.Inject;

import org.hotsix.page.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/qna/*")
public class QnAController {
	private static final Logger logger = LoggerFactory
			.getLogger(QnAController.class);
	@Inject
	private QnAService service;

	@RequestMapping(value="/list", method= RequestMethod.GET)
	public String qnalistPage2(@ModelAttribute("cri")Criteria cri, Model model) throws Exception {

		model.addAttribute("list", service.qnaList(cri));
		model.addAttribute("pageMaker", service.total(cri).calcPage(cri));
		
		return "/qna/qnaList4";
	}
	
	@RequestMapping(value="/read", method = RequestMethod.GET)
	public String read(@ModelAttribute("cri")Criteria cri, Model model) throws Exception{
		model.addAttribute(service.qnaRead(cri.getQnaNo()));
		return "/qna/qnaRead";
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public String delete(@ModelAttribute("cri")Criteria cri) throws Exception{
		
		service.qnaRemove(cri.getQnaNo());
		return "/qna/success";
	}
	
	@RequestMapping("/reply")
	@ResponseBody
	public List<QnAVO> replyList(int parents) throws Exception{
		return service.qnaReplyList(parents);
	}
}
