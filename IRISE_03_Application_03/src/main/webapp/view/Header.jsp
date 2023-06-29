<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/35ba19eeb2.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="/css/index.css">

</head>
<body>
	<!-- header-start -->
	<header id="home">
		<div class="header-area">

			<!-- header-top -->
			<div class="header-top primary-bg">
				<div class="container">
					<div class="row">
					<div class="col-xl-4 col-lg-4 col-md-4 col-12 cart-login-btn">
					
							<div class="header-contact-info d-flex">
								<div class="header-contact header-contact-phone">
									<span class="text-white text">For Course Enquiry -</span> <span
										class="fa fa-phone-alt"></span>
									<p class="phone-number">
										<a href="tel:+91 9985396677" style="color: #002147;">+91
											9985396677</a>
									</p>
								</div>
							</div>
						</div>

							<div class="col-xl-8 col-lg-8 col-md-8 col-12">
							<div class="header-bottom-icon f-right">
								<ul>
									<li>
										<div class="row">

											<div class="col-12">

												<div>

													<% 
												      if(request.getSession(false).getAttribute("studentLogin") != null){%>

													<button class="btn btn-primary top-button"
														data-modal-target="">
														<i class="fa fa-user"></i><a >MyACCOUNT</a>
													</button>
													
													
													<button class="btn btn-primary top-button"
														data-modal-target="">
														<i class="fa fa-sign-out"></i><a href="/logout" >Logout</a>
													</button>
													
												
													  <% }else{ %>

							

													<button class="btn btn-primary top-button"
														data-modal-target="">
														<i class="fa fa-unlock"></i><a href="/login">Login</a>
													</button>

													<%  } %>

												</div>
												<div id="overlay"></div>
											</div>

										</div>

									</li>

									<li style="visibility: hidden; margin-left: -45px;">

										<div class="row">

											<div class="col-12">

												<div id="newsletter">
													<button class="btn btn-primary top-button"
														data-modal-target="#regmodal" onclick="register();">R</button>

												</div>
												<div id="overlay"></div>
											</div>

										</div>
							</div>

							</li>
							</ul>
						</div>
					</div>

				</div>
			</div>
			<!-- header-top -->
		</div>

		<!-- header-start ----------------------------------------------------------------------------------------------->
		<header id="home">
			<div class="header-area">

				<div class="header-icons">
					<div class="container">
						<div class="row">
							<div class="col-xl-8 col-lg-8 col-md-8 col-12">
								<div class="logo">
									<a href="/"> <img
										src="https://pbs.twimg.com/profile_images/1478663702135988224/J8N6jtuw_400x400.jpg"
										alt="logo2" height="75px" width="150px">
									</a>
								</div>
							</div>
							<div
								class="col-xl-4 col-lg-4 col-md-4 col-12 d-lg-block d-md-none d-none">

								<div class="rounded-social-buttons">
									<a class="social-button whatsup"
										href="https://api.whatsapp.com/send?phone=+91-9689750969&text=Hello, I Want to discus with you regarding "
										target="_blank"><i class="fab fa-whatsapp"></i></a> <a
										class="social-button twitter " href=""><i
										class="fab fa-twitter"></i></a> <a class="social-button youtube"
										href=""><i class="fab fa-youtube"></i></a> <a
										class="social-button facebook" href="" target="_blank"><i
										class="fab fa-facebook"></i></a> <a
										class="social-button instagram" href=""><i
										class="fa fa-instagram"></i></a>
								</div>
							</div>
						</div>

					</div>
				</div>

				<!-- header-bottom-------------------------------------------------------------------------------------- -->
				<div class="header-bottom-area primary-bg header-sticky"
					style="transition: .6s;">
					<div class="container">
						<div class="row align-items-center">
							<div class="col-xl-12 col-lg-12 col-md-12 col-12 cart-login-btn">

								<div
									class="main-menu justify-content-between align-items-center w-100">
									<nav id="mobile-menu" style="display: block;">
										<ul class="mx-auto text-center">
											<li><a href=""> Home</a></li>

								
											<li><a href=""> Courses Offering </a></li>
											<li><a href=""> Training Schedules <i
													class="fa fa-angle-down" aria-hidden="true"></i></a>
												<ul class="submenu">
													<li><a href="">Online Training</a></li>
													<li><a href="">Classroom Training</a></li>
													<li><a href="">Weekend Workshops</a></li>
													<li><a href="">Free Training</a></li>
												</ul></li>

											<li><a href=""> Careers <i class="fa fa-angle-down"
													aria-hidden="true"></i>
											</a>
												<ul class="submenu">
													<li><a href="">Placements</a></li>
													<li><a href="">Internship</a></li>
													<li><a href="">Interview Questions</a></li>
													<li><a href="">Blog</a></li>
												</ul></li>
											<li><a href="">About Us</a></li>
											<li><a href="">Contact Us</a></li>
											<!--<li>
                                  <a href="https://ashokitech.com/ashokit-blog">Blog</a>
                              </li>-->

										</ul>
									</nav>
								</div>
							</div>
							<div class="col-12">
								<div class="mobile-menu"></div>
							</div>
						</div>
					</div>
				</div>
				<!-- /end header-bottom-------------------------------------------------------------------------- -->
			</div>
		</header>
		<!-- header-end -->

		<!-- -FORM -->
		<!--form  -->
		
</body>
</html>