<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
</head>
	<style>
	body  
{  
    margin: 0;  
    padding: 0;  
    background-color:#6abadeba;  
    font-family: 'Arial';  
}  
.login{  
        width: 382px;  
        overflow: hidden;  
        margin: auto;  
        margin: 20 0 0 450px;  
        padding: 80px;  
        background: #23463f;  
        border-radius: 15px ;  
          
}  
h2{  
    text-align: center;  
    color: #277582;  
    padding: 20px;  
}  
label{  
    color: #08ffd1;  
    font-size: 17px;  
}  
#uname{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
}  
#Pass{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
      
}  
#log{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 17px;  
    padding-left: 7px;  
    color: blue;  
  
  
}  
span{  
    color: white;  
    font-size: 17px;  
}  
a{  
    float: right;
    background-color: grey;  
}    

	</style>
  
</head>    
<body>    
   <h2>Student Management System</h2><br>    
    <div>
<form action="validateLogin.html" method="post">
  
  <div class="login">
     <label><b>Username    
        </b>    
        </label>   
        <input type="text" name="userName" id="uname" placeholder="Username" required>    
        <br><br> 
    
	<label><b>Password     
        </b>    
        </label>    
        <input type="Password" name="Password" id="Pass" placeholder="Password" required>    
        <br><br>   
 
    <input type="submit" name="log" id="log" value="Log In"> 
        <br><br>  
        <a href="registerStudent.html">Register</a> 
  </div>
</body>
</html>