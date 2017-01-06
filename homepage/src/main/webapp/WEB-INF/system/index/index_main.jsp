<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<section class="8u" style="padding-left:0px">				
						
	<h1>Welcome to the MIC Homepage</h1>
	<p>This simple, fixed width website template is released under a <a href="http://creativecommons.org/licenses/by/3.0">Creative Commons Attribution 3.0 Licence</a>. This means you are free to download and use it for personal and commercial projects. However, you <strong>must leave the 'design from css3templates.co.uk' link in the footer of the template</strong>.</p>
	<p>This template is written entirely in <strong>HTML5</strong> and <strong>CSS3</strong>.</p>
	<p>You can view more free CSS3 web templates <a href="http://www.css3templates.co.uk">here</a>.</p>
	<p>This template is a fully documented 5 page website, with an <a href="examples.html">examples</a> page that gives examples of all the styles available with this design. There is also a working PHP contact form on the contact page.</p>
	<h2>Browser Compatibility</h2>
	<p>This template has been tested in the following browsers:</p>						
	
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