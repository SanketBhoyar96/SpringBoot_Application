<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/35ba19eeb2.js"
	crossorigin="anonymous"></script>
<script type="text/javascript" src="/js/studRegister.js"></script>
<link rel="shortcut icon"
	href="https://ashokitech.com/uploads/settings/general_settings_1639053735_1412244780.jpg">
<link rel="shortcut icon" type="image/x-icon"
	href="https://ashokitech.com/assets/frontend/img/favicon.png">
<!-- Place favicon.ico in the root directory -->
<link rel="stylesheet" href="/css/index.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- CSS here -->
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/owl.carousel.min.css">
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/animate.min.css">
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/magnific-popup.css">
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/fontawesome-all.min.css">
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/themify-icons.css">
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/slick.css">
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/meanmenu.css">
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/default.css">
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/style.css">
<link rel="stylesheet"
	href="https://ashokitech.com/assets/frontend/css/responsive.css">

<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script
	src="https://cdn.datatables.net/1.11.1/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.11.1/css/jquery.dataTables.min.css">

<link
	href="https://ashokitech.com/assets/frontend/vendor/fontawesome/css/all.min.css"
	rel="stylesheet">
<link
	href="https://ashokitech.com/assets/frontend/vendor/owl.carousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link
	href="https://ashokitech.com/assets/frontend/vendor/icofont/icofont.min.css"
	rel="stylesheet">
<script
	src="https://ashokitech.com/assets/frontend/vendor/owl.carousel/owl.carousel.min.js"></script>
<script
	src="https://ashokitech.com/assets/frontend/js/carausol_slider.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<style>
label {
	font-weight: 600;
	color: #666;
}

body {
	background: #f1f1f1;
}

.box8 {
	box-shadow: 0px 0px 5px 1px #999;
}

.mx-t3 {
	margin-top: -3rem;
}
</style>
</head>
<body>
	<!-- header-start -->
	  <%@include file="Header.jsp" %>
		<!-- header-end -->
		<!--  -->
			<div class="container mt-3">
        <form>
          <div class="row jumbotron box8">
            <div class="col-sm-12 mx-t3 mb-4">
              <h4 class="text-center text-info">Student Register</h4>
            </div>
            <div class="col-sm-6 form-group">
              <label for="name-f">First Name</label>
              <input type="text" class="form-control" name="fname" id="fname" placeholder="Enter your first name." required>
            </div>
            <div class="col-sm-6 form-group">
              <label for="name-l">Last Name</label>
              <input type="text" class="form-control" name="lname" id="lname" placeholder="Enter your last name." required>
            </div>
            <div class="col-sm-6 form-group">
              <label for="address-1">Address</label>
              <input type="address" class="form-control" name="Locality" id="address" placeholder="Locality/House/Street no." required>
            </div>
            <div class="col-sm-4 form-group">
              <label for="tel">Phone</label>
              <input type="tel" name="phone" class="form-control" id="mobileno" placeholder="Enter Your Contact Number." required>
            </div>
            <div class="col-sm-6 form-group">
              <label for="email">Email</label>
              <input type="email" class="form-control" name="email" id="email" placeholder="Enter your email." required>
            </div>
            <div class="col-sm-6 form-group">
              <label for="pass">Password</label>
              <input type="Password" name="password" class="form-control" id="password" placeholder="Enter your password." required>
            </div>
      
            <div class="col-sm-12 form-group mb-0">
              <button class="btn btn-primary float-right" onclick="saveStud()">Login</button>
            </div>
            <a href="/login" style="font-weight: 600" >Already Account?Login</a>
      
          </div>
        </form>
      </div>
		<!--  -->
		<!--footer-->
		  <%@include file="footer.jsp" %>
		<!--footer-->
		
	
</body>
</html>