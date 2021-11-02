<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet"/>
<!-- <script>
function loadPage() {
	document.forms["form1"].action="purchaseEntry.html";
	document.forms["form1"].submit();
	window.location.href="purchaseEntry.html";
	
}
</script> -->
<meta name="viewport" content="width=auto, initial-scale=1">
<style type="text/css">
body {
  background-color: #6abadeba;
}
font{
font-family: Arial;
}
</style>
</head>
<body>
<div class="container">
<center>
<h1>Student Management System</h1>
<div class="navbar">
  <a class="active" href="#"><i class="fa fa-fw fa-home"></i> Home</a> 
  <a  href="login.html"><i class="fa fa-fw fa-user"></i> Login</a>
</div>
</center>
<h1>Problem Statement</h1> 
<p>
CSU, a University needs an application to manage their student details. This application focuses on maintaining the student information and maintains their payment due history as they may pay the total amount of the credits studied as partial. 

This application helps to generate reports on:
<ul>
<li>Showing relevant details on date wise payment for all students.</li>
<li>Showing relevant details of the courses paid based on the selected courses, additionally the user may filter the report by specifying From and To dates.</li>
<li>Showing relevant details of the payment history of a particular credit between From and To Dates on the basis of :</li>
balance pending, fully paid or overpaid status on the courses studied,
Specific student id

</ul>
</p>
</div>
<div class="terms1">
  <p align="center" style="font-family: calibri;color: #6666CC;">Copyright © 2021 Cleveland State University All Rights Reserved.</p>
</body>
</html>