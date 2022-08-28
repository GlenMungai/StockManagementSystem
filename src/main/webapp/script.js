function message(){
    var Name = document.getElementById('productName');
    var category = document.getElementById('productCategory');
    var price = document.getElementById('productPrice');
    const success = document.getElementById('success');
    const danger = document.getElementById('danger');

    if(Name.value === '' || category.value === '' || price.value === ''){
        danger.style.display = 'block';
    }
    else{
        setTimeout(() => {
            Name.value = '';
            category.value = '';
            price.value = '';
        }, 2000);

        success.style.display = 'block';
    }


    setTimeout(() => {
        danger.style.display = 'none';
        success.style.display = 'none';
    }, 4000);

}


//user registration form function

function userregister(){
    var Name = document.getElementById('firstName');
    var lastname = document.getElementById('lastName');
    var username = document.getElementById('username');
	var email = document.getElementById('email');
	var password = document.getElementById('password');
    
    if(Name.value === '' || lastname.value === '' || username.value === '' || email.value === '' || password.value === ''){
      
		alert("Missing Fields!");
		
    }else{
       	
		//alert("User Successfully Registered!");
		
		  swal({
		  title: "Success!",
		  text: "User Successfully Registered!",
		  icon: "success",
		  button: "OK",
		});

    }
}