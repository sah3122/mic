/**
 * 
 */
function mouseOn(index){
	$("#img"+index).css("opacity","0.5");
	$("#div"+index).css("display","");
}

function mouseLeave(index){
	$("#img"+index).css("opacity","1");
	$("#div"+index).css("display","none");
}

function introduceDetail(index){
	$("#memberIndex").val(index);
	$("#dataForm").attr("action","/introduce/introduceDetail.do").submit();
}