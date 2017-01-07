package ks.mic.quartz.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import ks.mic.quartz.service.AchievementQuartzService;
import ks.mic.quartz.service.CheckQuartzService;

public class AchievementQuartzController extends QuartzJobBean{
	private ApplicationContext ctx;
	private AchievementQuartzService achievementQuartzService;
	
	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		ctx = (ApplicationContext) arg0.getJobDetail().getJobDataMap().get("applicationContext");
		achievementQuartzService = (AchievementQuartzService) ctx.getBean("AchievementQuartzService");
		Map<String, Object> data = new HashMap<String, Object>();
		try {
			achievementQuartzService.updateAchievementData(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
