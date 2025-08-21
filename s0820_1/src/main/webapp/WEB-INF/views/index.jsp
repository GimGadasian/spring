<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mainPage</title>
</head>
<body>
<script type="text/javascript">
	if("${flag}"=="2"){
		   alert("로그아웃 되었습니다.");
	}
</script>
	<h2>main page</h2>
		<c:if test="${empty sessionScope.session_id}">
    		<h4>로그인 후 추가 기능 제공</h4>
		</c:if>
		<c:if test="${not empty sessionScope.session_id}">
    		<h4>Welcome back, ${sessionScope.session_name}!</h4>
		</c:if>

	<ul>
		<li><a href= "member/signUp">sign up page</a></li>
		<li><a href= "member/login">login page</a></li>
		<li><a href= "member/logout">logout page</a></li>
		<li><a href= "member/mlist">member list page</a></li>
		
		<li><a href= "board/blist">board list page</a></li>
	</ul>
</body>
</html>