package ks.mic.quartz.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ks.mic.quartz.dao.AchievementQuartzDAO;

@Service("achievementQuartzService")
public class AchievementQuartzServiceImpl implements AchievementQuartzService{
	@Resource(name="achievementQuartzDAO")
	private AchievementQuartzDAO  achievementQuartzDAO;
	
	@Override
	public Object updateAchievementData(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return achievementQuartzDAO.updateAchievementData(map);
	}

}
