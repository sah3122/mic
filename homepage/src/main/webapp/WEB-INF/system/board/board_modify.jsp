<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<link rel="stylesheet" type="text/css" href="/css/system/board/board.css"/>
<script type="text/javascript" src="/js/lib/ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="/js/system/board/board.js"></script>

<script>
	$(function(){
		CKEDITOR.replace( 'boardContents' );
	});
</script>
<section class="8u" style="padding-left:0px">
	<form id="dataForm" name="dataForm" method="post">
		<input type="hidden" id="boardIdx" name="boardIdx" value="${boardData.BOARD_IDX}">
		<table class="boardTable">
			<tr>
				<th>
					<span>제목</span>
				</th>
				<th style="text-align:left">
					<input type="text" id="boardTitle" name="boardTitle" value="${boardData.BOARD_TITLE}"/>
				</th>
			</tr>
			<tr class="editor">
				<td colspan="2">
					<textarea id="boardContents" name="boardContents" class="tb05-textarea">${boardData.BOARD_CONTENTS}</textarea>
				</td>
			</tr>
		</table>
	</form>
	<input type="button" value="Cancel" onclick="boardDetail()"/>
	<input type="button" value="Modify" onclick="boardModifyDone()"/>
</section>