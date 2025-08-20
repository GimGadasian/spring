<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<form action="/member/login" method="post">
	<label>ID</label>
	<input type="text" name="id"><br>
	<label>PW</label>
	<input type="text" name="pw"><br>
	<label>NickName</label>
	<input type="text" name="nick"><br>
	<br>
	<input type="submit" value="login"><br>
	</form>
	<br>
	<a href="/">Home</a>
</body>
</html>