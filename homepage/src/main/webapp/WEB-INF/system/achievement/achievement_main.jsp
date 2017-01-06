<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script>
	$(function () { 
		var month = new Date();
		
	    var myChart = Highcharts.chart('container', {
	        chart: {
	            type: 'bar'
	        },
	        title: {
	            text: month.getMonth()+1 + '월 학업성취도'
	        },
	        xAxis: {
	            categories: <c:out value="${name}" escapeXml="false"/>
	        },
	        yAxis: {
	            title: {
	                text: ''
	            }
	        },
	        series: [{
	            name: '달성',
	            data: <c:out value="${achievement}" escapeXml="false"/>
	        }, {
	            name: '목표',
	            data: [10, 10]
	        }]
	    });
	});
</script>
<section class="8u" style="padding-left:0px">
	<form id="dataForm" name="dataForm" method="post" >
		
	</form>
	<div id="container" style="width:100%; height:400px;"></div>
</section>