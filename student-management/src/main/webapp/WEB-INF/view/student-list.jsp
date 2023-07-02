<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show student</title>
</head>
<body>
	<h1 align="center">My First Spring MVC Project</h1>
	<div align="center">
		<form action="showAddStudentPage">
			<input type="submit" value="ADD">

		</form>
		<table border="2">
			<thead>
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>mobile</td>
					<td>country</td>
				</tr>
			</thead>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td><a href="/student-management/updateStudent?userId=${student.id}">Update</a></td>
					<td><a href="/student-management/deleteStudent?userId=${student.id}" 
					onclick="if(!(confirm('Are you sure you want to delete this student?'))) return false">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>