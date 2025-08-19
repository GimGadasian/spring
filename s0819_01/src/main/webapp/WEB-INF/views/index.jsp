<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mainPage</title>
</head>
<body>
	<h2>main page</h2>
	<ul>
		<li><a href= "member/login">login page</a></li>
		<li><a href= "member/signUp">sign up page</a></li>
		<li><a href= "member/memberView">member information page</a></li>
		<li><a href= "member/memberList">member list page</a></li>
		<li><a href= "student/score">student score page</a></li>
		<li><a href= "num/numResult">num page</a></li>
		<li><a href= "board/list/1">board page_pathVar</a></li> <%-- @pathVariable --%>
		<li><a href= "board/board/default">board page_1</a></li> <%-- default value --%>
		<li><a href= "board/board?page=1">board page_param</a></li> <%-- call by parameter --%>
	</ul>
</body>
</html>