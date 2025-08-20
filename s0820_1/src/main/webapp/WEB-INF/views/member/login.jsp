<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style type="text/css">
	h2, p {text-align: center;}
	table{width:400px; margin:10px auto; border: 1px solid #ddd; border-radius: 10px;}
	td{width:100px; height:30px; text-align: left; padding: 10px 20px;}
</style>
</head>
<body>
	<h2>login page</h2>
	<form action="/member/login" method="post">
	<table>
		<tr>
			<td colspan="2" style="text-align: center; color: darkblue;"><strong>Login</strong></td>
		</tr>
		<tr>
			<td>
				<label>ID</label>
			</td>
			<td>
				<input type="text" name="id">
			</td>
		</tr>
		
		<tr>
			<td>
				<label>PASSWORD</label>
			</td>
			<td>
				<input type="text" name="pw">
			</td>
		</tr>
		
		<!-- 
		<tr>
			<td>
				<label>Name</label>
			</td>
			<td>
				<input type="text" name="name">
			</td>
		</tr>
		
		<tr>
			<td>
				<label>Phone</label>
			</td>
			<td>
				<input type="text" name="phone">
			</td>
		</tr>
		
		<tr>
			<td>
				<label>Gender</label>
			</td>
			<td>
				<input type="radio" name="gender" value="male"> Male<br>
				<input type="radio" name="gender" value="female"> Female<br>
				<input type="radio" name="gender" value="other"> Other
			</td>
		</tr>

		<tr>
			<td>
				<label>Hobby</label>
			</td>
			<td>
				<input type="checkbox" name="hobby" value="reading"> Reading<br>
				<input type="checkbox" name="hobby" value="music"> Music<br>
				<input type="checkbox" name="hobby" value="sports"> Sports<br>
				<input type="checkbox" name="hobby" value="travel"> Travel
			</td>
		</tr>
		 -->
		
		
		<tr>
			<td colspan="2" style="text-align: right; padding-right: 20px;">
				<input type="submit" value="sign up">
			</td>	
		</tr>
	</table>
	</form>
	<br>
	<a href="/"><p>HOME</p></a>
	
</body>
</html>