package ks.mic.introduce.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IntroduceController {
	Logger log = Logger.getLogger(this.getClass());
    
    @RequestMapping(value="/introduce/introduceMain.do")
    public ModelAndView openIntroduceMain(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/introduce/introduce_main");
        return mv;
    }
    
    @RequestMapping(value="/introduce/introduceDetail.do")
    public ModelAndView openIntroduceDetail(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/introduce/introduce_detail");
        return mv;
    }
}
