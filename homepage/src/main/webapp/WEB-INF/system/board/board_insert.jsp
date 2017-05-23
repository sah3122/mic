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
		<input type="hidden" id="memberId" name="memberId" value="${session.memberId}"/>
		<table class="boardTable">
			<tr>
				<th>
					<span>제목</span>
				</th>
				<th style="text-align:left">
					<input type="text" id="boardTitle" name="boardTitle" value=""/> 
				</th>
			</tr>
			<tr class="editor">
				<td colspan="2">
					<textarea id="boardContents" name="boardContents" class="tb05-textarea"></textarea>
				</td>
			</tr>
		</table>
		<input type="button" value="Insert" onclick="boardInsertDone()"/>
		<input type="button" value="List" onclick="boardList()"/>
	</form>
</section>