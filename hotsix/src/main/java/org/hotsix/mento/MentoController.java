package org.hotsix.mento;

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
@RequestMapping("/mento/*")
public class MentoController {
	
	private static final Logger logger = LoggerFactory.getLogger(MentoController.class);
	
	@Inject
	private MentoService service;

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String mentoList(@ModelAttribute("cri")Criteria cri , Model model)throws Exception{
		model.addAttribute("list", service.listMento(cri));
		model.addAttribute("pageMaker", service.totalCount(cri).calcPage(cri));
		return "/mento/mentoList";
	}
	
	@RequestMapping("/regist")
	public void mentoRegist(@ModelAttribute("cri")Criteria cri, MentoVO mvo, Model model)throws Exception{
		service.registMento(mvo);
	}
}
