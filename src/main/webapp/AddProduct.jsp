<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add  Product</title>
<link rel="stylesheet" href="addproduct.css">
<jsp:include page="header.jsp" />
</head>
<body>
	
	

	
	<div class="container">  
  	<form id="contact" action="" method="post">
    <h3>Add Stock Form</h3>
    <h4>Enter Stock Details</h4>
    <fieldset>
      <input placeholder="Product Name" type="text" tabindex="1" required autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="Product Category" type="text" tabindex="2" required>
    </fieldset>
    <fieldset>
      <input placeholder="Product Price" type="text" tabindex="3" required>
    </fieldset>
    <fieldset>
      <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Add Stock</button>
    </fieldset>
    
  </form>
</div>
	
</body>
</html>