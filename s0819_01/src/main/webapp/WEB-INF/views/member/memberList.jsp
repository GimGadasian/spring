<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		h2, h3{text-align: center;}
	  	table{width:1200px; margin:10px auto;}
	  	table,th,td{border:1px solid black; border-collapse: collapse;}
	  	th,td{width:200px; height:40px; text-align: center; }
	</style>
</head>
<body>
	<h2>member list</h2>
	
	
	
	<table>
		<tr>
		<th>Name</th><th>Age</th><th>ID</th><th>PW</th><th>NickName</th><th>Tel</th>
		</tr>
		<c:forEach var="member" items="${memberList}">
	
		
		
		<tr>
		<td>${member.name }</td><td>${member.age }</td><td>${member.id }</td><td>${member.pw }</td><td>${member.nick }</td><td>${member.tel }</td>
		</tr>
		
	
		</c:forEach>
	</table>	
	
	<br>
	
	<h3><a href="/">Home</a></h3>
	
	
</body>
</html>