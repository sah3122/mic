/**
 * 
 */

function calenderManage(){
	$("#dataForm").attr("action","/calender/calenderManage.do").submit();
}

function calenderInsert(){
	$("input[name=calenderSt]").each(function(index){
		//alert($(this).val());
	})
	//alert($("#dataForm").serialize());
	$("#dataForm").attr("action", "/calender/calenderInsert.do").submit();
}

function calenderAdd(){
	html ="";
	html += "<div>";
	html += "<label>calenderSt</label>";
	html += "<input type='text' name='addCalenderSt' id='addCalenderSt' style='margin-left:5px; margin-right:5px; width:100px'>";
	html += "<label>calenderEn</label>";
	html += "<input type='text' name='addCalenderEn' id='addCalenderEn' style='margin-left:5px; margin-right:5px; width:100px'>";
	html += "<label>calenderTitle</label>";
	html += "<input type='text' name='addCalenderTitle' id='addCalenderTitle' style='margin-left:5px; margin-right:5px'>";
	html += "<input type='checkbox' name='addDeleteBox' id='addDeleteBox' />delete";
	html += "</div>";
	
	$("#addCalender").append(html);
}

function calenderDelete(){
	if(confirm("정말 삭제 하시겠습니까?")){
		$("input[name=deleteBox]").each(function(index){
			if($(this).is(":checked")){
				$(this).val($(this).parent().find("#calenderIdx").val());
			}
		})

		$("input[name=addDeleteBox]").each(function(index){
			if($(this).is(":checked")){
				$(this).parent().remove();
			}
		})
		
		$("#dataForm").attr("action", "/calender/calenderDelete.do").submit();
	} 
}