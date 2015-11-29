<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Parismon Register User</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Registration Form</h2>
 
    <form method="post" action="register">
    	<p>
        	<label for="firstname">First Name :</label><br />
        	<input type="text" name="firstname" id="firstname" tabindex="10" />
        </p>
        <p>
        	<label for="lastname">Last Name :</label><br />
        	<input type="text" name="lastname" id="lastname" tabindex="10" />
        </p>
        <p> 	
        	<label for="email">E-mail:</label><br />
        	<input type="text" name="email" id="email" tabindex="10" />
        	 </p>
        <p>
        	
        	<label for="password">Password :</label><br />
        	<input type="text" name="password" id="password" tabindex="10" />
        	 </p>
        <p>
        	<input type="submit" value="Valider" />	
      	</p>
 	</form>
</body>
</html>