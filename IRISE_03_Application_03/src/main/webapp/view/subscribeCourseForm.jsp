<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript" src="/js/getAllCourseFrontend.js"></script>
<link rel="stylesheet" href="/css/subscribeCourseForm.css">
</head>
<body>
	<!-- header-start -->
	<%@include file="Header.jsp"%>
	<!-- header-end -->



	<div id="containerParent">
		<div id="userformId">
			<h3>Apply Course</h3>
			<!-- -Hide data from user set default -->
			<input style="display: none;" type="number"placeholder="Enter First Name" id="courseid">
			<input style="display: none;" type="text"placeholder="Enter First Name" id="coursename">
			<input style="display: none;" type="number"placeholder="Enter First Name" id="duration">
			<input style="display: none;" type="number"placeholder="Enter First Name" id="fees">
			
			
		
			<input type="text"placeholder="Enter First Name" id="fname"><br><br>
			
			
			<input type="text" placeholder="Enter Last Name" id="lname"><br><br>

			
			 <input type="email" placeholder="Enter Email" id="studemail"><br><br>
				
				
			<input type="text" placeholder="Enter Address" id="address"><br><br>

		
			<input type="number" placeholder="Enter contact" id="contact"><br><br>
			
			
			<input type="text" placeholder="Enter Education" id="education"><br><br>


			<div id="savebutton">
				<input type="button" value="Apply Course" onclick="savedApplyCoursestud()" id="savebuttonId">
				
			</div>
			<a id="Centertext" href="/"
				style="text-align: center; margin-left: 75px">Select Courses Page</a>

		</div>
	</div>


	<!-- -footer -->
	<%@include file="footer.jsp"%>
	<!-- -footer -->
</body>
</html>
>
