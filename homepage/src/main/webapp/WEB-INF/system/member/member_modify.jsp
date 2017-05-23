<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="/js/system/member/member.js"></script>

<section class="8u">
	<div class="form-style-5">
		<form name="dataForm" id="dataForm" method="post" enctype="multipart/form-data">
			<fieldset>
				<h2>회원정보 수정</h2>
				<input type="text" name="memberName" id="memberName" value="${memberData.MEMBER_NAME}">
				<input type="email" name="memberEmail" id="memberEmail"  value="${memberData.MEMBER_EMAIL}">
				<input type="text" name="memberNumber" id="memberNumber" placeholder="Class number" value="${memberData.MEMBER_NUMBER}">
				<input type="text" name="memberPhone" id="memberPhone" placeholder="Phone number" value="${memberData.MEMBER_PHONE}">
				<input type="text" name="memberAchievement" id="memberAchievement" placeholder="Achievement" value="${memberData.MEMBER_ACHIEVEMENT}">
				<textarea name="memberIntro" id="memberIntro" placeholder="About yourself">${memberData.MEMBER_INTRO}</textarea>
				<h2>Age:</h2> 
				<select id="memberAge" name="memberAge">
					<option value="20" <c:if test="${memberData.MEMBER_AGE == 20}">selected="selected"</c:if>>20</option>
					<option value="21" <c:if test="${memberData.MEMBER_AGE == 21}">selected="selected"</c:if>>21</option>
					<option value="22" <c:if test="${memberData.MEMBER_AGE == 22}">selected="selected"</c:if>>22</option>
					<option value="23" <c:if test="${memberData.MEMBER_AGE == 23}">selected="selected"</c:if>>23</option>
					<option value="24" <c:if test="${memberData.MEMBER_AGE == 24}">selected="selected"</c:if>>24</option>
					<option value="25" <c:if test="${memberData.MEMBER_AGE == 25}">selected="selected"</c:if>>25</option>
					<option value="26" <c:if test="${memberData.MEMBER_AGE == 26}">selected="selected"</c:if>>26</option>
					<option value="27" <c:if test="${memberData.MEMBER_AGE == 27}">selected="selected"</c:if>>27</option>
					<option value="28" <c:if test="${memberData.MEMBER_AGE == 28}">selected="selected"</c:if>>28</option>
					<option value="29" <c:if test="${memberData.MEMBER_AGE == 29}">selected="selected"</c:if>>29</option>
					<option value="30" <c:if test="${memberData.MEMBER_AGE == 30}">selected="selected"</c:if>>30</option>
				</select>
				<h2>Class:</h2> 
				<select id="memberClass" name="memberClass">
					<option value="1" <c:if test="${memberData.MEMBER_CLASS == 1}">selected="selected"</c:if>>1</option>
					<option value="2" <c:if test="${memberData.MEMBER_CLASS == 2}">selected="selected"</c:if>>2</option>
					<option value="3" <c:if test="${memberData.MEMBER_CLASS == 3}">selected="selected"</c:if>>3</option>
					<option value="4" <c:if test="${memberData.MEMBER_CLASS == 4}">selected="selected"</c:if>>4</option>
				</select>
				<input type="radio" name="memberDeleteAT" id="memberDeleteAT" value="N" <c:if test="${memberData.MEMBER_DELETE_AT.equals('N')}">checked="checked"</c:if>>재학
				<input type="radio" name="memberDeleteAT" id="memberDeleteAT" value="Y" <c:if test="${memberData.MEMBER_DELETE_AT.equals('Y')}">checked="checked"</c:if>>휴학
				<h2>IMAGE:</h2> 
				<input type="file" name="memberImg" id="memberImg" style="margin-bottom:15px">
			</fieldset>
			<input type="button" value="Cancel" onclick="modifyCancel()"/>
			<input type="button" value="Apply" onclick="modifyDone()"/>
		</form>
	</div>

</section>
