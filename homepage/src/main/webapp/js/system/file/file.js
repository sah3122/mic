/**
 * 
 */
function fileInsertDone(){
	$("#dataForm").attr("action", "/file/fileInsertDone.do").submit();
}

function fileCancel(){
	window.history.back();
}

function fileInsert(){
	$("#dataForm").attr("action", "/file/fileInsert.do").submit();	
}

function fileDownload(idx){
	$("#fileIdx").val(idx);
	$("#dataForm").attr("action", "/file/fileDownload.do").submit();
}

function fileSearch(pageNo){
	$("#currentPageNo").val(pageNo);
	$("#dataForm").attr("action", "/file/fileMain.do").submit();
}