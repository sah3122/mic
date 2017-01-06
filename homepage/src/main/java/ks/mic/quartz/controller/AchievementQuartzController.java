package ks.mic.quartz.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import ks.mic.quartz.service.AchievementQuartzService;

public class AchievementQuartzController extends QuartzJobBean{
	@Resource(name="achievementQuartzService")
	private AchievementQuartzService achievementQuartzService;
	
	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		Map<String, Object> data = new HashMap<String, Object>();
		try {
			achievementQuartzService.updateAchievementData(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
