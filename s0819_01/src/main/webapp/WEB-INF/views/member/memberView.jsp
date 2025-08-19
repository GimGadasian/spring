<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		h2, h3{text-align: center;}
	  	table{width:400px; margin:10px auto;}
	  	table,th,td{border:1px solid black; border-collapse: collapse;}
	  	th,td{width:200px; height:40px; text-align: center; }
	</style>
</head>
<body>
	<h2>${member.nick}'s information</h2>
	
	<table>
		<tr>
		<th>Name</th>
		<td>${member.name }</td>
		</tr>
		
		<tr>
		<th>Age</th>
		<td>${member.age }</td>
		</tr>
		
		<tr>
		<th>ID</th>
		<td>${member.id }</td>
		</tr>
		
		<tr>
		<th>PW</th>
		<td>${member.pw }</td>
		</tr>
		
		<tr>
		<th>NickName</th>
		<td>${member.nick }</td>
		</tr>
		
		<tr>
		<th>Tel</th>
		<td>${tel }</td>
		</tr>
		
	</table>
	<br>
	
	<h3><a href="/">Home</a></h3>
	
	
</body>
</html>