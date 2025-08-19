<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>sign up form</h2>
	<form action="/member/signUp" method="post">
		<label>ID</label>
		<input type="text" name="id"><br>
		<label>PW</label>
		<input type="text" name="pw"><br>
		<label>Name</label>
		<input type="text" name="name"><br>
		<label>Age</label>
		<input type="text" name="age"><br>
		<label>NN</label>
		<input type="text" placeholder="your nick name" name="nick"><br>
		<label>TEL</label>
		<input type="text" placeholder="your phone number" name="tel"><br>
		<br>
		<input type="submit" value="signUp">		
	</form>
</body>
</html>