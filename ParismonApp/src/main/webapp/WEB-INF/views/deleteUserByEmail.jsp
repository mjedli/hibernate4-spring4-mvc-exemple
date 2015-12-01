<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parismon Find User By Id</title>

</head>

<body>

	<h2>Delete User By Email Form</h2>

    <form method="post" action="deleteUserByEmail">
    	<p>
        	<label>User Email :</label>
        	<input type="text" name="email" id="email" tabindex="email" />
        </p>
		<p>
			<input type="submit" value="OK" />
		</p>
	</form>

</body>
</html>