<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signUpDone</title>
<style type="text/css">
	h2, p {text-align: center;}
	table{width:600px; margin:10px auto;}
	table,th,td{border:1px solid grey; border-collapse: collapse;}
	th, td{width:100px; height:40px; text-align: center; }
</style>
</head>
<body>
	<h2>Welcome ${mem.nick }!</h2>
	
	<table>
		<tr>
			<th>
				<label>ID</label>
			</th>
			<td>
				${mem.id }
			</td>
		</tr>
		
		<tr>
			<th>
				<label>PW</label>
			</th>
			<td>
				${mem.pw }
			</td>
		</tr>
		
		<tr>
			<th>
				<label>Nick Name</label>
			</th>
			<td>
				${mem.nick }
			</td>
		</tr>
		
		
	</table>
	
	<br>
	<a href="/"><p>HOME</p></a>
	
</body>
</html>