<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>wangweinet login</h1>
	<form action="login.action" method="post">
		<table align='center'>
			<tr>
				<td>username</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
				<td><a href="register.jsp">register</a></td>
			</tr>
			
		</table>
		<br> 
		

	</form>
</body>
</html>