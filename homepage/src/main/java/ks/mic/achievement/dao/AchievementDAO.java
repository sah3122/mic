package ks.mic.achievement.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ks.mic.dao.AbstractDAO;

@Repository("achievementDAO")
public class AchievementDAO extends AbstractDAO {
	public List<Map<String, Object>> selectAchievementList() throws Exception{
		return (List<Map<String, Object>>)selectList("achievement.selectAchievementList");
	}
}
