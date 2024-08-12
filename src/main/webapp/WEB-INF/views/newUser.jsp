<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>New User</h1>
	<form action="saveuser" method="post">
	FullName: <input type="text" name="fullname"/><br><br>
	Email: <input type="text" name="email"/><br><br>
	Password: <input type="password" name="password"/><br><br>
	<input type="submit" value="Save"/>
	</form>
</body>
</html>