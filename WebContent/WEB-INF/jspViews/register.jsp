<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
body{
  	background: #384047;
  	font-size: 'Arial'
}
h1{
	text-align: center;  
    color: #277582;  
    padding: 20px;
}
.register{  
 	background: #fff;
  padding: 4em 4em 2em;
  max-width: 400px;
  margin: 50px auto 0;
  box-shadow: 0 0 1em #222;
  border-radius: 2px;; 
}
input {
    display: block;
    box-sizing: border-box;
    width: 100%;
    outline: none;
    margin:0;
  }
 
#button{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 17px;  
    padding-left: 7px;  
    color: blue;  
  
  
}  
input[type="submit"] {
    background: $button;
    box-shadow: 0 3px 0 0 darken($button, 10%);
    border-radius: 2px;
    border: none;
    color: #fff;
    cursor: pointer;
    display: block;
    font-size: 2em;
    line-height: 1.6em;
    margin: 2em 0 0;
    outline: none;
    padding: .8em 0;
    text-shadow: 0 1px #68B25B;
  }
  input[type="submit"]:hover {
    background: #384047;
    text-shadow:0 1px 3px darken($button, 30%);
  }
  input[type="submit"]:hover {
    
  }
  
  
}
</style>

<body>
<h1>Registration Form</h1>
<form:form action="process1.html" method="post" modelAttribute="bean">
<div class="register" >
<h6>First Name</h6>
<form:input path="firstName"/>
<h6>Last Name</h6>
<form:input path="lastName"/>
<h6>Email</h6>
<form:input path="email"/>
<h6>Password</h6>
<form:input type="password" path="password"/>
<h6>New Password</h6>
<form:input type="password" path="confirmPassword"/>
<h6>Date of Birth</h6>
<form:input type="date" path="dateOfBirth" max="2021-10-03"/>
<h6>Gender</h6>
<form:input path="gender"/>
<h6>Address</h6>
<form:input path="address"/>
<h6>Mobile Number</h6>
<form:input path="mobileNumber"/>
<input type="submit" value="Submit" id ="submit"/>

</div>
</form:form>

<%-- <form action="process1.html" method="post" modelAttribute="bean">
			<table style="with: 50%">
			
			Code for accepting student personal details
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName"  required/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" required/></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" required/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required/></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="newPassword" required/></td>
				</tr>
				
				<tr>
					<td>Date of Birth</td>
	 
					<td>
					<select name="Birthday_day" id="dateOfBirth" required>
					<option value="-1">Day:</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
				 
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					 
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					 
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					 
					<option value="31">31</option>
					</select>
					 
					<select id="Birthday_Month" name="dateOfBirth">
					<option value="-1">Month:</option>
					<option value="January">Jan</option>
					<option value="February">Feb</option>
					<option value="March">Mar</option>
					<option value="April">Apr</option>
					<option value="May">May</option>
					<option value="June">Jun</option>
					<option value="July">Jul</option>
					<option value="August">Aug</option>
					<option value="September">Sep</option>
					<option value="October">Oct</option>
					<option value="November">Nov</option>
					<option value="December">Dec</option>
					</select>
					 
					<select name="Birthday_Year" id="dateOfBirth" required>
					 
					<option value="-1">Year:</option>
					<option value="2012">2012</option>
					<option value="2011">2011</option>
					<option value="2010">2010</option>
					<option value="2009">2009</option>
					<option value="2008">2008</option>
					<option value="2007">2007</option>
					<option value="2006">2006</option>
					<option value="2005">2005</option>
					<option value="2004">2004</option>
					<option value="2003">2003</option>
					<option value="2002">2002</option>
					<option value="2001">2001</option>
					<option value="2000">2000</option>
					 
					<option value="1999">1999</option>
					<option value="1998">1998</option>
					<option value="1997">1997</option>
					<option value="1996">1996</option>
					<option value="1995">1995</option>
					<option value="1994">1994</option>
					<option value="1993">1993</option>
					<option value="1992">1992</option>
					<option value="1991">1991</option>
					<option value="1990">1990</option>
					 
					<option value="1989">1989</option>
					<option value="1988">1988</option>
					<option value="1987">1987</option>
					<option value="1986">1986</option>
					<option value="1985">1985</option>
					<option value="1984">1984</option>
					<option value="1983">1983</option>
					<option value="1982">1982</option>
					<option value="1981">1981</option>
					<option value="1980">1980</option>
					</select>
					</td>
				</tr>
				
				<tr>
					<td>Gender</td>
					<td>
					Male <input type="radio" name="Gender" value="Male" />
					Female <input type="radio" name="Gender" value="Female" />
					</td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" required/></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="number" name="mobileNumber" required/></td>
				</tr></table>
			<input type="submit" value="Submit" /></form> --%>
</body>
</html>