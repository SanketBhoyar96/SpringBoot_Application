<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Alegreya+Sans" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" type="text/css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<style>
      h1{
           font-size:30px;
        }
        /*Table Style One*/
        .table .table-header{
            background:#FEC107;
            color:#333;
        }
        .table .table-header .cell{
            padding:20px;
        }
        @media screen and (max-width: 640px){
            table {
                overflow-x: auto;
                display: block;
            }
            .table .table-header .cell{
                padding:20px 5px;
            }
        }
</style>
</head>
<body>
	<!-- header-start -->
       <%@include file="Header.jsp" %>
		<!-- header-end -->

<div class="container">
    <h2 style="text-align: center; color: red; font-weight: 800">Student Record</h2>
    <div class="row">
        <div class="col-md-12">
            <table class="table">
                <tr class="table-header">
                    <th class="cell">S.no</th>
                    <th class="cell">Name</th>
                    <th class="cell">Username</th>
                    <th class="cell">Address</th>
                    <th class="cell">Email Id</th>
                    <th class="cell">Phone No.</th>
                </tr>
                <tr  class="active">
                    <td>1</td>
                    <td>Smith</td>
                    <td>Smith Mark</td>
                    <td>#67/B Maxico Usa</td>
                    <td>mark@gmail.com</td>
                    <td>+3755438764</td>
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