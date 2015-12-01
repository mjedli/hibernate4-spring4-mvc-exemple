<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Parismon Register User</title>

</head>

<body>

	<h2>Registration Form</h2>
 
    <form method="post" action="register">
    	<p>
        	<label>First Name :</label>
        	<input type="text" name="firstname" id="firstname" tabindex="10" />
        </p>
        <p>
        	<label>Last Name :</label>
        	<input type="text" name="lastname" id="lastname" tabindex="10" />
        </p>
        <p> 	
        	<label>E-mail:</label>
        	<input type="text" name="email" id="email" tabindex="10" />
        	 </p>
        <p>
        	<label>Password :</label>
        	<input type="text" name="password" id="password" tabindex="10" />
        	 </p>
		<p>
			<input type="submit" value="OK" />
		</p>
	</form>
</body>
</html>