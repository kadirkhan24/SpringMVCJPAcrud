<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!</h2>
 <form action="register" method="post" >
		<table>
			<%-- <tr>
				<th><input type="hidden" name="id" value="${idiot.id}"/> </th>
			</tr> --%>
			<tr>
				<th>Name</th>
				<th><input type="text" name="name" value="${idiot.name}"/> </th>
			</tr>
			<tr>
				<th>Email</th>
				<th><input type="text" name="email" value="${idiot.email}"/> </th>
			</tr>
			<tr>
				<th>Mobile</th>
				<th><input type="text" name="mobile" value="${idiot.mobile}"/> </th>
			</tr>
			<tr>
				<th>Country</th>
				<th>
					<select name="country">
						<option value="india">india</option>
						<option value="uk">uk</option>
						<option value="us">us</option>
					</select> 
					
				</th>
			</tr>
			<tr>
				<th><input type="submit" value="submit" > </th>
			</tr>
		</table>
	</form>
	<a href="/SpringMvcJPACrud/listIdiots">List</a>

	<%-- <form:form action="/SpringHibernateCrud/register" method="post" modelAttribute="idiot">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="idiot.name"/> </td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="idiot.email"/> </td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><form:input path="idiot.mobile"/> </td>
			</tr>
			<tr>
				<td>Country</td>
				<td>
				<form:select path="idiot.country">
					<form:option value="india">India</form:option>
					<form:option value="UK">UK</form:option>
					<form:option value="US">US</form:option>
				</form:select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" > </td>
			</tr>
		</table>
	</form:form> --%>

</body>
</html>
