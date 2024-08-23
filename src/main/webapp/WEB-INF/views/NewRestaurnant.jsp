<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	span{
		color:red;
		font-weight:bold;
	}
</style>
</head>
<body>
	<h1>New Restaurnant</h1>
	
	<form action="saverestaurant" method="post">
		Restaurnant Name:<input type="text" name="name" value="${restaurantEntity.getName()}"/><span>${result.getFieldError('name').getDefaultMessage()}</span><br><br>
		Address:<input type="text" name="address" value="${restaurantEntity.getAddress()}"/><span>${result.getFieldError('Address').getDefaultMessage()}</span><br><br>
		Category:<input type="text" name="category" value="${restaurantEntity.getCategory()}"/><span>${result.getFieldError('category').getDefaultMessage()}</span><br><br>
		<input type="submit" value="Save Restaurant"/>
	</form>
	
</body>
</html>