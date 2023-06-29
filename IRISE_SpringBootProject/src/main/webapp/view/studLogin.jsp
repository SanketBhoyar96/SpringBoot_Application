<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://kit.fontawesome.com/35ba19eeb2.js"
	crossorigin="anonymous"></script>
<script type="text/javascript" src="/js/studLogin.js"></script>
<link rel="stylesheet" href="/css/studLogin.css">

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
	<%@include file="Header.jsp"%>
	<!-- header-end -->

	<div id="login-card" class="card">
		<div class="card-body">
			<h2 class="text-center">Login form</h2>
			<br>
			<form>
			<div class="form-group">
			  <label>Email</label>
					<input type="email" class="form-control" id="studemail"
						placeholder="Enter Email" name="email"  onchange="validate()"  required>
						<span id="emailErrorId" style="display: none; color: red;">Please Enter Valid Email</span>
				</div>
				<label>Password</label>
				<div class="form-group">
					<input type="password" class="form-control" id="studPassword"
						placeholder="Enter Password" name="password" onchange="validate()" required>
						<span id="passwordErrorId" style="display: none; color: red;">Please Enter Valid Password</span>
				</div>
				<button type="submit" id="button"
					class="btn btn-primary deep-purple btn-block "
					onclick="studLogin()">Login</button>
			</form>
			      <div id="centerBlock">
					<a href="/register"><span>User Not?</span> Register</a>			      
			      </div>
			 </form>
		</div>
	</div>


	<!-- -footer -->
	<%@include file="footer.jsp"%>
	<!-- -footer -->
</body>
</html>