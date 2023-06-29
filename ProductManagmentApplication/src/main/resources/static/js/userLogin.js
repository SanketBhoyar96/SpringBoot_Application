/**
 * 
 */
function userSignIn() {
	alert("alert")
	var userName = $('#usernameId').val();
	var password = $('#userpassId').val();


 var settings = {
  "url": "/user/signIn?userName="+userName+"&password="+password,
  "method": "GET",
  "timeout": 0,
};

$.ajax(settings).done(function (response) {
  console.log(response);
  if(response.status==true){
			window.location="/productDashboard.html"
		}else{
			window.location="/userRegister.html"
		}
});
}