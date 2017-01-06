package ks.mic.quartz.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import ks.mic.dao.AbstractDAO;

@Repository("checkQuartzDAO")
public class CheckQuartzDAO extends AbstractDAO{
	public Object updateCheckData(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Integer)update("check.updateCheckData", map);
	}
}
