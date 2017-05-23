<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<link rel="stylesheet" type="text/css" href="/css/system/board/board.css"/>
<script type="text/javascript" src="/js/system/board/board.js"></script>


<section class="8u" style="padding-left: 0px">
	<div class="detail_wrap">
		<form id="dataForm" name="dataForm" method="post">
			<input type="hidden" id="memberId" name="memberId" value="${session.memberId}">
			<input type="hidden" id="boardIdx" name="boardIdx" value="${boardData.BOARD_IDX}">
			<h1>${boardData.BOARD_TITLE}</h1>
			<p>${boardData.BOARD_CONTENTS}</p>
			<br />
		</form>
	</div>
	<input type="button" value="List" style="width:70px; height:40px; margin-top:10px; border:0px" onclick="boardList()" />
	<c:if test="${session.memberName.equals(boardData.BOARD_CREA_NAME) }">
		<input type="button" value="Delete" style="width:70px; height:40px; margin-top:10px; border:0px" onclick="boardDelete()" />
		<input type="button" value="Modify" style="width:70px; height:40px; margin-top:10px; border:0px" onclick="boardModify()" />
	</c:if>
</section>