package ks.mic.index.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ks.mic.dao.AbstractDAO;

@Repository("indexDAO")
public class IndexDAO extends AbstractDAO{
	public List<Map<String, Object>> selectMemberList(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("index.selectMemberList", map);
	}
}
