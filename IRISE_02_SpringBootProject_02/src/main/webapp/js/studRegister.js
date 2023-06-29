/**
 * 
 */

function saveStud(){
	var studFirstName = $('#fname').val();
	var studLastName = $('#lname').val();
	var studEmail = $('#studemail').val();
	var studPassword = $('#password').val()
	var studMobileNo = $('#mobileno').val();
	
	
	var settings = {
  "url": "/student/register",
  "method": "POST",
  "timeout": 0,
  "headers": {
    "Content-Type": "application/json"
  },
  "data": JSON.stringify({
    "studFirstName":studFirstName,
    "studLastName":studLastName,
    "studEmail":studEmail,
    "studPassword":studPassword,
    "studMobileNo":studMobileNo,
    "role":"USER",
    "date": new Date()
  }),
};

$.ajax(settings).done(function (response) {
  console.log(response);
  if(response.status==true){
	  alert(response.Massage)
	  window.location="/login";
  }else{
	  alert(response.Massage)
	  window.location="/register"; 
  }
});
	
	
}

 