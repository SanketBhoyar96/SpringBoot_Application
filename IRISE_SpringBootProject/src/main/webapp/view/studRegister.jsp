<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/35ba19eeb2.js"
	crossorigin="anonymous"></script>
<script type="text/javascript" src="/js/studRegister.js"></script>
<link rel="stylesheet" href="/css/studRegister.css">
<style>
#centerBlock{
   display: flex;
   justify-content: center;
   align-items: center;
}
#centerBlock>a{
   color: black;
   font-weight: 500
   }
#centerBlock>a>span{
   color: purple;
   }
</style>
</head>
<body>
	<!-- header-start -->
	  <%@include file="Header.jsp" %>
		<!-- header-end -->
		<!--  -->      
		
		
      <div id="login-card" class="card">
		<div class="card-body">
			<h2 class="text-center">Student Register</h2>
			<br>
			<form>
			<div class="form-group">
					<input type="text" class="form-control" id="fname"
						placeholder="Enter First Name" name="password"  onchange="validate()"  required>
						
						<span id="fnameErrorId" style="display: none; color: red;">Please Enter Valid First Name</span>
				</div>
				<div class="form-group">
					<input type="text" class="form-control" id="lname"
						placeholder="Enter Last Name" name="password"  onchange="validate()"  required>
						<span id="lnameErrorId" style="display: none; color: red;">Please Enter Valid Last Name</span>
				</div>
				<div class="form-group">
					<input type="number" class="form-control" id="mobileno"
						placeholder="Enter Phone" name="mobileno"  onchange="validate()"  required>
						<span id="mobilenoErrorId" style="display: none; color: red;">Please Enter Valid MobileNo</span>
				</div>
				<div class="form-group">
					<input type="email" class="form-control" id="studemail"
						placeholder="Enter Email" name="email"  onchange="validate()"  required>
						<span id="emailErrorId" style="display: none; color: red;">Please Enter Valid Email</span>
				</div>
				
				<div class="form-group">
					<input type="password" class="form-control" id="password"
						placeholder="Enter Password" name="password"  onchange="validate()"  required>
						<span id="passwordErrorId" style="display: none; color: red;">Please Enter Valid Password</span>
				</div>
				<button type="submit" id="button"
					class="btn btn-primary deep-purple btn-block "
					onclick="saveStud()">Login</button>
			</form>
			      <div id="centerBlock">
					<a href="/login"><span>Already Account?</span>Login</a>			      
			      </div>
			 </form>
		</div>
	</div>
      
		<!--  -->
		<!--footer-->
		  <%@include file="footer.jsp" %>
		<!--footer-->
		
	
</body>
</html>