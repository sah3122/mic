/**
 * 
 */
function signup(){
	$.ajax({
	      type: "POST",
	      url: "/login/loginSignup.do",
	      data: $("#signupForm").serialize(), // 보내는 폼 데이터
	      dataType:"json", // 받는 데이터 타입
	      success: function(data){
	      	// r = 리턴받는 json객체
	          if(data.RESULT=='0'){ 
	             alert("회원가입 되었습니다.");
	          }else if (data.RESULT == '1'){
	        	 alert("이름 또는 Email 주소가 중복됩니다."); 
	          } else {
	        	 alert("알수없는 오류가 발생하였습니다.");
	          }
	      }
	 });
}

function login(){
	$("#loginForm").attr("action","/login/loginSignin.do").submit();
}