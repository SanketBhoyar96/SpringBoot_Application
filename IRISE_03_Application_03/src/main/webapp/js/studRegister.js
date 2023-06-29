/**
 * 
 */

function saveStud() {
	var studFirstName = $('#fname').val();
	var studLastName = $('#lname').val();
	var studEmail = $('#studemail').val();
	var studPassword = $('#password').val()
	var studMobileNo = $('#mobileno').val();

	if (validate()){

		var settings = {
			"url": "/student/register",
			"method": "POST",
			"timeout": 0,
			"headers": {
				"Content-Type": "application/json"
			},
			"data": JSON.stringify({
				"studFirstName": studFirstName,
				"studLastName": studLastName,
				"studEmail": studEmail,
				"studPassword": studPassword,
				"studMobileNo": studMobileNo,
				"role": "USER",
				"date": new Date()
			}),
		}

	$.ajax(settings).done(function(response) {
		console.log(response);
		if (response.status == true) {
			alert(response.Massage)
			window.location="/login";
		} else {
			alert(response.Massage)
			window.location="/register";
		}
	});
	
	}else{
		validate();
	}

}






function validate() {
	var isValidated = false;

	//alert("hii")

	var studFirstName = $('#fname').val();


	if (studFirstName == "") {

		$("#fnameErrorId").css("display", "block");

		return false;
		isValidated = false;

	} else {

		$("#fnameErrorId").css("display", "none");
		isValidated = true;
	}


	var studLastName = $('#lname').val();

	if (studLastName == "") {

		$("#lnameErrorId").css("display", "block");

		return false;
		isValidated = false;
	} else {

		$("#lnameErrorId").css("display", "none");
		isValidated = true;

	}


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


	var studPassword = $('#password').val()

	if (studPassword.match(/[a-z]/g) && studPassword.match(/[A-Z]/g) && studPassword.match(/[0-9]/g) && studPassword.match(/[^a-zA-Z\d]/g) && studPassword.length >= 8) {

		$("#passwordErrorId").css("display", "none");
		isValidated = true;

	} else {
		$("#passwordErrorId").css("display", "block");
		return false;
		isValidated = false;
	}
	
	var phoneno = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
	
	var studMobileNo = $('#mobileno').val();
  if(studMobileNo == "" || phoneno.test(studMobileNo) != true) {
    $("#mobilenoErrorId").css("display", "block");
		return false;
		isValidated = false;
  }
  else {
    $("#mobilenoErrorId").css("display", "none");
		isValidated = true;

  }

	return isValidated;
}