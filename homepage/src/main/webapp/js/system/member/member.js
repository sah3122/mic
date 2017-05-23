/**
 * 
 */
function memberModify(){
	$("#dataForm").attr("action","/member/memberModify.do").submit();
}

function modifyDone(){
	$("#dataForm").attr("action","/member/memberModifyDone.do").submit();
}

function modifyCancel(){
	$("#dataForm").attr("action","/member/memberDetail.do").submit();
}