<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript" src="/js/adminDashboard.js"></script>
<link rel="stylesheet" href="/css/adminDashboard.css">
<style>
     
</style>
</head>
<body>
	<!-- header-start -->
       <%@include file="Header.jsp" %>
		<!-- header-end -->

<div class="container">
    <h2 style="text-align: center; color: red; font-weight: 800">Admin Dashboard</h2>
    <div class="row">
  <div id="divCenter">
		<button>
			<a style="color: white; text-decoration: none;" href="addProduct.html">CoursesList</a>
		</button>
		<button>
			<a style="color: white; text-decoration: none;" href="addProduct.html">StudentList</a>
		</button>
		<button>
			<a style="color: white; text-decoration: none;" href="addProduct.html">Setting</a>
		</button>
		<button>
			<a style="color: white; text-decoration: none;" href="/addcourse">Add Course</a>
		</button>
	</div>
        <div class="col-md-12">
            <table class="table">
            <thead>
                <tr class="table-header">
                    <th class="cell">CourseID</th>
                    <th class="cell">CourseName</th>
                    <th class="cell">Duration</th>
                    <th class="cell">Fees</th>
                    <th class="cell">Action</th>
                    
                </tr>
               
            </thead>
                <tbody id="coursebodyId">
                
                
                </tbody>
            </table>
        </div>
    </div>
</div>

<!-- -footer -->
		<%@include file="footer.jsp" %>
		<!-- -footer -->
</body>
</html>