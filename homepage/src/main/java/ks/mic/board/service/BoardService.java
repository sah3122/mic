package ks.mic.board.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
	public Map<String, Object> selectBoardList(Map<String, Object> map) throws Exception;
	
	public Map<String, Object> selectBoardData(Map<String, Object> map) throws Exception;
	public Map<String, Object> selectBoardRecent() throws Exception;
	
	public Object updateBoardData(Map<String, Object> map) throws Exception;
	public Object insertBoardData(Map<String, Object> map) throws Exception;
	public Object deleteBoardData(Map<String, Object> map) throws Exception;
	
}
