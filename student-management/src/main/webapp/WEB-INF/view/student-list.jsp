<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show student</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLTOReachResourcesFolder/css/my-style-sheet.css">
</head>
<body class="myFonts">
<div class="container">
	<h1 align="center">Student Management</h1>
		<form action="showAddStudentPage">
			<input type="submit" value="ADD" class="btn btn-primary">
			
		</form>
		<br/>
		<table border="2" class="table table-striped">
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