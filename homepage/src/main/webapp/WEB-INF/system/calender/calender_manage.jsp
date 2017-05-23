<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script src='/js/system/calender/calender.js'></script>

<section class="8u" style="padding-left:0px">
	<form id="dataForm" name="dataForm" method="post">
		<div name="editCalender" id="editCalender">
			<c:choose>
				<c:when test="${fn:length(calenderList) > 0}">
					<c:forEach items="${calenderList}" var="row" varStatus="status">
						<div>
							<input type="hidden" name="calenderIdx" id="calenderIdx" value="${row.CALENDER_IDX }" >
							<label>calenderSt</label>
							<input type="text" name="calenderSt" id="calenderSt" value="${row.start }" style="width:100px">
							<label>calenderEn</label>
							<input type="text" name="calenderEn" id="calenderEn" value="${row.end }" style="width:100px">
							<label>calenderTitle</label>
							<input type="text" name="calenderTitle" id="calenderTitle" value="${row.title }">
							<input type="checkbox" name="deleteBox" id="deleteBox" />delete
						</div> 
					</c:forEach>
				</c:when>
				<c:otherwise>
					등록된 스케줄이 없습니다.
				</c:otherwise>
			</c:choose>
		</div>
		<div name="addCalender" id="addCalender">
		</div>
	</form>
	<input type="button" value="delete" onclick="calenderDelete()"/>
	<input type="button" value="insert" onclick="calenderInsert()"/>
	<input type="button" value="add" onclick="calenderAdd()"/>
</section>