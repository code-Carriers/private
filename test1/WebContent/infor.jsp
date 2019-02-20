<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
	<td>username</td>
	<td>password</td>
	<td>age</td>
</tr>
<c:forEach items="users" var="user">
	<tr>
<%-- 	<td>${user.name }</td> --%>
	<td>${ user.password }</td>
	<td>${ user.age }</td>
</tr>
</c:forEach>
</table>
</body>
</html>