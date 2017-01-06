package ks.mic.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionCheckInterceptor extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if(request.getRequestURL().indexOf("login") != -1){
			return true;
		}
		HttpSession session = request.getSession(false);
		
		if(session == null){
			response.sendRedirect(request.getContextPath()+"/login/loginMain.do");
			return false;
		}
		
		Session se = (Session)session.getAttribute("session");
		
		if(se == null){
			response.sendRedirect(request.getContextPath()+"/login/loginMain.do");
			return false;
		}
		
		return true;
	}

}
