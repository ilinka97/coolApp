<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Profile</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div id="editProfile">
	<form action="" method="post">
	
		<label for="email">Email:</label>
	    <input type="text" id="email" name="email"><br><br>
	    
	    <label for="password">Password:</label>
	    <input type="password" id="password" name="password"><br><br>
	    
		<label for="fName">Name:</label>
	    <input type="text" id="fName" name="fName"><br><br>
	    
	    <label for="lName">Last Name:</label>
	    <input type="text" id="lName" name="lName"><br><br>
	    
	    <label for="streetAdr">Street Adress:</label>
	    <input type="text" id="streetAdr" name="streetAdr"><br><br>
	    
	    <label for="city">City:</label>
	    <input type="text" id="city" name="city"><br><br>
	    
	    <input type="submit" value="Edit Information"/>
	    
	</form>
</div>


</body>
</html>