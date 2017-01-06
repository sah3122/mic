package ks.mic.quartz.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ks.mic.quartz.dao.CheckQuartzDAO;

@Service("checkQuartzService")
public class CheckQuartzServiceImpl implements CheckQuartzService{
	@Resource(name="checkQuartzDAO")
	private CheckQuartzDAO checkQuartzDAO;
	
	@Override
	public Object updateCheckData(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return checkQuartzDAO.updateCheckData(map);
	}

}
