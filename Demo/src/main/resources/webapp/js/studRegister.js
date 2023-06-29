/**
 * 
 */

function saveStud(){
	alert('hello');
	
	var fname = $('#fname').val();
	var lname = $('#lname').val();
	var email = $('#email').val();
	var password = $('#password').val()
	var mobileno = $('#mobileno').val();
	var isactived = $('#isactived').val();
	
	
	var settings = {
  "url": "/student/register",
  "method": "POST",
  "timeout": 0,
  "headers": {
    "Content-Type": "application/json"
  },
  "data": JSON.stringify({
    "studFirstName":fname,
    "studLastName":lname,
    "studEmail":email,
    "studPassword":password,
    "studMobileNo":mobileno,
    "role":"USER",
    "is_Actived":false,
    "is_Deleted":false,
    "date": new Date()
  }),
};

$.ajax(settings).done(function (response) {
  console.log(response);
  if(response.status==true){
	  
	  alert(response.Massage)
	  window.location="/studLogin.html"
  }else{
	  alert(response.Massage)
	  window.location="/studRegister.html" 
  }
});
	
	
}

 