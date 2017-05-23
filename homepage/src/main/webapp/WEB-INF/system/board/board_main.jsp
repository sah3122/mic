<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui" %>
<link rel="stylesheet" type="text/css" href="/css/system/board/board.css"/>
<script type="text/javascript" src="/js/system/board/board.js"></script>

<form id="dataForm" name="dataForm" method="post">
	<input type="hidden" id="boardIdx" name="boardIdx" value="" />
	 <input type="hidden" id="currentPageNo" name="currentPageNo" value="" />
</form>
<!-- <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600' rel='stylesheet' type='text/css'> -->
<section class="8u" style="padding-left:0px">
	<table class="boardTable" cellspacing='0'> <!-- cellspacing='0' is important, must stay -->
		<colgroup>
			<col style="width:10%">
			<col style="width:*">
			<col style="width:15%">
			<col style="width:20%">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${fn:length(boardList) > 0}">
					<c:forEach items="${boardList}" var="row">
						<tr onclick="boardDetail(${row.BOARD_IDX})">
							<td>${row.BOARD_IDX}</td>
							<td>${row.BOARD_TITLE}</td>
							<td>${row.BOARD_CREA_NAME}</td>
							<td>${row.BOARD_CREA_DT}</td>
						</tr>
					</c:forEach>
				</c:when>				
				<c:otherwise>
					<tr>
						<td colspan="4">게시물이 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
	<c:if test="${not empty paginationInfo}">
        <ui:pagination paginationInfo = "${paginationInfo}" type="text" jsFunction="boardSearch"/>
    </c:if>
	<input type="button" value="Insert" style="width:70px; height:40px; margin-top:10px; border:0px" onclick="boardInsert()"/>
</section>
