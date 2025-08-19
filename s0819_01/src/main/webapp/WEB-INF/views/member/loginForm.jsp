<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>login form</h2>
	<form action="/member/login" method="post">
		<label>ID</label>
		<input type="text" name="id"><br>
		<label>PW</label>
		<input type="text" name="pw"><br>
		<label>NN</label>
		<input type="text" placeholder="your nick name" name="nick"><br>
		<br>
		<input type="submit" value="login">		
	</form>
</body>
</html>