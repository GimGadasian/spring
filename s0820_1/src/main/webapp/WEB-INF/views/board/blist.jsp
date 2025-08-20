<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList</title>
<style type="text/css">
	h2, p {text-align: center;}
	table{width:1200px; margin:10px auto;}
	table,th,td{border:1px solid grey; border-collapse: collapse;}
	th, td{width:200px; height:40px; text-align: center; }
	
	th:nth-child(1), td:nth-child(1) { width:100px; }   /* No */
	th:nth-child(2), td:nth-child(2) { width:300px; }   /* Title */
	th:nth-child(3), td:nth-child(3) { width:400px; }   /* Content */
	th:nth-child(4), td:nth-child(4) { width:200px; }   /* Writer */
	th:nth-child(5), td:nth-child(5) { width:200px; }   /* Date */
	
</style>
</head>
<body>
<h2>member list page</h2>
	
	<table>
		<tr>
			<th>No</th>
			<th>Title</th>
			<th>Content</th>
			<th>Writer</th>
			<th>Date</th>
		</tr>
		
		
		<tr>
			<td>${member.id }</td>
			<td>${member.pw }</td>
			<td>${member.name }</td>
			<td>${member.phone }</td>
			<td>${member.gender }</td>
		</tr>
		
	</table>
	
	<br>
	<a href="/"><p>HOME</p></a>
	
</body>
</html>