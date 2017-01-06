package ks.mic.login.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ks.mic.login.dao.LoginDAO;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Resource(name="loginDAO")
	private LoginDAO loginDAO;
	
	@Override
	public int insertMember(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return loginDAO.insertMember(map);
	}
	
	@Override
	public int updateMemberCheck(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return loginDAO.updateMemberCheck(map);
	}

	@Override
	public List<Map<String, Object>> selectMemberName(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return loginDAO.selectMemberName(map);
	}
	
	@Override
	public List<Map<String, Object>> selectMemberLogin(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return loginDAO.selectMemberLogin(map);
	}

	@Override
	public List<Map<String, Object>> selectMemberEmail(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return loginDAO.selectMemberEmail(map);
	}

}
