<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add STudents</title><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous"><link rel="stylesheet" type="text/css" href="/student-management/URLTOReachResourcesFolder/css/my-style-sheet.css">
</head>
<body><div align="center"><h1>Add Student</h1>
<!-- create a spring form-->
<form:form action="save-student" modelAttribute="student" method="POST"><form:hidden path="id"/><br/><label>Name: </label><form:input path="name"/><br/><label>Mobile: </label><form:input path="mobile"/><br/><label>Country: </label><form:input path="country"/><br/><input type="submit" value="Submit" class="btn btn-primary"> </form:form></div>
</body>
</html>