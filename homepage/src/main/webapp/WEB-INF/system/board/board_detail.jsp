<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<style>
.detail_wrap {
	width: 100%;
	height: 310px;
	margin: 20px auto;
	padding: 20px;
	/* border:1px solid #c2c0b8; */
	background-color: #fff;
	-webkit-box-shadow: 0 0 60px 10px rgba(0, 0, 0, .1) inset, 0 5px 0 -4px
		#fff, 0 5px 0 -3px #c2c0b8, 0 11px 0 -8px #fff, 0 11px 0 -7px #c2c0b8,
		0 17px 0 -12px #fff, 0 17px 0 -11px #c2c0b8;
	-moz-box-shadow: 0 0 60px 10px rgba(0, 0, 0, .1) inset, 0 5px 0 -4px
		#fff, 0 5px 0 -3px #c2c0b8, 0 11px 0 -8px #fff, 0 11px 0 -7px #c2c0b8,
		0 17px 0 -12px #fff, 0 17px 0 -11px #c2c0b8;
	box-shadow: 0 0 60px 10px rgba(0, 0, 0, .1) inset, 0 5px 0 -4px #fff, 0
		5px 0 -3px #c2c0b8, 0 11px 0 -8px #fff, 0 11px 0 -7px #c2c0b8, 0 17px
		0 -12px #fff, 0 17px 0 -11px #c2c0b8;
}

.detail_wrap img {
	width: 100%;
	margin-top: 15px;
}
</style>
<script>
	function boardDelete(){
		$("#dataForm").attr("action", "/board/boardDelete.do").submit();
	}
	
	function boardModify(){
		$("#dataForm").attr("action", "/board/boardModify.do").submit();
	}
	
	function boardList(){
		$("#dataForm").attr("action", "/board/boardMain.do").submit();
	}
</script>

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
	<input type="button" value="List" onclick="boardList()" />
	<c:if test="${session.memberName.equals(boardData.BOARD_CREA_NAME) }">
		<input type="button" value="Delete" onclick="boardDelete()" />
		<input type="button" value="Modify" onclick="boardModify()" />
	</c:if>
</section>