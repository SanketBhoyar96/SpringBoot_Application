/**
 * 
 */

$(document).ready(function() {
	findAllCourse();
	findCourseById()
	// alert("Working FindAllproduct");
});

//=======================================================================
function addnewCourse() {
	var coursename = $('#coursename').val();
	var duration = $('#duration').val();
	var fees = $('#fees').val();

	var settings = {
		"url": "/course/saveCourse",
		"method": "POST",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json"
		},
		"data": JSON.stringify({
			"courseName": coursename,
			"duration": duration,
			"fees": fees
		}),
	};

	$.ajax(settings).done(function(response) {
		console.log(response);
		if (response.status == true) {
			alert(response.Massage);
			window.location = "/admindashboard"
		} else {
			window.location = "/addProduct.htm"
		}
	});
}


//==========================================================================
function findAllCourse() {

	var settings = {
		"url": "/course/getAllcourse",
		"method": "GET",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {
		console.log(response);

		response.forEach(function(obj, index) {

			$('#coursebodyId').append('<tr><td>' + obj.courseId + '</td><td>'
				+ obj.courseName + '</td><td>'
				+ obj.duration + '</td><td>Rs.'
				+ obj.fees + '</td>'
				+ '<td><button onclick="edit(' + obj.courseId + ')">Edit</button><button onclick="deleteCourse(' + obj.courseId + ')">Delete</button></td></tr>')

		});
	});

}



//========================================================================================
function deleteCourse(courseId) {

	var settings = {
		"url": "/course/deleteById?courseId=" + courseId,
		"method": "DELETE",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {
		console.log(response);

		if (response.status == true) {
			alert(response.message)
			window.location = "/admindashboard"
		} else {
			alert(response.message)
			window.location = "/admindashboard"
		}
	});
}


//===================================================================================



function edit(courseId) {
	window.location = "/editcourse?courseId=" + courseId;
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
			$('#courseid').val(response.courseId);
			$('#coursename').val(response.courseName);
			$('#duration').val(response.duration);
			$('#fees').val(response.fees);

		} else {
			window.location = "/editcourse";
		}

	});
}

function updateCourse() {
	//alert("update")
	//update Values
	var courseId = $('#courseid').val();
	var coursename = $('#coursename').val();
	var duration = $('#duration').val();
	var fees = $('#fees').val();

	var settings = {
		"url": "/course/updateCourse?courseId=" + courseId,
		"method": "POST",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json"
		},
		"data": JSON.stringify({
			"courseName": coursename,
			"duration": duration,
			"fees": fees
		}),
	};

	$.ajax(settings).done(function(response) {
		console.log(response);

		if (response != null) {
			alert(response.message);
			window.location = "/admindashboard?courseId=" + courseId;
		} else {
			alert(response.message);
		}

	});



}

