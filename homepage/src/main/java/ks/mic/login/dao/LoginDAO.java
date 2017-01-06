package ks.mic.login.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ks.mic.dao.AbstractDAO;

@Repository("loginDAO")
public class LoginDAO extends AbstractDAO{
	public List<Map<String, Object>> selectMemberName(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("login.selectMemberName", map);
	}
	
	public List<Map<String, Object>> selectMemberEmail(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("login.selectMemberEmail", map);
	}
	
	public List<Map<String, Object>> selectMemberLogin(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("login.selectMemberLogin", map);
	}
	
	public int insertMember(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Integer)insert("login.insertMember", map);
	}
	
	public int updateMemberCheck(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Integer)update("login.updateMemberCheck", map);
	}
}
