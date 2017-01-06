package ks.mic.quartz.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import ks.mic.dao.AbstractDAO;

@Repository("achievementQuartzDAO")
public class AchievementQuartzDAO extends AbstractDAO{
	public Object updateAchievementData(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Integer)update("achievement.updateAchievementData", map);
	}
}
