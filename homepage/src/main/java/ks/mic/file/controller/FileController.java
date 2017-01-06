package ks.mic.file.controller;

import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ks.mic.common.CommandMap;
import ks.mic.file.service.FileService;

@Controller
public class FileController {
	@Resource(name="fileService")
	private FileService fileService;
	
	@RequestMapping(value="/file/fileMain.do")
	public ModelAndView openFileMain(CommandMap commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/system/file/file_main");
		
		List<Map<String,Object>> flieList = fileService.selectFileList(commandMap.getMap());
		mv.addObject("fileList", flieList);
		return mv;
	}
	
	@RequestMapping(value="/file/fileInsert.do")
	public ModelAndView openFileInsert(CommandMap commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/system/file/file_insert");
		return mv;
	}
	
	@RequestMapping(value="/file/fileInsertDone.do")
	public ModelAndView openFileInsertDone(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		fileService.insertFileData(commandMap.getMap(), request);
		mv.setView(new RedirectView("/file/fileMain.do"));
		return mv;
	}
	
	@RequestMapping(value="/file/fileDownload.do")
	public void openFileDownload(CommandMap commandMap, HttpServletResponse response) throws Exception{
		Map<String,Object> map = fileService.selectFileInfo(commandMap.getMap());
	    String storedFileName = (String)map.get("FILE_STORED_NAME");
	    String originalFileName = (String)map.get("FILE_ORIGINAL_NAME");
	     
	    byte fileByte[] = FileUtils.readFileToByteArray(new File("C:\\dev\\file\\"+storedFileName));
	     
	    response.setContentType("application/octet-stream");
	    response.setContentLength(fileByte.length);
	    response.setHeader("Content-Disposition", "attachment; fileName=\"" + URLEncoder.encode(originalFileName,"UTF-8")+"\";");
	    response.setHeader("Content-Transfer-Encoding", "binary");
	    response.getOutputStream().write(fileByte);
	     
	    response.getOutputStream().flush();
	    response.getOutputStream().close();
	}
}
