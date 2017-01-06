package ks.mic.calender.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ks.mic.calender.service.CalenderService;
import ks.mic.common.CommandMap;

@Controller
public class CalenderController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="calenderService")
	private CalenderService calenderService;
	
    @RequestMapping(value="/calender/calenderMain.do")
    public ModelAndView openCalenderMain(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/calender/calender_main");
        List<Map<String, Object>> calenderList = calenderService.selectCalenderList(commandMap.getMap());
        for(int i = 0; i < calenderList.size(); i++){
        	calenderList.get(i).put("start","'"+(String)calenderList.get(i).get("start")+"'");
        	calenderList.get(i).put("end","'"+(String)calenderList.get(i).get("end")+"'");
        	calenderList.get(i).put("title","'"+(String)calenderList.get(i).get("title")+"'");
        }
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String calenderListStr = calenderList.toString().replaceAll("=", ":");
        mv.addObject("date", sdf.format(date));
        mv.addObject("calenderList", calenderListStr);
        return mv;
    }
    
    @RequestMapping(value="/calender/calenderManage.do")
    public ModelAndView openCalenderManage(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/calender/calender_manage");
        List<Map<String, Object>> calenderList = calenderService.selectCalenderList(commandMap.getMap());

        mv.addObject("calenderList", calenderList);
        return mv;
    }
    
    @RequestMapping(value="/calender/calenderInsert.do")
    public ModelAndView openCalenderInsert(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView();
    	HashMap<String, Object> updateMap = new HashMap<String, Object>();
    	HashMap<String, Object> insertMap = new HashMap<String, Object>();

    	ArrayList<String> calenderStList, calenderEnList, calenderTitleList, calenderIdxList;
    	ArrayList<String> addCalenderStList, addCalenderEnList, addCalenderTitleList;
    	
    	if(commandMap.getMap().get("calenderSt") != null && commandMap.getMap().get("calenderSt").getClass().toString().equals("class java.lang.String")){
    		calenderStList = new ArrayList<String>(Arrays.asList((String) commandMap.getMap().get("calenderSt")));
        	calenderEnList = new ArrayList<String>(Arrays.asList((String) commandMap.getMap().get("calenderEn")));
        	calenderTitleList = new ArrayList<String>(Arrays.asList((String) commandMap.getMap().get("calenderTitle")));
        	calenderIdxList = new ArrayList<String>(Arrays.asList((String) commandMap.getMap().get("calenderIdx")));
    	} else {
    		calenderStList = new ArrayList<String>(Arrays.asList((String[]) commandMap.getMap().get("calenderSt")));
        	calenderEnList = new ArrayList<String>(Arrays.asList((String[]) commandMap.getMap().get("calenderEn")));
        	calenderTitleList = new ArrayList<String>(Arrays.asList((String[]) commandMap.getMap().get("calenderTitle")));
        	calenderIdxList = new ArrayList<String>(Arrays.asList((String[]) commandMap.getMap().get("calenderIdx")));
    	}
    	
    	for(int i =0; i < calenderStList.size(); i++){
    		updateMap.put("calenderSt", calenderStList.get(i));
    		updateMap.put("calenderEn", calenderEnList.get(i));
    		updateMap.put("calenderTitle", calenderTitleList.get(i));
    		updateMap.put("calenderIdx", calenderIdxList.get(i));
    		
    		calenderService.updateCalenderData(updateMap);
    	}
    	
    	if(commandMap.getMap().get("addCalenderSt") != null && commandMap.getMap().get("addCalenderSt").getClass().toString().equals("class java.lang.String")){
    		addCalenderStList = new ArrayList<String>(Arrays.asList((String) commandMap.getMap().get("addCalenderSt")));
    		addCalenderEnList = new ArrayList<String>(Arrays.asList((String) commandMap.getMap().get("addCalenderEn")));
    		addCalenderTitleList = new ArrayList<String>(Arrays.asList((String) commandMap.getMap().get("addCalenderTitle")));
    	} else {
    		addCalenderStList = new ArrayList<String>(Arrays.asList((String[]) commandMap.getMap().get("addCalenderSt")));
    		addCalenderEnList = new ArrayList<String>(Arrays.asList((String[]) commandMap.getMap().get("addCalenderEn")));
    		addCalenderTitleList = new ArrayList<String>(Arrays.asList((String[]) commandMap.getMap().get("addCalenderTitle")));
    	}
    	
    	if(addCalenderStList != null){
	    	for(int i =0; i < addCalenderStList.size(); i++){
	    		insertMap.put("addCalenderSt", addCalenderStList.get(i));
	        	insertMap.put("addCalenderEn", addCalenderEnList.get(i));
	        	insertMap.put("addCalenderTitle", addCalenderTitleList.get(i));
	        	
	        	calenderService.insertCalenderData(insertMap);
	    	}
    	}
    	
    	mv.setView(new RedirectView("/calender/calenderMain.do"));
        return mv;
    }
    
    @RequestMapping(value="/calender/calenderDelete.do")
    public ModelAndView openCalenderDelete(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView();
        HashMap<String, Object> deleteMap = new HashMap<String, Object>();
    	
    	String[] deleteCalenderIdx = (String[]) commandMap.getMap().get("deleteBox");
    	
    	if(deleteCalenderIdx != null){
	    	for(int i =0; i < deleteCalenderIdx.length; i++){
	    		deleteMap.put("deleteCalenderIdx", deleteCalenderIdx[i]);
	        	calenderService.deleteCalenderData(deleteMap);
	    	}
    	}
        mv.setView(new RedirectView("/calender/calenderMain.do"));
        return mv;
    }
}
