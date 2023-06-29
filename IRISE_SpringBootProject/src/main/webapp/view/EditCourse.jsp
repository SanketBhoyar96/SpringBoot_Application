<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Course</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript" src="/js/adminDashboard.js"></script>
<link rel="stylesheet" href="/css/EditCourse.css">
<style type="text/css">

</style>
</head>
<body>
	<div id="containerParent">
		  <div id="userformId">
		  <h2>Update Course</h2>
             <label>CourseId<span>*</span></label><br>
		   	 <input type="number" placeholder="Enter CourseId" id="courseid" ><br><br>
		   	 
		   	  
		   	<label>CourseName<span>*</span></label><br>
			<input type="text" placeholder="Enter Last Name" id="coursename"><br><br>
			
			
			<label>Duration<span>*</span></label><br>
			<input type="number" placeholder="Enter Duration" id="duration" ><br><br>
			
			
			<label>Fees<span>*</span></label><br>
			<input type="number" placeholder="Enter Fees" id="fees"><br><br>
				
			<div id="savebutton">
			<input  type="button" value="Update Course" id="savebuttonId" onclick="updateCourse()"><br><br>
			</div>
			<a id="Centertext" href="/admindashboard" style="text-align: center; margin-left: 80px" >Move to AdminDashboard </a>

		</div>
	</div>
	

</body>
</html>
	