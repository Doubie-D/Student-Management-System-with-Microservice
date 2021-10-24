<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="process.html" method="post" modelAttribute="bean">
<h6>Name</h6>
<form:input path="studentName"/>
<h6>Type</h6>
<form:select path="studentType">
<form:option value="a"></form:option>
<form:option value="b"></form:option></form:select>
<h6>Amount</h6>
<form:input path="bill"/>
<h6>Date</h6>
<form:input path="billingDate"/>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>