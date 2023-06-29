<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript" src="/js/studRegister.js"></script>
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
		  <h2>Register Student</h2>
<!--<label>FirstName<span>*</span></label><br>--->
		   	 <input type="text" placeholder="Enter First Name" id="fname" onchange="validate()" >
		   	 <span id="fnameErrorId" style="display: none; color: red;">Please Enter Valid First Name</span><br><br>
		   	  
		   	<!--<label>LastName<span>*</span></label><br>--->
			<input type="text" placeholder="Enter Last Name" id="lname" onchange="validate()">
			<span id="lnameErrorId" style="display: none; color: red;">Please Enter Valid Last Name</span><br><br>
			
			<!--<label>PhoneNo<span>*</span></label><br>--->
			<input type="number" placeholder="Enter PhoneNo" id="mobileno" onchange="validate()">
			<span id="mobilenoErrorId" style="display: none; color: red;">Please Enter Valid MobileNo</span><br><br>
			
			<!--<label>Email<span>*</span></label><br>--->
			<input type="email" placeholder="Enter Email" id="studemail" onchange="validate()">
			<span id="emailErrorId" style="display: none; color: red;">Please Enter Valid Email</span><br><br>
			
			<!--<label>Password<span>*</span></label><br>---> 
			<input type="password" placeholder="Enter Password" id="password" onchange="validate()">
			<span id="passwordErrorId" style="display: none; color: red;">Please Enter Valid Password</span><br><br>
				
			<div id="savebutton">
			<input  type="button" value="REGISTER" id="savebuttonId" onclick="saveStud()">
			</div>
			<a id="Centertext" href="/login" style="text-align: center; margin-left: 80px" >Already Account? Login </a>

		</div>
	</div>
	
	
	<!-- -footer -->
		<%@include file="footer.jsp" %>
		<!-- -footer -->
</body>
</html>
	