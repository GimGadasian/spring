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
	<h2>${nick}'s page</h2>
	
	<table>
		<tr>
		<th>ID</th>
		<td>${id }</td>
		</tr>
		
		<tr>
		<th>PW</th>
		<td>${pw }</td>
		</tr>
		
		<tr>
		<th>NickName</th>
		<td>${nick }</td>
		</tr>
		
	</table>
	<br>
	
	<h3><a href="/">Home</a></h3>
	
	
</body>
</html>