package ks.mic.index.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ks.mic.index.dao.IndexDAO;

@Service("indexService")
public class IndexServiceImpl implements IndexService{
	
	@Resource(name="indexDAO")
	private IndexDAO indexDAO;
	@Override
	public List<Map<String, Object>> selectMemberList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return indexDAO.selectMemberList(map);
	}
}
