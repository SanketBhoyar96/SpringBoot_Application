/**
 * 
 */

$(document).ready(function() {
		//alert("msg")
		findAllCourse();
		findCourseById();
		
		//==============================
		findSubsribeCourse();
		findSubsribeCourseById();
		//===============================
		 findpaymentCourse();
	    findPaymenttCourseById();
});


 
 function findAllCourse() {

	var settings = {
		"url": "/course/getAllcourse",
		"method": "GET",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {
		console.log(response);

		response.forEach(function(obj, index) {

			$('#showCourseAll').append('<div id="box"><img src="https://ashokitech.com/uploads/course/python-fullstack-online-training.jpeg" alt=""" width="296px" height="170px"><span>ID::<i>' + obj.courseId + '</i></span><br><span>CourseName::<i>'
				+ obj.courseName + '</i></span><br><span>Duration::<i>'
				+ obj.duration + 'Months</i></span><br><i>Fees::<b>'
				+ obj.fees + '</b></i><br><button onclick="preview(' + obj.courseId + ')"><i class="fa-solid fa-magnifying-glass"></i>Preview</button><button style="background-color: red; border:none;" onclick="viewDetails(' + obj.courseId + ')"><i class="fa-regular fa-eye"></i>View Details</button></div>')

		});
	});

}

function viewDetails(courseId) {
	window.location = "/viewCourses?courseId=" + courseId;
}

function findCourseById() {

	var url = window.location.href;
	var splitter = url.split('=');
	var courseId = splitter[1];

	var settings = {
		"url": "/course/findbyId?courseId=" + courseId,
		"method": "GET",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {
		console.log(response);

		if (response != null) {
			//alert("work")
			
			// NOTES 
			$('#courseid').text(response.courseId);
			$('#coursename').val(response.courseName);
			$('#duration').val(response.duration);
			$('#fees').val(response.fees);
			
			         //    ORRRR
			         
		    //$('#courseid').text(response.courseId);
			//$('#coursename').text(response.courseName);
			//$('#duration').text(response.duration);
			//$('#fees').text(response.fees);

		} else {
			window.location = "/";
		}

	});
}




//======================================  //subscribe call function start 1==================================
 function findSubsribeCourse() {

	var settings = {
		"url": "/course/getAllcourse",
		"method": "GET",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {
		console.log(response);

	      // $('#savebutton').append('<input type="button" value="Apply Course list" onclick="savedApplyCoursestud(' + obj.courseId + ')" id="savebuttonId">') 
	       //<input type="button" value="Apply Course" onclick="savedApplyCoursestud()" id="savebuttonId">   
	      // savedApplyCoursestud
		});

}

                                //subscribe call function start 2
function subscribe(courseId) {
	window.location = "/subscribeCourseForm?courseId=" + courseId;
	
}


function findSubsribeCourseById() {
      
	var url = window.location.href;
	var splitter = url.split('=');
	var courseId = splitter[1];

	var settings = {
		"url": "/course/findbyId?courseId=" + courseId,
		"method": "GET",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {
		console.log(response);

		if (response != null) {
			//alert("work")
			
			  $('#subscribe').append('<button onclick="subscribe(' + response.courseId + ')"></i>Subsribe</button>')
			  
			  
			  
			// NOTES 
			$('#courseid').val(response.courseId);
			$('#coursename').val(response.courseName);
			$('#duration').val(response.duration);
			$('#fees').val(response.fees);
			
			         //    ORRRR
			         
		    //$('#courseid').text(response.courseId);
			//$('#coursename').text(response.courseName);
			//$('#duration').text(response.duration);
			//$('#fees').text(response.fees);

		} else {
			window.location = "/";
		}

	});
}

 //===========================================savedAApplayCoures===================================================
 
 function savedApplyCoursestud(){
	 
	 alert("work")
	 var fName = $('#fname').val();
	var lName = $('#lname').val();
	var studEmail = $('#studemail').val();
	var address = $('#address').val();
	var contact = $('#contact').val();
	var education = $('#education').val();
	
	var courseid = $('#courseid').val();
	var coursename = $('#coursename').val();
	var duration = $('#duration').val();
	var fees = $('#fees').val();
	 
	 var settings = {
  "url": "/applyCourseStud/savedApplyCourse",
  "method": "POST",
  "timeout": 0,
  "headers": {
    "Content-Type": "application/json"
  },
  "data": JSON.stringify({
    "firstName":fName,
    "lastName":lName,
    "email":studEmail,
    "address": address,
    "contact":contact,
    "education":education,
    "duration":duration,
    "courseId":courseid,
     "courseName":coursename,
    "localDate":new Date(),
    "fees":fees
  }),
};

$.ajax(settings).done(function (response) {
  console.log(response);
  if (response.status == true) {
			alert(response.Massage)
			window.location="/Makepayment";
		} else {
			alert(response.Massage)
			window.location="/register";
		}
});
 }
 //----------------------------------------------------------Payment------------------------------------------------------------------



//------------------------------------------------Payment--------------------------------------------------------

 function savedStudPayment(){
	 
	var cardExpiry = $('#cardExpiry').val();
	var cvv = $('#cvv').val();
	var fullName = $('#fullName').val();
	var billingAddress = $('#billingAddress').val()
	var courseId = $('#courseId').val();
	var courseName = $('#courseName').val();
	var fees = $('#fees').val();

	 
	 var settings = {
  "url": "/payment/pymntSaved",
  "method": "POST",
  "timeout": 0,
  "headers": {
    "Content-Type": "application/json"
  },
  "data": JSON.stringify({
    "cardExpiry":cardExpiry,
    "cvv":cvv,
    "fullName":fullName,
    "billingAddress":billingAddress,
    "courseId":courseId,
    "courseName":courseName,
    "fees":fees
  }),
};

$.ajax(settings).done(function (response) {
  console.log(response);
  if (response.status == true) {
			alert(response.Massage)
			window.location="/Makepayment";
		} else {
			alert(response.Massage)
			window.location="/subscribeCourseForm";
		}
});
 }
 

