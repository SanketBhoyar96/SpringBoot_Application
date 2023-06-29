<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript" src="/js/getAllCourseFrontend.js"></script>
<link rel="stylesheet" href="/css/studMakePayment.css">
</head>
<body>
	<!-- header-start -->
	<%@include file="Header.jsp"%>
	<!-- header-end -->



	<div id="containerParent">
		<div id="userformId">
			<h3>Payment Course</h3>
			<!-- -Hide data from user set default---------------------------------------------- -->
			<input style="display:none;" type="number"placeholder="Enter First Name" id="courseid">
			<input style="display:none;" type="number"placeholder="Enter First Name" id="courseid">
			<input style="display:none;" type="text"placeholder="Enter First Name" id="coursename">
			<input style="display:none;" type="number"placeholder="Enter First Name" id="fees">
			
			<!-- -------------------------------------------------------------------------- -->
		    <label>cardExpiry Date</label>
			<input type="month"placeholder="Enter cardExpiry Month" id="cardExpiry"><br><br>
			
			
			<input type="number" placeholder="Enter cvv" id="cvv"><br><br>

			
			 <input type="text" placeholder="Enter fullName" id="fullName"><br><br>
				
				
			<input type="text" placeholder="Enter billingAddress" id="billingAddress"><br><br>


			<div id="savepayment">
				
				<input type="button" value="Payemnt" onclick="" id="savebuttonId">
				
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
