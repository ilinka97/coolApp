<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Home</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div id="nav">
 	<a href="/editInfoRedirect" role="button">Edit Information</a>
 	<a href="" role="button">Delete profile</a>
 	<a href="" role="button">Logout</a>
</div>

<div id="content">

	<h1>${user.getfName()}  ${user.getlName()}</h1>
	<h3>Mail: ${user.getEmail()}</h3>
	<h3>Adress: ${user.getStreetAdress()}</h3>
	<h3>City: ${user.getCity()}</h3>
	
</div>

</body>
</html>