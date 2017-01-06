<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>
	function memberModify(){
		$("#dataForm").attr("action","/member/memberModify.do").submit();
	}
</script>
<section class="8u">
	<div class="form-style-5">
		<form name="dataForm" id="dataForm" method="post">
			<fieldset>
				<h2>회원정보</h2>
				<input type="text" name="memberName" id="memberName" readonly="readonly" value="${memberData.MEMBER_NAME}">
				<input type="email" name="memberEmail" id="memberEmail" readonly="readonly"  value="${memberData.MEMBER_EMAIL}">
				<input type="text" name="memberNumber" id="memberNumber" readonly="readonly" placeholder="Class number" value="${memberData.MEMBER_NUMBER}">
				<input type="text" name="memberPhone" id="memberPhone" readonly="readonly" placeholder="Phone number" value="${memberData.MEMBER_PHONE}">
				<input type="text" name="memberAchievement" id="memberAchievement" readonly="readonly" placeholder="Achievement" value="학업 성취도 : ${memberData.MEMBER_ACHIEVEMENT}">
				<textarea name="memberIntro" id="memberIntro" readonly="readonly" placeholder="About yourself">${memberData.MEMBER_INTRO}</textarea>
				<h2>Age:</h2> 
				<input type="text" name="memberAge" id="memberAge" readonly="readonly" value="${memberData.MEMBER_AGE}">
				<h2>Class:</h2> 
				<input type="text" name="memberClass" id="memberClass" readonly="readonly" value="${memberData.MEMBER_CLASS}">
				<input type="text" name="memberDeleteAT" id="memberDeleteAT" readonly="readonly"<c:if test="${memberData.MEMBER_DELETE_AT.equals('N')}">value="재학"</c:if><c:if test="${memberData.MEMBER_DELETE_AT.equals('Y')}">value="휴학"</c:if> >
			</fieldset>
			<input type="button" value="Edit" onclick="memberModify()"/>
		</form>
	</div>

</section>
