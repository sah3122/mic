package ks.mic.board.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import ks.mic.board.service.BoardService;
import ks.mic.common.CommandMap;

@Controller
public class BoardController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="boardService")
	private BoardService boardService;
	
    @RequestMapping(value="/board/boardMain.do")
    public ModelAndView openBoardMain(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/board/board_main");
        Map<String, Object> boardList = boardService.selectBoardList(commandMap.getMap());
       // mv.addObject("boardList", boardList);
        
        mv.addObject("paginationInfo", (PaginationInfo)boardList.get("paginationInfo"));
        mv.addObject("boardList", boardList.get("result"));
        return mv;
    }
    
    @RequestMapping(value="/board/boardDetail.do")
    public ModelAndView openBoardDetail(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/board/board_detail");
        if(commandMap.isEmpty() == false){
            Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
            Entry<String,Object> entry = null;
            while(iterator.hasNext()){
                entry = iterator.next();
                log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
            }
        }
        Map<String, Object> boardData = boardService.selectBoardData(commandMap.getMap());
        mv.addObject("boardData", boardData);
        return mv;
    }
    
    @RequestMapping(value="/board/boardInsert.do")
    public ModelAndView openBoardInsert(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/board/board_insert");
        return mv;
    }
    
    @RequestMapping(value="/board/boardModify.do")
    public ModelAndView openBoardModify(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/system/board/board_modify");
        Map<String, Object> boardData = boardService.selectBoardData(commandMap.getMap());
        mv.addObject("boardData", boardData);
        return mv;
    }
    
    @RequestMapping(value="/board/boardModifyDone.do")
    public ModelAndView openBoardModifyDone(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView();
        boardService.updateBoardData(commandMap.getMap());
        mv.addObject("boardIdx", commandMap.getMap().get("boardIdx"));
        mv.setView(new RedirectView("/board/boardDetail.do"));
        return mv;
    }
    
    @RequestMapping(value="/board/boardInsertDone.do")
    public ModelAndView openBoardInsertDone(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView();
        boardService.insertBoardData(commandMap.getMap());
        mv.setView(new RedirectView("/board/boardMain.do"));
        return mv;
    }
    
    @RequestMapping(value="/board/boardDelete.do")
    public ModelAndView openBoardDelete(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView();
        boardService.deleteBoardData(commandMap.getMap());
        mv.setView(new RedirectView("/board/boardMain.do"));
        return mv;
    }
}
