<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
<title>Bienvenue</title>
</head>

<body>
	<h2>Hello World!</h2>

<a href="register">Register</a>
<br>
<a href="findUserById">Find user by id</a>
<br>
<a href="deleteUserByEmail">Delete user by email</a>
<br><br><br>
    <table>
        <tr>
            <td>Id</td><td>First Name</td><td>Last Name</td><td>Email</td>
        </tr>
        <c:forEach items="${listUser}" var="user">
            <tr>
            <td><c:out value="${user.id}" /></td>
            <td><c:out value="${user.firstname}" /></td>
            <td><c:out value="${user.lastname}" /></td>
            <td><c:out value="${user.email}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
