<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	
	<title>Home</title>
</head>
<style>
	html, body{
		width:100%;
		height:100%;
	}
</style>
<script>
	$(function(){
		
	});
	function deleteText(){
		$("#loginText").val("");
	}
	
	function next(){
		$("#dataForm").attr("action","/login/passwd.do").submit();
	}
</script>
<body>
	<div style="padding:50px 0 50px 0">
		<div style="margin:auto">
			<h1 style="text-align: center">
				MIC
			</h1>
		</div>
	</div>
	<div style="height:300px;">
		<div style="height:100%; width:350px; margin:auto; text-align: center">
			<div style="width:100%; height:300px; /*border:1px solid gray;*/ background: #D5D5D5">
				<div style="height:70%">
			        	<c:forEach items="${list }" var="row">
		                    <tr>
		                        <td>${row.TEST }</td>
		                        <td>${row.TEST2 }</td>
		                    </tr>
			            </c:forEach>
				</div>
				<form id="dataForm" name="dataForm" method="post">
					<input type="text" id="loginText" name="loginText" style="width:170px;margin:5px;height:30px" value="이메일 주소 입력" onfocus="deleteText()"/>
					<input type="button" id="nextButton" name="nextButton" value="다음" style="width:170px;height:30px" onclick="next()"/>
				</form>
			</div>	
		</div>
		<div style="text-align: center; margin-top:10px">
			계정만들기
		</div>
	</div>
</body>
</html>
