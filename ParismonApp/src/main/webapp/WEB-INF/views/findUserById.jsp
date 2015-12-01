<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parismon Find User By Id</title>

</head>

<body>

	<h2>Find User By Id Form</h2>

    <form method="post" action="findUserById">
    	<p>
        	<label>User Id :</label>
        	<input type="text" name="id" id="id" tabindex="10" />
        </p>
		<p>
			<input type="submit" value="OK" />
		</p>
	</form>

	<p>User id : <br><hr> <c:out value="${parismonUser.id}" /> </p>
	<p>User first name : <br><hr> <c:out value="${parismonUser.firstname}" /> </p>
	<p>User last name : <br><hr> <c:out value="${parismonUser.lastname}" /> </p>
	<p>User email : <br><hr> <c:out value="${parismonUser.email}" /> </p>


</body>
</html>