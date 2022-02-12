<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Data Coming soon</h1>
		<!-- Model attritube: students -->
		<!-- Iterating using JSTL -->
		<!--Internally gettterMethod() is getting called : stu.id  -->
		<table border="">
			<tr>
				<td>S.No</td>
				<td>Name</td>
				<td>Mobile</td>
				<td>Country</td>
			</tr>
		
		<j:forEach var="stu" items="${students}">
<tr> 
<td> ${stu.id} </td>
<td> ${stu.name} </td>
<td> ${stu.mobile} </td>
<td> ${stu.country} </td>
<td> <a href="/student-management/updateStudent?userId=${stu.id}"> Update</a></td>
<td> <a href="/student-management/deleteStudent?userId=${stu.id}" onclick="if (!(confirm('Are you sure you want to Delete'))) return false"> Delete</a></td>


</tr>
		</j:forEach>
</table>
<a href="/student-management/showAddStudentPage">Add User</a>
	</center>
</body>
</html>