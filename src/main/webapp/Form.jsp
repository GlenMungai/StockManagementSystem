<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login and Registration form</title>
<link rel="stylesheet" href="form.css">
</head>
<body>
	<div class="reg">
		<div class="form-box">
			<div class="button-box">
				<div id="btn"></div>
				<button type="button" class="toggle-btn" onclick="login()">Log In</button>
				<button type="button" class="toggle-btn" onclick="register()">Register</button>
			</div>
			
			<form id="login" class="input-group" action="">
				<input type="text" class="input-field" placeholder="Username" required>
				<input type="password" class="input-field" placeholder="Password" required>
				<input type="checkbox" class="check-box"><span>Remember Password</span>
				<button type="submit" class="submit-btn">Log In</button>
			</form>
	
			<form action="register" id="register" class="input-group" method="post">
				<input type="text" class="input-field" placeholder="First name" name="firstName" required>
				<input type="text" class="input-field" placeholder="Last name" name="lastName" required>	
				<input type="text" class="input-field" placeholder="Username" name="username" required>
				<input type="email" class="input-field" placeholder="Email" name="email" required>
				<input type="password" class="input-field" placeholder="Password" name="password" required>
				<button type="submit" class="submit-btn" id="reg" onclick="myRegister()">Register</button>
			</form>
			
		</div>
	</div>
	
	<script type="text/javascript">
	var x = document.getElementById("login");
	var y = document.getElementById("register");
	var z = document.getElementById("btn");
	
	function register(){
		x.style.left = "-400px";
		y.style.left = "50px";
		z.style.left = "110px";
		
	}
	function login(){
		x.style.left = "50px";
		y.style.left = "450px";
		z.style.left = "0px";
		
	}
	
	
	//onclick register button
	function myRegister() {
  	document.getElementById("reg").alert("User Successfully Registered!");
	}
	
	</script>

</body>
</html>