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
			
			<div id="error"></div>
			
			<form action="<%=request.getContextPath()%>/login" id="login" class="input-group" method="post">
				<input type="text" class="input-field" placeholder="Username" name="username" id="username" required>
				<input type="password" class="input-field" placeholder="Password" name="password" id="password" required>
				<input type="checkbox" class="check-box"><span>Remember Password</span>
				<button type="submit" class="submit-btn">Log In</button>
			</form>
	
			<form action="<%=request.getContextPath()%>/register" id="register" class="input-group" method="post">
				<input type="text" class="input-field" placeholder="First name" name="firstName" id="firstName" required>
				<input type="text" class="input-field" placeholder="Last name" name="lastName" id="lastName" required>	
				<input type="text" class="input-field" placeholder="Username" name="username" id="username" required>
				<input type="email" class="input-field" placeholder="Email" name="email" id="email" required>
				<input type="password" class="input-field" placeholder="Password" name="password" id="password" required>
				<button type="submit" class="submit-btn" id="reg" onclick="userregister()">Register</button>

				
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
	<script  src="script.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</body>
</html>