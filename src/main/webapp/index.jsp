<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cool App</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<meta charset="utf-8">
</head>
<body>

<div id="loginForm">
	<form action="" method="post">
	
		<label for="email">Email:</label>
	    <input type="text" id="email" name="email"><br><br>
	    
	    <label for="password">Password:</label>
	    <input type="password" id="password" name="password"><br><br>
	    
	    <input type="submit" value="Log in"/>
	    
	</form>
</div>

<div id="registerForm">
	<form action="/registration" method="post">
	
		<label for="email">Email:</label>
	    <input type="text" id="email" name="email"><br><br>
	    
	    <label for="password">Password:</label>
	    <input type="password" id="password" name="password"><br><br>
	    
	    <input type="submit" value="Register"/>
	    
	</form>
</div>

</body>
</html>
