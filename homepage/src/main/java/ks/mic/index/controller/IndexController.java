package ks.mic.index.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ks.mic.common.CommandMap;
import ks.mic.index.service.IndexService;
import ks.mic.session.Session;

@Controller
public class IndexController {
	Logger log = Logger.getLogger(this.getClass());
    
	@Resource(name="indexService")
	private IndexService indexService;
	
    @RequestMapping(value="/index/indexMain.do")
    public ModelAndView openIndexMain(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/index/index_main");
                
        List<Map<String, Object>> memberList = indexService.selectMemberList(commandMap.getMap());
        mv.addObject("memberList", memberList);
        return mv;
    }
    
}
