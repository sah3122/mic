package ks.mic.member.service;

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
import ks.mic.member.dao.MemberDAO;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="fileUtils")
    private FileUtils fileUtils;
	
	@Resource(name="memberDAO")
	private MemberDAO memberDAO;
		
	@Override
	public Map<String, Object> selectMemberData(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return (Map<String, Object>)memberDAO.selectMemberData(map);
	}

	@Override
	public Object updateMemberData(Map<String, Object> map, HttpServletRequest request) throws Exception {
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
		    List<Map<String,Object>> list = fileUtils.parseInsertFileInfo(map, request);
		    map.put("memberImgOrgName", list.get(0).get("MEMBER_IMG_ORGNAME"));
		    map.put("memberImgStored", list.get(0).get("MEMBER_IMG_STROED"));
	    }
		return (Integer)memberDAO.updateMemberData(map);
	}

}
