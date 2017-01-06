package ks.mic.check.service;

import java.util.List;
import java.util.Map;

public interface CheckService {
	public List<Map<String, Object>> selectCheckList(Map<String, Object> map) throws Exception;
}
