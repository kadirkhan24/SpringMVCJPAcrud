<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Country</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="idiot" items="${listidiots}">
		<tr>
		
			<td><c:out value="${idiot.name}"></c:out> </td>
			<td><c:out value="${idiot.email}"></c:out> </td>
			<td><c:out value="${idiot.mobile}"></c:out> </td>
			<td><c:out value="${idiot.country}"></c:out> </td>
			<td><a href="/SpringMvcJPACrud/editById/${idiot.id}">Edit</a></td>
			<td><a href="/SpringMvcJPACrud/deleteById/${idiot.id}">Delete</a></td>
		
		</tr>
		</c:forEach>
	</table>

</body>
</html>