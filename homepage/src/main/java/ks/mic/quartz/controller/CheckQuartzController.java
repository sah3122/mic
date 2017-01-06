package ks.mic.quartz.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import ks.mic.quartz.service.CheckQuartzService;

public class CheckQuartzController extends QuartzJobBean{
	@Resource(name="checkQuartzService")
	private CheckQuartzService checkQuartzService;
	
	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		Map<String, Object> data = new HashMap<String, Object>();
		try {
			checkQuartzService.updateCheckData(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
