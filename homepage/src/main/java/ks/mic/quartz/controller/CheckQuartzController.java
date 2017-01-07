package ks.mic.quartz.controller;

import java.util.HashMap;
import java.util.Map;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import ks.mic.quartz.service.CheckQuartzService;

public class CheckQuartzController extends QuartzJobBean {
	private ApplicationContext ctx;
	private CheckQuartzService checkQuartzService;

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		ctx = (ApplicationContext) arg0.getJobDetail().getJobDataMap().get("applicationContext");
		checkQuartzService = (CheckQuartzService) ctx.getBean("CheckQuartzService");
		Map<String, Object> data = new HashMap<String, Object>();
		try {
			checkQuartzService.updateCheckData(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
