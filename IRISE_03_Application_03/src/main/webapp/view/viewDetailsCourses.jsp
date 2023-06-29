<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Lecture</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript" src="/js/getAllCourseFrontend.js"></script>
<style>
#subscribe{
   margin: auto;
   width: 20%;
}
#subscribe>button{
width: 80%;
margin:auto;
border:none;
border-radius:10px;

	padding: 5px;
	margin: 5px;
	background-color:#ec2025;
	color: white;
	}
#aboutCourses {
	display: flex;
	justify-content: space-around;
	align-items: center;
	background-color: #595961;
	width: 100%;
}
#leftboard>h2{
  color: white;
  font-weight: 800;
}
#leftboard>h2>input{
background-color: #595961;
border:none;
font-size:40px; 
color:white;
font-weight: 800; 

}
#leftboard>span{
  color: white;
  margin: 8px;
}
#Righttboard {
	border: 1px solid red;
	width: 25%;
	background-color: #6c6c6c;
	border: none;
	margin: 20px
}

#right>button{
	width: 90%;
	padding: 5px;
	text-align: center;
	margin: 5px;
	margin-left: 8px;
	background-color:#ec2025;
	color: white;
	border: none;
}
#right{
  margin: auto;
  width: 80%;
  padding: 10px;
  
}
#right>h5{
  color: white;
}
#right>h5>input{
width: 40px;font-size:20px; color:#FFD700; background:#6c6c6c; border: none;

}
#Righttboard>#right>h5>span{
color:#FFD700; font-weight: 800;
}

.checked {
  color: orange;
}
</style>
</head>
<body>

	<!-- header-start -->
       <%@include file="Header.jsp" %>
		<!-- header-end -->
	<!-- --------------------------------------ViewLectrureDemo Video------------------------------------------- -->
  
           
	<div id="aboutCourses">

		<div id="leftboard">
		
           <!-- using text  <h2 id="courseid"></h2> -->  
              
              
			<h2><input type="text"id="coursename" readonly ><br><br></h2>
			<span><i class="fa-solid fa-id-card"></i>Live Course</span>
			<span><i class="fa-solid fa-camera-retro"></i>Free Preview Available</span>


		</div>
		<div id="Righttboard">

			<div id="right">


				<h5>Duration::<input type="Number"id="duration" readonly ><span>Months</span></h5>
				<h5>Price::<input style="width: 80px;" type="Number"id="fees" readonly ><span>Rs</span></h5>
				<h5>Rating::<span class="fa fa-star checked">
				             </span><span class="fa fa-star checked"></span><span class="fa fa-star checked"></span>
                 <span class="fa fa-star"></span>
                <span class="fa fa-star"></span></h5>
                
				<button>Watch Demo Class</button>
				<button>Download Course Content</button>

			</div>

		</div>


	</div>
	   
	   <div id="subscribe"> 
	    <!-- -COMMENT-->
          <!-- <button onclick="findSubsribeCourse()">viewDetails</button>  -->
           <!-- <<button onclick="findSubsribeCourseById()">Subscribe</button>  -->
            <!-- <button onclick="findSubsribeCourse()">viewDetails</button>  -->
	   </div>


	<!-- --------------------------------------ViewLectrure------------------------------------------- --
        
    <!-- -footer -->
		<%@include file="footer.jsp" %>
		<!-- -footer -->

</body>
</html>