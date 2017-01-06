package ks.mic.login.service;

import java.util.List;
import java.util.Map;

public interface LoginService {
	
	List<Map<String, Object>> selectMemberName(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectMemberEmail(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectMemberLogin(Map<String, Object> map) throws Exception;
	int insertMember(Map<String, Object> map) throws Exception;
	int updateMemberCheck(Map<String, Object> map) throws Exception;
}
