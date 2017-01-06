package ks.mic.board.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ks.mic.board.dao.BoardDAO;


@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Resource(name="boardDAO")
	private BoardDAO boardDAO;
	
	@Override
	public Map<String, Object> selectBoardList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.selectBoardList(map);
	}
	
	@Override
	public Map<String, Object> selectBoardData(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.selectBoardData(map);
	}

	@Override
	public Object updateBoardData(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.updateBoardData(map);
	}

	@Override
	public Object insertBoardData(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.insertBoardData(map);
	}

	@Override
	public Object deleteBoardData(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.deleteBoardData(map);
	}

	@Override
	public Map<String, Object> selectBoardRecent() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.selectBoardRecent();
	}
}
