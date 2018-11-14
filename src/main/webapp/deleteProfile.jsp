<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Profile</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

	<div id="deleteProfile">
	<h1>Delete profile?</h1>
	
	<h3>${user.getfName()}  ${user.getlName()}</h3>
	<h3>Mail: ${user.getEmail()}</h3>
	<h3>Adress: ${user.getStreetAdress()}</h3>
	<h3>City: ${user.getCity()}</h3>
	
	<a href="/home"><button id="cancelButton">Cancel</button></a>
 	<form><button type="submit" id="deleteButton" formmethod="get" formaction="/deleteProfile" name="deleteButton" value="${user.getUserId()}">Delete profile</button></form>
	
 	</div>
 	
 	
</body>
</html>