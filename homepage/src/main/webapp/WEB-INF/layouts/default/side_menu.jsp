<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>
	function recentBoardDetail(){
		$("#recentForm").attr("action","/board/boardDetail.do").submit();	
	}
</script>
<section class="4u">
	<form id="recentForm" name="recentForm" method="post">
		<input type="hidden" id="memberId" name="memberId" value="${session.memberId}">
		<input type="hidden" id="recentboardIdx" name="boardIdx" value="${recentData.BOARD_IDX}">
		<div id="sidebar">
			<section class="12u">
				<h3>최근 게시물</h3>
				<h4>제목 : ${recentData.BOARD_TITLE}</h4>
				<h5>등록일시 : ${recentData.BOARD_CREA_DT}</h5>
				<p style="text-overflow:ellipsis;white-space:nowrap;word-wrap:normal">${recentData.BOARD_CONTENTS} </p><a style="cursor:pointer" onclick="recentBoardDetail()">더보기</a>
			</section>
			<section class="12u">
				<h3>즐겨찾기</h3>
				<ul>
					<li><a href="www.naver.com">네이버</a></li>
					<li><a href="www.google.com">구글</a></li>
					<li><a href="www.facebook.com">페이스북</a></li>
					<li><a href="www.daum.net">다음</a></li>
				</ul>
			</section>
			<!-- <section class="12u">
				<h3>More Useful Links</h3>
				<ul>
					<li><a href="#">First Link</a></li>
					<li><a href="#">Another Link</a></li>
					<li><a href="#">And Another</a></li>
					<li><a href="#">Last One</a></li>
				</ul>
			</section> -->
		</div>
	</form>
</section>