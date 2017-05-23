<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="/js/system/introduce/introduce.js"></script>

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
                <div style="height:100%; width:100%;" >
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%;">
                			<img src="/images/Koala.jpg" id="img1"style="width:100%; height:100%; float:left; position:relative; cursor:pointer"  onMouseOver="mouseOn(1)" onmouseleave="mouseLeave(1)" onclick="introduceDetail(1)"/>
                			<div id ="div1" style="position:absolute; display:none; text-align: center;">
                				±Ëº“»≠
                			</div>
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                			<img src="/images/veg.jpg" id="img2"style="width:100%; height:100%; float:left; position:relative; cursor:pointer"  onMouseOver="mouseOn(2)" onmouseleave="mouseLeave(2)" onclick="introduceDetail(2)"/>
                			<div id ="div2" style="position:absolute; display:none; text-align: center;">
                				¿Ã√§»∆
                			</div>
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                		
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                		
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                		
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                		
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                		
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                		
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                		
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                		
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                		
                		</div>
                	</div>
                	<div style="height:25%; width:33%; border:1px solid gray; float:left;padding:5px;">
                		<div style="border:1px solid gray; height:100%; width:100%">
                		
                		</div>
                	</div>
                </div>
            </div>
        </div>
    </div>
</div>
    

