package ks.mic.board.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ks.mic.dao.AbstractDAO;

@Repository("boardDAO")
public class BoardDAO extends AbstractDAO{
	public Map<String, Object> selectBoardList(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Map<String, Object>)selectPagingList("board.selectBoardList", map);
	}
	
	public Map<String, Object> selectBoardData(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Map<String, Object>)selectOne("board.selectBoardData", map);
	}
	
	public Map<String, Object> selectBoardRecent() throws Exception{
		// TODO Auto-generated method stub
		return (Map<String, Object>)selectOne("board.selectBoardRecent");
	}
	
	public Object updateBoardData(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Integer)update("board.updateBoardData", map);
	}
	
	public Object insertBoardData(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Integer)insert("board.insertBoardData", map);
	}
	
	public Object deleteBoardData(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Integer)update("board.deleteBoardData", map);
	}
}
