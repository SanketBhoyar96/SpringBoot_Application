<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Dashboard</title>
<link rel="stylesheet" href="/css/studentDashboard.css">
<style>
     
</style>
</head>
<body>
	<!-- header-start -->
      <%@include file="Header.jsp" %>
		<!-- header-end -->

<div class="container">
    <h2 style="text-align: center; color: red; font-weight: 800">Student Record</h2>
    <div class="row">
  <div id="divCenter">
		<button>
			<a style="color: white; text-decoration: none;" href="/courses">Courses</a>
		</button>
		<button>
			<a style="color: white; text-decoration: none;" href="/setting">Setting</a>
		</button>
	</div>
        <div class="col-md-12">
            <table class="table">
                <tr class="table-header">
                    <th class="cell">CourseID</th>
                    <th class="cell">CourseName</th>
                    <th class="cell">Duration</th>
                    <th class="cell">Fees</th>
                    <th class="cell">Action</th>
                    
                </tr>
                <tr  class="active">
                    <td>1</td>
                    <td>Java</td>
                    <td>2</td>
                    <td>12000</td>
                    <td></td>
                    
                </tr>
                <tr  class="active">
                    <td>1</td>
                    <td>Java</td>
                    <td>2</td>
                    <td>12000</td>
                    <td></td>
                    
                </tr>
                <tr  class="active">
                    <td>1</td>
                    <td>Java</td>
                    <td>2</td>
                    <td>12000</td>
                    <td></td>
                    
                </tr>
            </table>
        </div>
    </div>
</div>

<!-- -footer -->
		<%@include file="footer.jsp" %>
		<!-- -footer -->
</body>
</html>