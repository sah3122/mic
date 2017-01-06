package ks.mic.check.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ks.mic.dao.AbstractDAO;

@Repository("checkDAO")
public class CheckDAO extends AbstractDAO{
	public List<Map<String, Object>> selectCheckList(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("check.selectCheckList", map);
	}
}
