package ks.mic.index.service;

import java.util.List;
import java.util.Map;

public interface IndexService {
	List<Map<String, Object>> selectMemberList(Map<String, Object> map) throws Exception;
}
