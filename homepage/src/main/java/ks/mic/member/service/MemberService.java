package ks.mic.member.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface MemberService {
	public Map<String, Object> selectMemberData(Map<String, Object> map) throws Exception;
	public Object updateMemberData(Map<String, Object> map, HttpServletRequest request) throws Exception;
}
