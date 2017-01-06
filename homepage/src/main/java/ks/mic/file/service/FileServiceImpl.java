package ks.mic.file.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import ks.mic.common.util.FileUtils;
import ks.mic.file.dao.FileDAO;

@Service("fileService")
public class FileServiceImpl implements FileService{
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="fileDAO")
	private FileDAO fileDAO;
	
	@Resource(name="fileUtils")
    private FileUtils fileUtils;
	
	@Override
	public List<Map<String, Object>> selectFileList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return fileDAO.selectFileList(map);
	}

	@Override
	public Object insertFileData(Map<String, Object> map, HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
	    Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
	    MultipartFile multipartFile = null;
	    while(iterator.hasNext()){
	        multipartFile = multipartHttpServletRequest.getFile(iterator.next());
	        if(multipartFile.isEmpty() == false){
	            log.debug("------------- file start -------------");
	            log.debug("name : "+multipartFile.getName());
	            log.debug("filename : "+multipartFile.getOriginalFilename());
	            log.debug("size : "+multipartFile.getSize());
	            log.debug("-------------- file end --------------\n");
	        }
	    }
	    if(multipartFile.isEmpty() == false){
		    List<Map<String,Object>> list = fileUtils.insertFileInfo(map, request);
		    map.put("fileImgOrgName", list.get(0).get("FILE_IMG_ORGNAME"));
		    map.put("fileImgStored", list.get(0).get("FILE_IMG_STROED"));
		    map.put("fileFileSize", list.get(0).get("FILE_SIZE"));
	    }
		
		return fileDAO.insertFileData(map);
	}

	@Override
	public Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return fileDAO.selectFileInfo(map);
	}
	
}
