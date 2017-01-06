package ks.mic.check.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ks.mic.check.dao.CheckDAO;

@Service("checkService")
public class CheckServiceImpl implements CheckService{
	@Resource(name="checkDAO")
	private CheckDAO checkDAO;

	@Override
	public List<Map<String, Object>> selectCheckList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return checkDAO.selectCheckList(map);
	}
}
