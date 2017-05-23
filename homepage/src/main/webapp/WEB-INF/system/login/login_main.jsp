<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<link rel="stylesheet" type="text/css" href="/css/system/login/login.css"/>
<script src="/js/system/login/login.js"></script>

<script>
	$(function(){
		if($("#memberLogin").val() == "001") {
			alert("로그인정보가 틀렸습니다.");
		}
	});
</script>

<section class="container">
    <article class="half">
        <h1>MIC</h1>
        <div class="tabs">
	    	<span class="tab signin active"><a href="#signin">Sign in</a></span>
	        <span class="tab signup"><a href="#signup">Sign up</a></span>
        </div>
        <div class="content">
            <div class="signin-cont cont">
               	<form method="post" id="loginForm" name="loginForm">
               		<input type="hidden" name="memberLogin" id="memberLogin" value="${RESULT}" />
                    <input type="email" name="memberEmail" id="memberEmail" class="inpt" required="required" placeholder="Your email">
                    <label for="email">Your email</label>
                    <input type="password" name="memberPassword" id="memberPassword" class="inpt" required="required" placeholder="Your password">
          			    <label for="password">Your password</label>
                    <input type="checkbox" id="remember" class="checkbox" checked>
                    <label for="remember">Remember me</label>
                    <div class="submit-wrap">
                        <input type="submit" value="Sign in" id="loginButton" name="loginButton" onclick="login()" class="submit">
                        <a href="#" class="more">Forgot your password?</a>
                    </div>
				</form>
        	</div>
			<div class="signup-cont cont">
            	<form method="post" enctype="multipart/form-data" id="signupForm" name="signupForm">
                    <input type="text" name="memberName" id="memberName" class="inpt" required="required" placeholder="Your name">
                    <label for="name">Your name</label>
              		<input type="email" name="memberEmail" id="memberEmail" class="inpt" required="required" placeholder="Your email">
                    <label for="email">Your email</label>
                    <input type="password" name="memberPassword" id="memberPassword" class="inpt" required="required" placeholder="Your password">
          			<label for="password">Your password</label>
                    <div class="submit-wrap">
                        <input type="submit" value="Sign up" id="signupButton" name="signupButton" onclick="signup()" class="submit">
                        <a href="#" class="more">Terms and conditions</a>
                    </div>
      			</form>
        	</div>
		</div>
    </article>
</section>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> 
<script type="text/javascript">
$('.tabs .tab').click(function(){
    if ($(this).hasClass('signin')) {
        $('.tabs .tab').removeClass('active');
        $(this).addClass('active');
        $('.cont').hide();
        $('.signin-cont').show();
    } 
    if ($(this).hasClass('signup')) {
        $('.tabs .tab').removeClass('active');
        $(this).addClass('active');
        $('.cont').hide();
        $('.signup-cont').show();
    }
});
</script>






