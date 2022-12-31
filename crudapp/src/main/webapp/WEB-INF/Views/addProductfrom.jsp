<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
<title>Insert title here</title>
</head>
<style>
body{
color:white;
}

</style>
<!-- <BODY background="C:\Users\Mahesh Shinde\Downloads\pexels-eberhard-grossgasteiger-2310713.jpg"> -->


<body>


<div class="container mt-3">
<div class="row">
<div class="col-md-6 offset-md-3">
<h1 class="text-center mb-3">Fill the product detail</h1>
<form action="handleproduct" method="post">



<div class="form-group"> <label for="name"  >Product Name</label>
 <input type="text" class="form-control" id="name" 
 aria-describedby="emailHelp" 
 name="name" 

 placeholder="Enter the product name here" required>
 
  <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
</div>
<!--  name is mathched similar to product name -->
<div class="form-group">
<label for="description"  >Product Description</label>
 <textarea class="form-control" name="description" id="description" 
 rows="5" placeholder="Enter the product description" required></textarea>
  <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
</div>



<div class="form-group">
<label for="price"  required>Product Price</label>
<input type="text"
placeholder="Enter Product Price"
name="price"
class="form-control" id="price" required>
 <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
</div>
</div>
<div class="container text-center">
<a href="${pageContext.request.contextPath }/"
class="btn btn-outline-success">Back</a>
<button type="submit" class="btn btn-primary">Add</button>
</div>
</form>


























</body>
</html>