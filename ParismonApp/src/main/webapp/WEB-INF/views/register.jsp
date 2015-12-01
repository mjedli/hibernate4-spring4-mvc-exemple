<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
	<title>Parismon Register User</title>

</head>

<body>

<a href="findUserById">Find user by id</a>
<br>
<a href="deleteUserByEmail">Delete user by email</a>
<br><br><br>

	<h2>Registration Form</h2>

    <form method="post" action="register">
    <table>
    	<tr>
    		<td>First Name :</td><td><input type="text" name="firstname" id="firstname" tabindex="10" /></td>
    	</tr>
    	<tr>
    		<td>Last Name :</td><td><input type="text" name="lastname" id="lastname" tabindex="10" /></td>
    	</tr>
    	<tr>
    		<td>E-mail:</td><td><input type="text" name="email" id="email" tabindex="10" /></td>
    	</tr>
    	<tr>
    		<td>Password :</td><td><input type="text" name="password" id="password" tabindex="10" /></td>
    	</tr>
    	<tr>
    		<td></td><td><input type="submit" value="OK" /></td>
    	</tr>
    </table>
	</form>
</body>
</html>