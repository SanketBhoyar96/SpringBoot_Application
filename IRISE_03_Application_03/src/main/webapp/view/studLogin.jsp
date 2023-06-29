<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript" src="/js/studLogin.js"></script>
<link rel="stylesheet" href="/css/studRegister.css">
<style type="text/css">

</style>
</head>
<body>
	<!-- header-start -->
       <%@include file="Header.jsp" %>
		<!-- header-end -->
		
		
	<div id="containerParent">
		  <div id="userformId">
		  <h2>Login Student</h2>
			<label>Email<span>*</span></label><br>
			<input type="email" placeholder="Enter Email" id="studemail" onchange="validate()">
			<span id="emailErrorId" style="display: none; color: red;">Please Enter Valid Email</span><br><br>
			
			<label>Password<span>*</span></label><br> 
			<input type="password" placeholder="Enter Password" id="password" onchange="validate()">
			<span id="passwordErrorId" style="display: none; color: red;">Please Enter Valid Password</span><br><br>
				
			<div id="savebutton">
			<input  type="button" value="Login" id="savebuttonId" onclick="studLogin()">
			</div>
			<a id="Centertext" href="/register" style="text-align: center; margin-left: 80px" >Don't Account?Register </a>

		</div>
	</div>
	
	<!-- -footer -->
		<%@include file="footer.jsp" %>
		<!-- -footer -->
</body>
</html>
	