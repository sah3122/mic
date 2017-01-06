package ks.mic.member.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import ks.mic.dao.AbstractDAO;

@Repository("memberDAO")
public class MemberDAO extends AbstractDAO{
	public Object selectMemberData(Map<String, Object> map){
		return (Map<String, Object>) selectOne("member.selectMemberData", map);
	}
	
	public Object updateMemberData(Map<String, Object> map){
		return (Integer) update("member.updateMemberData", map);
	}

}
