<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberInfot</title>
<style type="text/css">
	h2, p {text-align: center;}
	table{width:900px; margin:10px auto;}
	table,th,td{border:1px solid grey; border-collapse: collapse;}
	th, td{width:200px; height:40px; text-align: center; }
</style>
</head>
<body>
	<h2>member information page</h2>
	<c:if test="${member == null}">
    <p>회원 정보가 없습니다.</p>
</c:if>
	<table>
		<tr>
			<th>ID</th>
			<th>PW</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Gender</th>
			<th>Hobby</th>
		</tr>
		
		
		<tr>
			<td>${member.id }</td>
			<td>${member.pw }</td>
			<td>${member.name }</td>
			<td>${member.phone }</td>
			<td>${member.gender }</td>
			<td>${member.hobby }</td>
		</tr>
		
	</table>
	
	<br>
	<a href="/"><p>HOME</p></a>
	
</body>
</html>