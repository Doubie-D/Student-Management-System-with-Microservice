<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Student Information</h1>

<%
String id = request.getParameter("lastname");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/studentmanagementdb";
String userId = "root";
String password = "root";
try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<form action="studentInformation.html" method="post">

<%
try{ 
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementdb", "root", "root");
statement=connection.createStatement();
String sql ="SELECT * FROM register";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>


<table style="width:70%">
<tr>
<tr bgcolor="#DEB887">
<td>First Name</td>
<td><%=resultSet.getString("firstname") %></td>
</tr>
<tr>
<td>Last Name</td>
<td><%=resultSet.getString("lastname") %></td><
</tr>
<tr>
<td>Email</td>
<td><%=resultSet.getString("email") %></td>
</tr>
<tr>
<td>Address</td>
<td><%=resultSet.getString("address") %></td>
</tr>
<tr>
<td>Contact</td>
<td><%=resultSet.getString("mobilenumber") %></td>
</tr>

<% 
}
} catch (Exception e) {
e.printStackTrace();
}
%>

</center>
</body>
</html>