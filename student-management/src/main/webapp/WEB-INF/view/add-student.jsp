<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add STudents</title>
</head>
<body><div align="center"><h3>Add Student</h3>
<!-- create a spring form-->
<form:form action="save-student" modelAttribute="student" method="GET"><label>Name: </label><form:input path="name"/><br/><label>Mobile: </label><form:input path="mobile"/><br/><label>Country: </label><form:input path="country"/><br/><input type="submit" value="Submit"></form:form></div>
</body>
</html>