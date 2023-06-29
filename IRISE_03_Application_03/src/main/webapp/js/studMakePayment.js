/**
 * 
 */
$(document).ready(function() {
	alert("load")
	findpaymentCourse();
	findPaymentCourseById();
});



 //-------------------------------------------------------------------------------------------------
  function findpaymentCourse() {

	var settings = {
		"url": "/course/getAllcourse",
		"method": "GET",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {
		console.log(response);
 
           //  $('#savebutton').append('<type="button" value="Make Payment" id="savebuttonId" onclick="savedStudPayment(' + response.courseId + ')"></i>Make Payment</button>')
	          //   $('#savebutton').append('<input type="button" value="Make Payment" id="savebuttonId" onclick=" savedStudbyId(' + response.courseId + ')">')
		});

}

                                //subscribe call function start 2
function savedStudbyId(courseId) {
	window.location = "/editcourse?courseId=" + courseId;
}

function findPaymentCourseById() {

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
			window.location = "/";
		}

	});
}

//--------------------------------------------------------------------------------------------------------

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
			window.location="/";
		} else {
			alert(response.Massage)
			window.location="/subscribeCourseForm";
		}
});
 }
 