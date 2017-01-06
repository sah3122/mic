package ks.mic.file.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ks.mic.dao.AbstractDAO;

@Repository("fileDAO")
public class FileDAO extends AbstractDAO{
	public List<Map<String, Object>> selectFileList(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("file.selectFileList", map);
	}
	
	public Object insertFileData(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Integer)insert("file.insertFileData", map);
	}
	
	public Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception{
		return (Map<String, Object>)selectOne("file.selectFileInfo", map);
	}
}
