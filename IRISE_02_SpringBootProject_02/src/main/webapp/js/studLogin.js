/**
 * userName="+userName+"&password="+password,
 */


function studLogin() {
	var studEmail = $('#studEmail').val();
	var studPassword = $('#studPassword').val();
	
	var settings = {
		"url": "/student/login?studEmail="+studEmail+"&studPassword="+studPassword,
		"method": "GET",
		"timeout": 0,
	};
	$.ajax(settings).done(function(response) {
		console.log(response);
		if (response.status == true) {
			alert(response.Massage);
			window.location ="/dashboard";
		} else {
			alert(response.Massage);
			window.location ="/login";
		}
	});
}