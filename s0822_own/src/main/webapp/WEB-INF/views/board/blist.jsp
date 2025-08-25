<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 

<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board page</title>
<style type="text/css">
	h2, p {text-align: center;}
	table{width:900px; margin:10px auto;}
	table,th,td{border:1px solid grey; border-collapse: collapse;}
	th, td{width:200px; height:40px; text-align: center; }
</style>
</head>
<body>
	<script type="text/javascript">
	    var flag = "${param.flag}";
	    if (flag == "1") {
	        alert("게시글이 등록되었습니다");
	    }
	    
	    if (flag == "-1") {
	        alert("게시글이 삭제되었습니다");
	    }
	    
	    if (flag == "2") {
	        alert("게시글이 수정되었습니다");
	    }
	    
	</script>

	<h2>board page</h2>
	
	<div style="width:900px; margin:20px auto; text-align:right;">
	  <form action="/board/search" name="search" method="get">
	    <select id="category" name="category">
	      <option value="all">전체</option>
          <option value="btitle">제목</option>
          <option value="bcontent">내용</option>
	    </select>
	    
	    <input type="text" id="sWord" name="sWord" placeholder="검색어 입력" style="width:200px;">
	    <button type="button" onclick="searchBtn()">검색</button>
	  </form>
	</div>
	
	
	<script>
      function searchBtn(){
    	  if($("#sWord").val().length < 1){
    		  alert("검색어를 입력하셔야 검색이 가능합니다.");
    		  $("#sWord").focus();
    		  return;
    	  }
    	  var category = $("#category").val();
    	  var sWord = $("#sWord").val();
    	  location.href="/board/search?category="+category+"&sWord="+sWord;
      }
    </script>
	
	<table>
      <colgroup>
        <col width="15%">
        <col width="*">
        <col width="15%">
        <col width="15%">
        <col width="15%">
      </colgroup>
      
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
      </tr>
      <c:forEach var="b" items="${list}">
      <tr>
        <td>${b.bno}</td>
        <td class="table-title">
          <a href="/board/bview?bno=${b.bno}">${b.btitle}</a>
        </td>
        <td>${b.id}</td>
        <td>
        
        <fmt:formatDate value="${b.bdate}" pattern="yyyy-MM-dd"/>
        </td>
        <td>${b.bhit}</td>
      </tr>
      </c:forEach>
      
    </table>
	
	<br>
	<a href="/"><p>HOME</p></a>
	<a href="/board/bwrite"><p>POST</p></a>
</body>
</html>