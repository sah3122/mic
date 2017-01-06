<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script type="text/javascript" src="/js/lib/ckeditor/ckeditor.js"></script>
<style>
.boardTable a:link {
	color: #666;
	font-weight: bold;
	text-decoration:none;
}
.boardTable a:visited {
	color: #999999;
	font-weight:bold;
	text-decoration:none;
}
.boardTable a:active,
.boardTable a:hover {
	color: #bd5a35;
	text-decoration:underline;
}
.boardTable {
	width:100%;
	font-family:Arial, Helvetica, sans-serif;
	color:#666;
	font-size:12px;
	text-shadow: 1px 1px 0px #fff;
	background:#eaebec;
	border:#ccc 1px solid;
	-moz-border-radius:3px;
	-webkit-border-radius:3px;
	border-radius:3px;

	-moz-box-shadow: 0 1px 2px #d1d1d1;
	-webkit-box-shadow: 0 1px 2px #d1d1d1;
	box-shadow: 0 1px 2px #d1d1d1;
}
.boardTable th {
	padding:11px 15px 12px 15px;
	
	border-bottom:1px solid #e0e0e0;

	background: #ededed;
	background: -webkit-gradient(linear, left top, left bottom, from(#ededed), to(#ebebeb));
	background: -moz-linear-gradient(top,  #ededed,  #ebebeb);
}
.boardTable th:first-child {
	text-align: left;
	padding-left:20px;
}
.boardTable tr:first-child th:first-child {
	-moz-border-radius-topleft:3px;
	-webkit-border-top-left-radius:3px;
	border-top-left-radius:3px;
}
.boardTable tr:first-child th:last-child {
	-moz-border-radius-topright:3px;
	-webkit-border-top-right-radius:3px;
	border-top-right-radius:3px;
}
.boardTable tr {
	text-align: center;
	padding-left:20px;
}
.boardTable td:first-child {
	text-align: left;
	padding-left:20px;
	border-left: 0;
}
.boardTable td {
	padding:10px;
	border-top: 1px solid #ffffff;
	border-bottom:1px solid #e0e0e0;
	border-left: 1px solid #e0e0e0;

	background: #fafafa;
	background: -webkit-gradient(linear, left top, left bottom, from(#fbfbfb), to(#fafafa));
	background: -moz-linear-gradient(top,  #fbfbfb,  #fafafa);
}
.boardTable td.second {
  text-align:right;
	padding:18px;
	border-top: 1px solid #ffffff;
	border-bottom:1px solid #e0e0e0;
	border-left: 1px solid #e0e0e0;

	background: #fafafa;
	background: -webkit-gradient(linear, left top, left bottom, from(#fbfbfb), to(#fafafa));
	background: -moz-linear-gradient(top,  #fbfbfb,  #fafafa);
}
.boardTable tr.even td {
	background: #f6f6f6;
	background: -webkit-gradient(linear, left top, left bottom, from(#f8f8f8), to(#f6f6f6));
	background: -moz-linear-gradient(top,  #f8f8f8,  #f6f6f6);
}
.boardTable tr:last-child td {
	border-bottom:0;
}
.boardTable tr:last-child td:first-child {
	-moz-border-radius-bottomleft:3px;
	-webkit-border-bottom-left-radius:3px;
	border-bottom-left-radius:3px;
}
.boardTable tr:last-child td:last-child {
	-moz-border-radius-bottomright:3px;
	-webkit-border-bottom-right-radius:3px;
	border-bottom-right-radius:3px;
}
.boardTable tr:hover td {
	background: #f2f2f2;
	background: -webkit-gradient(linear, left top, left bottom, from(#f2f2f2), to(#f0f0f0));
	background: -moz-linear-gradient(top,  #f2f2f2,  #f0f0f0);	
}
</style>
<script>
	$(function(){
		CKEDITOR.replace( 'boardContents' );
	});
	
	function boardInsertDone(){
		$("#dataForm").attr("action", "/board/boardInsertDone.do").submit();
	}
	
	function boardList(){
		$("#dataForm").attr("action", "/board/boardMain.do").submit();
	}
</script>
<section class="8u" style="padding-left:0px">
	<form id="dataForm" name="dataForm" method="post">
		<input type="hidden" id="memberId" name="memberId" value="${session.memberId}"/>
		<table class="boardTable">
			<tr>
				<th>
					<span>제목</span>
				</th>
				<th>
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