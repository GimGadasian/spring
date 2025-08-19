<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>score input</h2>
	<form action="/student/score" method="post">
		<label>NO.</label>
		<input type="text" name="no" value="0"><br>
		<label>Name</label>
		<input type="text" name="name"value="default"><br>
		<label>Kor</label>
		<input type="text" placeholder="your korean score" name="kor" value="0"><br>
		<label>Eng</label>
		<input type="text" placeholder="your english score" name="eng" value="0"><br>
		<label>Math</label>
		<input type="text" placeholder="your math score" name="math" value="0"><br>
		<br>
		<input type="submit" value="submit">		
	</form>
</body>
</html>