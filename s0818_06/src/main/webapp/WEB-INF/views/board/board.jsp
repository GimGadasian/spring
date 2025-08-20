<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	  h2, h3{text-align: center;}
	  table{width:400px; margin:10px auto;}
	  table,th,td{border:1px solid black; border-collapse: collapse;}
	  th,td{width:200px; height:40px; text-align: center; }
	</style>
</head>
	<h2>board page</h2>
	<table>
		<tr>
		<th>Title</th>
		<th>Writer</th>
		<th>Date</th>
		</tr>
		
		<tr>
		<td>${boardDto.btitle }</td>
		<td>${boardDto.id_writer }</td>
		<td>${boardDto.bdate }</td>
		</tr>
		
	
	</table>
	<br>
	<h3><a href="/">Home</a></h3>
<body>

</body>
</html>