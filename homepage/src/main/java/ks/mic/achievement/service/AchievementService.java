package ks.mic.achievement.service;

import java.util.List;
import java.util.Map;

public interface AchievementService {
	public List<Map<String, Object>> selectAchievementList() throws Exception;
}
