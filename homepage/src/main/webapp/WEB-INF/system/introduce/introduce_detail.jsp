<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script>
	$("#menu-toggle").click(function(e) {
	    e.preventDefault();
	    $("#wrapper").toggleClass("toggled");
	});

</script>
    <!-- Page Content -->
<div id="page-content-wrapper" style="height:100%">
	<form id="dataForm" name="dataForm" method="post">
		<input type="hidden" id="memberIndex" name="memberIndex" value=""/>
	</form>

    <div class="container-fluid" style="height:100%">
        <div class="row" style="height:100%">
            <div class="col-lg-12" style="max-width: 940px; height:100%">
                
            </div>
        </div>
    </div>
</div>
    

