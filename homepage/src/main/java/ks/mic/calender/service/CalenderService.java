package ks.mic.calender.service;

import java.util.List;
import java.util.Map;

public interface CalenderService {
	public List<Map<String, Object>> selectCalenderList(Map<String, Object> map) throws Exception;
	
	public Object insertCalenderData(Map<String, Object> map) throws Exception;
	
	public Object updateCalenderData(Map<String, Object> map) throws Exception;
	
	public Object deleteCalenderData(Map<String, Object> map) throws Exception;
	
}
