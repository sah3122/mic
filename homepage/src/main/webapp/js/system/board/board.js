/**
 * 
 */
function boardDelete(){
	$("#dataForm").attr("action", "/board/boardDelete.do").submit();
}

function boardModify(){
	$("#dataForm").attr("action", "/board/boardModify.do").submit();
}

function boardList(){
	$("#dataForm").attr("action", "/board/boardMain.do").submit();
}


function boardInsertDone(){
	$("#dataForm").attr("action", "/board/boardInsertDone.do").submit();
}

function boardDetail(idx){
	$("#boardIdx").val(idx);
	$("#dataForm").attr("action", "/board/boardDetail.do").submit();
}

function boardInsert(){
	$("#dataForm").attr("action", "/board/boardInsert.do").submit();	
}

function boardSearch(pageNo){
	$("#currentPageNo").val(pageNo);
	$("#dataForm").attr("action", "/board/boardMain.do").submit();
}

function boardModifyDone(){
	$("#dataForm").attr("action","/board/boardModifyDone.do").submit();
}