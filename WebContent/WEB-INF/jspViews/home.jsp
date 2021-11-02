<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet"/>
<!-- <script>
function loadPage() {
	document.forms["form1"].action="purchaseEntry.html";
	document.forms["form1"].submit();
	window.location.href="purchaseEntry.html";
	
}
</script>  -->
<meta name="viewport" content="width=auto, initial-scale=1">
<style type="text/css">
body {
  background-color: lightblue;
}
</style>
</head>
<body>
<div class="container">

<%@include file="include.jsp" %>
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
</div>
</body>
</html>
