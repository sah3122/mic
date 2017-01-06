package ks.mic.common;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.ModelAndView;

import ks.mic.board.service.BoardService;

@Aspect
public class CommonAspect {
	@Resource(name="boardService")
	private BoardService boardService;
	
	@Around("execution(* ks..controller.*Controller.*(..)))")
	public Object recentBoard(ProceedingJoinPoint joinPoint) throws Throwable{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		Map<String, Object> boardData = boardService.selectBoardRecent();
		if(boardData != null){
			boardData.put("BOARD_CREA_DT", boardData.get("BOARD_CREA_DT").toString().substring(0,8));
		}
		request.setAttribute("recentData", boardData);
		return joinPoint.proceed();
	}
}

