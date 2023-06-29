/**
 * userName="+userName+"&password="+password,
 */


function studLogin() {
	alert("work")
	var studEmail = $('#studemail').val();
	var studPassword = $('#password').val();

	//validate use check
	if (validate()) {

		var settings = {
			"url": "/student/login?studEmail=" + studEmail + "&studPassword=" + studPassword,
			"method": "GET",
			"timeout": 0,
		};
		$.ajax(settings).done(function(response) {
			console.log(response);
			if (response.status == true) {
				alert(response.Massage);
				window.location="/admindashboard";
			} else {
				alert(response.Massage);
				window.location = "/login";
			}
		});
	} else {
		validate();
	}

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


	var studPassword = $('#password').val();

	if (studPassword.match(/[a-z]/g) && studPassword.match(/[A-Z]/g) && studPassword.match(/[0-9]/g) && studPassword.match(/[^a-zA-Z\d]/g) && studPassword.length >= 8) {

		$("#passwordErrorId").css("display", "none");
		isValidated = true;

	} else {
		$("#passwordErrorId").css("display", "block");
		return false;
		isValidated = false;
	}


	return isValidated;
}