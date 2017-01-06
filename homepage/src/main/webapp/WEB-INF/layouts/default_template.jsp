<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height:100%">
	<head>
		<tiles:insertAttribute name="header" />
	</head>
	<body style="height:100%">
	
		 <tiles:insertAttribute name="top_menu" />
		 <div id="site_content">
			<div class="container">			
				<!-- Features -->			
				<div class="row">	
					 <tiles:insertAttribute name="side_menu" />
					 <tiles:insertAttribute name="body" />
			 	</div>
			 </div>
		 </div>
		 <tiles:insertAttribute name="footer" />
	</body>
</html>