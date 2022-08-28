<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Stock</title>
<link rel="stylesheet" href="addproduct.css">

</head>
<body>

	<%@ include file ="header.jsp" %>
	
	<div class="container">  
  	<form id="contact" action="<%=request.getContextPath()%>/addStock" method="post">
    <h3>Add Stock Form</h3>
    <h4>Enter Stock Details</h4>
    <fieldset>
      <input placeholder="Product Name" type="text" name="productName" id="productName" tabindex="1" required autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="Product Category" type="text" name="productCategory" id="productCategory" tabindex="2" required>
    </fieldset>
    <fieldset>
      <input placeholder="Product Price" type="text" name="productPrice" id="productPrice" tabindex="3" required>
    </fieldset>
    <fieldset>
      <button name="submit" type="submit" id="contact-submit" onclick="message()" >Add Stock</button>
    </fieldset>
     <div class="message">
            <div class="success" id="success">Product Successfully Added!</div>
            <div class="danger" id="danger">Fields Can't be Empty!</div>
      </div>
    
  </form>
</div>
	
	<script src="script.js"></script>
</body>
</html>