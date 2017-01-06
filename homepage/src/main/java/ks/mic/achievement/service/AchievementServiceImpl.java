package ks.mic.achievement.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ks.mic.achievement.dao.AchievementDAO;

@Service("achievementService")
public class AchievementServiceImpl implements AchievementService{
	@Resource(name="achievementDAO")
	private AchievementDAO achievementDAO;
	
	@Override
	public List<Map<String, Object>> selectAchievementList() throws Exception {
		// TODO Auto-generated method stub
		return achievementDAO.selectAchievementList();
	}

}
