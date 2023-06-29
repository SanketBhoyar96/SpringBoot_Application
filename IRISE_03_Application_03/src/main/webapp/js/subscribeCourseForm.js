/**
 * 
 */

$(document).ready(function() {
		//alert("msg")
		findAllCourse();
		findCourseById();
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

			$('#savebutton').append('<div><button onclick="subscribe(' + obj.courseId + ')"></i>Subsribe</button></div>')

		});
	});

}


function subscribe(courseId) {
	window.location = "/subscribeCourseForm?courseId=" + courseId;
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

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 function validate() {
	var isValidated = false;


	var validRegex = /^\w+([\.-]?\w+)@\w+([\.-]?\w+)(\.\w{2,3})+$/;

		var studEmail = $('#studemail').val();
	if (studEmail == "" || validRegex.test(studEmail) != true) {

		$("#emailErrorId").css("display", "block");
		return false;
		isValidated = false;
	} else {

		$("#emailErrorId").css("display", "none");
		isValidated = true;

	}

	return isValidated;
}