<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter detail here</title>
</head>
<body>
<br> <br> <br> 
	<center>
		<form:form action="save-student" modelAttribute="student" method="get">
		
		<form:hidden path="id"/> 
		
		<label>Name : </label>
		<form:input path="name"/> <Br> 
		
		<label>Mobile : </label>
		<form:input path="mobile"/> <Br> 
		
		<label>Country : </label>
		<form:input path="country"/> <Br> 
	
		<input type="submit" value="submit">		
		</form:form>
	</center>

</body>
</html>