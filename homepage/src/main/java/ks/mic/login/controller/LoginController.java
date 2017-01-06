package ks.mic.login.controller;

import java.util.Iterator;
import java.util.List;
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
import ks.mic.login.service.LoginService;
import ks.mic.session.Session;

@Controller
public class LoginController {
	Logger log = Logger.getLogger(this.getClass());
    
	@Resource(name="loginService")
	private LoginService loginService;
	
    @RequestMapping(value="/login/loginMain.do")
    public ModelAndView openLoginMain(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/login/login_main");
        if(commandMap.isEmpty() == false){
            Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
            Entry<String,Object> entry = null;
            while(iterator.hasNext()){
                entry = iterator.next();
                log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
            }
        }
        return mv;
    }
    
    @RequestMapping(value="/login/loginSignup.do")
    public ModelAndView openLoginSignup(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("jsonView");
        if(commandMap.isEmpty() == false){
            Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
            Entry<String,Object> entry = null;
            while(iterator.hasNext()){
                entry = iterator.next();
                log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
            }
        }
        
        List<Map<String, Object>> member = loginService.selectMemberName(commandMap.getMap());
        List<Map<String, Object>> member2 = loginService.selectMemberEmail(commandMap.getMap());
        if(member.isEmpty() == true && member2.isEmpty() == true){ //중복되는 ID,Email이 없으면 멤버 생성
        	loginService.insertMember(commandMap.getMap());
            mv.addObject("RESULT", 0);
        } else {
            mv.addObject("RESULT", 1);        	
        }
        return mv;
    }
    
    @RequestMapping(value="/login/loginSignin.do")
    public ModelAndView openLoginSignin(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/login/login_main");
        if(commandMap.isEmpty() == false){
            Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
            Entry<String,Object> entry = null;
            while(iterator.hasNext()){
                entry = iterator.next();
                log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
            }
        }
        
        List<Map<String, Object>> member = loginService.selectMemberLogin(commandMap.getMap());
        
        if(member.isEmpty() == false){
        	HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        	HttpSession session = request.getSession(true);
        	Session se = new Session();
        	se.setMemberId(member.get(0).get("MEMBER_ID").toString());
        	se.setMemberName(member.get(0).get("MEMBER_NAME").toString());
        	se.setMemberAdmin(member.get(0).get("MEMBER_ADMIN").toString());
        	session.setAttribute("session", se);
        	
        	if(member.get(0).get("MEMBER_CHECK") != null && member.get(0).get("MEMBER_CHECK").toString().equals("N")){
        		commandMap.getMap().put("memberId", member.get(0).get("MEMBER_ID").toString());
        		loginService.updateMemberCheck(commandMap.getMap());
        	}
        	
        	if(member.get(0).get("MEMBER_INFO") != null &&member.get(0).get("MEMBER_INFO").toString().equals("Y")){
        		mv.setView(new RedirectView("/index/indexMain.do"));
        	} else {
        		mv.setView(new RedirectView("/member/memberModify.do"));
        	}
        	mv.addObject("RESULT", "000");
        } else {
        	mv.addObject("RESULT", "001");
        }
        return mv;
    }
    
    @RequestMapping(value="/login/loginLogout.do")
    public ModelAndView openLoginLogout(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/login/login_main");
        if(commandMap.isEmpty() == false){
            Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
            Entry<String,Object> entry = null;
            while(iterator.hasNext()){
                entry = iterator.next();
                log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
            }
        }
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    	HttpSession session = request.getSession(true);
    	session.invalidate();
        return mv;
    }
    
}
