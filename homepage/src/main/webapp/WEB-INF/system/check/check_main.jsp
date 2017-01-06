<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script>
	$(function () { 
		var date = new Date();
		var day = date.getDate();
		var month = date.getMonth() + 1;
		var today = month + "월" + " " + day + "일";
		$("#today").text(today);
	});
</script>
<section class="8u" style="padding-left:0px">
	<form id="dataForm" name="dataForm" method="post" >
		<div>
			<div>
				<h2>
					출석체크
				</h2>
				<h5 id="today">
					
				</h5>
			</div>
			<div>
				<h5>
					출석
				</h5>
				<ul>
					<c:choose>
						<c:when test="${fn:length(checkList) > 0}">
							<c:forEach items="${checkList}" var="row">
								<c:if test="${row.MEMBER_CHECK.equals('Y')}">
									<li>${row.MEMBER_NAME }</li>
								</c:if>
							</c:forEach>
						</c:when>				
						<c:otherwise>
							<li>아무도 안옴</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
			<div>
				<h5>
					미출석
				</h5>
				<ul>
					<c:choose>
						<c:when test="${fn:length(checkList) > 0}">
							<c:forEach items="${checkList}" var="row">
								<c:if test="${row.MEMBER_CHECK.equals('N')}">
									<li>${row.MEMBER_NAME }</li>
								</c:if>
							</c:forEach>
						</c:when>				
						<c:otherwise>
							<li>왠일로 다옴</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
	</form>
</section>