<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>numInput</title>
</head>
<body>
	<form action="/num/numResult" method="post">
		<label>Name</label>
		<input type="text" name="name"><br>
		<label>Kor</label>
		<input type="text" placeholder="your korean score" name="kor"><br>
		<label>Eng</label>
		<input type="text" placeholder="your english score" name="eng"><br>
		<label>Math</label>
		<input type="text" placeholder="your math score" name="math"><br>
		<br>
		<input type="submit" value="submit">		
	</form>
</body>
</html>