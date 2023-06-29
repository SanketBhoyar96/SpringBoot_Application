/**
 * 
 */
$(document).ready(function() {
	findAllProduct();
	findProductById()
	// alert("Working FindAllproduct");
});
//===================================================
function addNewProduct() {
	var pname = $('#proNameId').val();
	var pqty = $('#proPriceId').val();
	var price = $('#proQTYId').val();

	var settings = {
		"url": "/product/savedProduct",
		"method": "POST",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json"
		},
		"data": JSON.stringify({
			"pname": pname,
			"pqty": price,
			"price": pqty
		}),
	};

	$.ajax(settings).done(function(response) {
		console.log(response);
		if (response.status == true) {
			alert(response.Massage);
			window.location = "/productDashboard.html"
		} else {
			window.location = "/addProduct.htm"
		}
	});


}

//============================getallProducts====================================


function findAllProduct() {

	var settings = {
		"url": "/product/getALLProduct",
		"method": "GET",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {

		response.forEach(function(obj, index) {
			$('#producttbodyId').append('<tr><td>' + obj.pid + '</td><td>' + obj.pname + '</td><td>' + obj.pqty + '</td><td>' + obj.price + '</td>'

				+ '<td><button onclick="edit(' + obj.pid + ')">Edit</button> <button onclick="deleteProduct(' + obj.pid + ')">Delete</button></td></tr>')


		});
	});
}


function deleteProduct(pid) {
	var settings = {
		"url": "/product/deleteById?pid=" + pid,
		"method": "DELETE",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {
		if (response.status == true) {
			alert(response.message)
			window.location = "productDashboard.html"
		} else {
			alert(response.message)
			window.location = "productDashboard.html"
		}
	});

}

function edit(pid) {
	window.location = "/updateProduct.html?pid=" + pid;
}


function findProductById() {

	var url = window.location.href;
	var splitter = url.split('=');
	var pid = splitter[1];

	var settings = {
		"url": "/product/findById/" + pid,
		"method": "GET",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {
		console.log(response);

		if (response != null) {

			$('#pid').val(response.pid);
			$('#pname').val(response.pname);
			$('#price').val(response.price);
			$('#pqty').val(response.pqty);

		} else {
			window.location = "/productDashboard.html";
		}
	});
}


function updateProduct() {
	
	//update Values
	var pid=$('#pid').val();
	var pname=$('#pname').val();
	var price=$('#price').val();
	var pqty=$('#pqty').val();
	var settings = {
		"url": "/product/updateProductByid?pid="+pid,
		"method": "POST",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json"
		},
		"data": JSON.stringify({
			"pname":pname,
			"pqty":price,
			"price": pqty
		}),
	};

	$.ajax(settings).done(function(response) {
		console.log(response);
		
		if(response != null){
			alert(response.message);
			window.location ="/productDashboard.html?pid=" + pid;
		}else{
			alert(response.message);
		}
	});
}
