package ks.mic.calender.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ks.mic.dao.AbstractDAO;

@Repository("calenderDAO")
public class CalenderDAO extends AbstractDAO{
	public List<Map<String, Object>> selectCalenderList(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("calender.selectCalenderList", map);
	}
	
	public Object insertCalenderData(Map<String, Object> map) throws Exception{
		return (Integer) insert("calender.insertCalenderData", map);
	}
	
	public Object updateCalenderData(Map<String, Object> map) throws Exception{
		return (Integer) insert("calender.updateCalenderData", map);
	}
	
	public Object deleteCalenderData(Map<String, Object> map) throws Exception{
		return (Integer) insert("calender.deleteCalenderData", map);
	}
}
