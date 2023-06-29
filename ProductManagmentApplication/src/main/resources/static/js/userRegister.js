
function saveUser(){
		var fullName= $('#userfnameId').val();
	var address = $('#useraddressId').val();
	var phoneNo = $('#userphoneId').val();
	var email   = $('#useremailId').val();
	var userName = $('#usernameId').val();
	var password = $('#userpassId').val();

   var settings = {
  "url": "/user/signUp",
  "method": "POST",
  "timeout": 0,
  "headers": {
    "Content-Type": "application/json"
  },
  "data": JSON.stringify({
    "fullName": fullName,
    "address": address,
    "phoneNo": phoneNo,
    "email": email,
    "userName": userName,
    "password": password
  }),
};

$.ajax(settings).done(function (response) {
  console.log(response);
     if(response.status==true){
		 alert("alert")
			window.location="/userLogin.html"
			
		}else{
			window.location="/productDashboard.html"
		}
});
}