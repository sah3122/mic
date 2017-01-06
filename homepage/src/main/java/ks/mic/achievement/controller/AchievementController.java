package ks.mic.achievement.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ks.mic.achievement.service.AchievementService;
import ks.mic.common.CommandMap;

@Controller
public class AchievementController {
	@Resource(name="achievementService")
	private AchievementService achievementService;
	
	@RequestMapping(value="/achievement/achievementMain.do")
	public ModelAndView openAchievementMain(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/achievement/achievement_main");
        List<Map<String, Object>> achievementList = achievementService.selectAchievementList();
        Iterator iter = achievementList.iterator();
        ArrayList<Integer> achievement = new ArrayList<Integer>();
        ArrayList<String> name = new ArrayList<String>();
        
        while(iter.hasNext()){
        	Map<String, Object> data = (Map<String, Object>) iter.next();
        	achievement.add(((BigDecimal)data.get("MEMBER_ACHIEVEMENT")).intValue());
        	name.add("'"+(String)data.get("MEMBER_NAME")+"'");
        }
        
        mv.addObject("name", name.toString());
        mv.addObject("achievement", achievement.toString());
        return mv;
    }
    
}
