<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<link rel="stylesheet" type="text/css" href="/css/system/calender/calender.css"/>
<link href='/css/calender/fullcalendar.css' rel='stylesheet' />
<link href='/css/calender/fullcalendar.print.css' rel='stylesheet' media='print' />
<script src='/js/lib/calender/lib/moment.min.js'></script>
<!-- <script src='/js/lib/calender/lib/jquery.min.js'></script> -->
<script src='/js/lib/calender/fullcalendar.min.js'></script>
<script src='/js/system/calender/calender.js'></script>

<script>
	$(document).ready(function() {
		$('#calendar').fullCalendar({
			header: {
				left: 'prev,next today',
				center: 'title',
				right: 'month,basicWeek,basicDay'
			},
			defaultDate: '<c:out value="${date}" escapeXml="false"/>',
			editable: false,
			eventLimit: true, // allow "more" link when too many events
			events: <c:out value="${calenderList}" escapeXml="false"/>
		});
		
	});
</script>
<section class="8u" style="padding-left:0px">
	<form id="dataForm" name="dataForm" method="post" >
		
	</form>
	<div id='calendar'></div>
	<c:if test="${session.memberAdmin.equals('Y')}">
		<input type="button" value="Manage" onclick="calenderManage()"/>
	</c:if>
</section>