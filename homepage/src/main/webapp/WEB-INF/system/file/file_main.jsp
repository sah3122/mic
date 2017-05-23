<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui" %>
<link rel="stylesheet" type="text/css" href="/css/system/file/file.css"/>
<script src="/js/system/file/file.js"></script>

<form id="dataForm" name="dataForm" method="post">
	<input type="hidden" id="fileIdx" name="fileIdx" value="" />
	 <input type="hidden" id="currentPageNo" name="currentPageNo" value="" />
</form>
<!-- <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600' rel='stylesheet' type='text/css'> -->
<section class="8u" style="padding-left:0px">
	<table class="fileTable" cellspacing='0'> <!-- cellspacing='0' is important, must stay -->
		<colgroup>
			<col style="width:10%">
			<col style="width:*">
			<col style="width:15%">
			<col style="width:15%">
			<col style="width:10%">
			<col style="width:20%">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>파일명</th>
				<th>크기</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${fn:length(fileList) > 0}">
					<c:forEach items="${fileList}" var="row">
						<tr>
							<td>${row.FILE_IDX}</td>
							<td>${row.FILE_TITLE}</td>
							<td onclick="fileDownload(${row.FILE_IDX})" style="cursor:pointer;">${row.FILE_ORIGINAL_NAME}</td>
							<td>${row.FILE_SIZE}MB</td>
							<td>${row.FILE_CREA_NAME}</td>
							<td>${row.FILE_CREA_DT}</td>
						</tr>
					</c:forEach>
				</c:when>				
				<c:otherwise>
					<tr>
						<td colspan="6">게시물이 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
	<c:if test="${not empty paginationInfo}">
        <ui:pagination paginationInfo = "${paginationInfo}" type="text" jsFunction="boardSearch"/>
    </c:if>
	<input type="button" value="Insert" onclick="fileInsert()"/>
</section>
