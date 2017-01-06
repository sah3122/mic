package ks.mic.calender.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ks.mic.calender.dao.CalenderDAO;

@Service("calenderService")
public class CalenderServiceImpl implements CalenderService{
	@Resource(name="calenderDAO")
	private CalenderDAO calenderDAO;

	@Override
	public List<Map<String, Object>> selectCalenderList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return calenderDAO.selectCalenderList(map);
	}

	@Override
	public Object insertCalenderData(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return calenderDAO.insertCalenderData(map);
	}

	@Override
	public Object updateCalenderData(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return calenderDAO.updateCalenderData(map);
	}

	@Override
	public Object deleteCalenderData(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return calenderDAO.deleteCalenderData(map);
	}
	
	
}
