<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	<h2>${score.no} / ${score.name}'s score</h2>
	
	<table>
		<tr>
		<th>No.</th>
		<th>Name</th>
		</tr>
		
		<tr>
		<td>${score.no }</td> <%-- 참조변수 아님!!! el 모델안에 객체를 넣은 것 --%>
		<td>${score.name }</td>
		</tr>
		
		<tr><th colspan="2">Score</th></tr>
		
		<tr>
		<th>Kor</th>
		<td>${score.kor }</td>
		</tr>
		<tr>
		<th>Eng</th>
		<td>${score.eng }</td>
		</tr>
		<tr>
		<th>Math</th>
		<td>${score.math }</td>
		</tr>
		
		<tr><th colspan="2">Result</th></tr>
		
		<tr>
		<th>Total</th>
		<td>${score.total }</td>
		</tr>
		<tr>
		<th>Avr</th>
		<td><fmt:formatNumber value="${score.avr }" pattern="00.##"/></td>
		</tr>
	</table>
	<br>
	
	<h3><a href="/">Home</a></h3>
	
	
</body>
</html>