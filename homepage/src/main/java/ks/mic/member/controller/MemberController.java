package ks.mic.member.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ks.mic.common.CommandMap;
import ks.mic.member.service.MemberService;
import ks.mic.session.Session;

@Controller
public class MemberController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="memberService")
	private MemberService memberService;
	
	@RequestMapping(value="/member/memberDetail.do")
	public ModelAndView openMemberDetail(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("/system/member/member_detail");
        if(commandMap.isEmpty() == false){
            Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
            Entry<String,Object> entry = null;
            while(iterator.hasNext()){
                entry = iterator.next();
                log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
                
            }
        }
        
        //HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    	HttpSession session = request.getSession(true);
    	Session se = (Session) session.getAttribute("session");
    	Map<String, Object> memberData = new HashMap<String,Object>();
    	memberData.put("memberId", se.getMemberId());
    	memberData = (HashMap<String, Object>)memberService.selectMemberData(memberData);
    	mv.addObject("memberData", memberData);
        return mv;
	}
	
	@RequestMapping(value="/member/memberModify.do")
	public ModelAndView openMemberModify(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("/system/member/member_modify");
        if(commandMap.isEmpty() == false){
            Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
            Entry<String,Object> entry = null;
            while(iterator.hasNext()){
                entry = iterator.next();
                log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
            }
        }
        
        //HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    	HttpSession session = request.getSession(true);
    	Session se = (Session) session.getAttribute("session");
    	Map<String, Object> memberData = new HashMap<String,Object>();
    	memberData.put("memberId", se.getMemberId());
    	memberData = (HashMap<String, Object>)memberService.selectMemberData(memberData);
    	mv.addObject("memberData", memberData);
        
        return mv;
	}

	@RequestMapping(value="/member/memberModifyDone.do")
	public ModelAndView openMemberModifyDone(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("/system/member/member_modify");
        if(commandMap.isEmpty() == false){
            Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
            Entry<String,Object> entry = null;
            while(iterator.hasNext()){
                entry = iterator.next();
                log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
            }
        }
        
        //request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    	HttpSession session = request.getSession(true);
    	Session se = (Session) session.getAttribute("session");
    	
    	commandMap.getMap().put("memberId", se.getMemberId());
    	System.out.println(se.getMemberId());
    	memberService.updateMemberData(commandMap.getMap(), request);
    	mv.setView(new RedirectView("/member/memberDetail.do"));
        return mv;
	}
}
