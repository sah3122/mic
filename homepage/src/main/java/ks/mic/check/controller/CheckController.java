package ks.mic.check.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ks.mic.check.service.CheckService;
import ks.mic.common.CommandMap;

@Controller
public class CheckController {
	@Resource(name="checkService")
	private CheckService checkService;
	
	@RequestMapping(value="/check/checkMain.do")
	public ModelAndView openCheckMain(CommandMap commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/system/check/check_main");
		List<Map<String, Object>> checkList = checkService.selectCheckList(commandMap.getMap());
		mv.addObject("checkList", checkList);
		return mv;
	}
}
