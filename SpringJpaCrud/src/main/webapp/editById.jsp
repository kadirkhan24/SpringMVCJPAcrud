<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>editByEmail</title>
</head>
<body>
${idiot}
	 <form action="/SpringMvcJPACrud/updateIdiot" method="post" >
		<table>
			<tr>
				<th><input type="hidden" name="id" value="${idiot.id}"/> </th>
			</tr>
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
						<option value="India">India</option>
						<option value="UK">UK</option>
						<option value="US">US</option>
					</select> 
					
				</th>
			</tr>
			<tr>
				<th><input type="submit" value="submit" > </th>
			</tr>
		</table>
	</form>
</body>
</html>