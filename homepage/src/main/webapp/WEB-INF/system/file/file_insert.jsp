<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script type="text/javascript" src="/js/lib/ckeditor/ckeditor.js"></script>
<script src="/js/system/file/file.js"></script>

<section class="8u" style="padding-left:0px">
	<form id="dataForm" enctype="multipart/form-data" name="dataForm" method="post">
		<input type="hidden" id="memberId" name="memberId" value="${session.memberId}"/>
		<h3>파일등록</h3>
		<table class="fileTable">
			<tr>
				<td>
					제목 : <input type="text" id="fileTitle" name="fileTitle"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="file" value="Insert" id="fileData" name="fileData"/>
				</td>
			</tr>
		</table>
		<input type="button" value="cancel" onclick="fileCancel()"/>
		<input type="button" value="insert" onclick="fileInsertDone()"/>
	</form>
</section>