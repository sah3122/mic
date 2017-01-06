<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
.login-nav {
	float:right;
	color:#A6A6A6;
	text-shadow:1px 1px #747474;
}

.login-nav a{
	cursor:pointer;
}

</style>
<script>
	$(document).ready(function(){
		var href = $(location).attr('href').split('/')[3];
		$("#"+href).attr("class","active");
	});
</script>
<div id="header_container">
	<div class="container">
		<!-- Header -->
		<div id="header" class="row">
			<div class="4u">
				<div class="wrapper">
					<h1>
						<a href="/index/indexMain.do"><span>M</span>ultimedia <span>I</span>nformation <span>C</span>ommunication</a>
					</h1>
				</div>
			</div>
			
			<nav id="main-nav" class="8u">
			<div class="login-nav" style="white-space: nowrap;">
				<a href="/member/memberDetail.do">${session.memberName}</a> 님 | <a href="/login/loginLogout.do">로그아웃</a> | 
			</div>
				<ul>
					<li><a id="index" href="/index/indexMain.do">MIC</a></li>
					<li><a id="board" href="/board/boardMain.do">자유게시판</a></li>
					<li><a id="achievement" href="/achievement/achievementMain.do">학업성취도</a></li>
					<li><a id="check" href="/check/checkMain.do">출석체크</a></li>
					<li><a id="calender" href="/calender/calenderMain.do">일정</a></li>
					<li><a id="file" href="/file/fileMain.do">자료실</a></li>
				</ul>
			</nav>
		</div>
	</div>

	<div class="container">
		<div class="12u">
			<div id="wrapper-banner">
				<!-- Banner -->
				<!-- <div id="banner">
					<a href="#"><img src="/images/micMain.jpg" alt="banner image" /></a>
				</div> -->
			</div>
		</div>
	</div>
</div>
