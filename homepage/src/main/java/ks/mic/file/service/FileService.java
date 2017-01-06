package ks.mic.file.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface FileService {
	public List<Map<String, Object>> selectFileList(Map<String, Object> map) throws Exception;
	
	public Object insertFileData(Map<String, Object> map, HttpServletRequest request) throws Exception;
	
	public Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception;
}
