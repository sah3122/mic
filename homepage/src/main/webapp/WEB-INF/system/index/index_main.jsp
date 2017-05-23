<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<section class="8u" style="padding-left:0px">				
						
	<h1>Welcome to the MIC Homepage</h1>
	<p>MIC 커뮤니티 사이트 입니다.</p>
	<p>자유게시판 , 파일 공유, 출석체크, 일정 관리, 학업 성취도 등의 기능들이 있습니다.</p>
	
	<h2>출석체크 공지</h2>
	<p>다들 출석좀 합시다!!</p>						
	
	<h2>소개</h2>
	<c:forEach items="${memberList}" var="row">
		<div class="vertalign">
			<div class="imgteaser" style="margin-right:10px; margin-top:10px">
				<a> 
					<c:choose>
						<c:when test="${row.MEMBER_IMG_STORED == null}">
							<img src="/images/micMain.jpg" alt="Daim Graffiti" />
						</c:when>
						<c:otherwise>
							<img src="/images/${row.MEMBER_IMG_STORED}" alt="Daim Graffiti" />
						</c:otherwise>
					</c:choose>
					<span class="more">
						<strong>»LEARN MORE</strong>
					</span> 
					<span class="desc">
						<strong>${row.MEMBER_NAME}</strong>
						${row.MEMBER_INTRO}
						<%-- <span style="color: #FFFF00">글: 관리자, 사진 : 관리자</span> --%>
					</span>
				</a>
			</div>
		</div>
	</c:forEach>
</section>	