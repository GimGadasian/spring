<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>postViewPage</title>
<style type="text/css">
	h2, p {text-align: center;}
	table{width:600px; margin:10px auto;}
	table,th,td{border:1px solid grey; border-collapse: collapse;}
	th, td{width:100px; height:40px; text-align: center; }
</style>
</head>
<body>
	<h2>${board.id }'s post</h2>
	
	<table>
	
	
        <colgroup>
		  <col style="width: 20%;">
		  <col style="width: 60%;">
		  <col style="width: 20%;">
		</colgroup>

      <tr>
        <th>제목</th>
        <td>${board.btitle}</td>
         <td>
          <fmt:formatDate value="${board.bdate}" pattern="yyyy-MM-dd"/>
        </td>
      </tr>
      
      <tr>
        <th>내용</th>
        <td colspan="2"> ${board.bcontent}</td>
      </tr>
      
      <tr>
        <th>파일명</th>  
        <td colspan="2">
        <c:if test="${board.bfile == null }">
            파일첨부 : 첨부된 파일이 없습니다.
        </c:if>
        <c:if test="${board.bfile != null }">
            파일첨부 : ${board.bfile }
        </c:if>
        </td>
        
      </tr>
      <tr>
        <td class="article">
          <td colspan="2"><img src="/upload/${board.bfile}" width="50%" /></td>
        </td>  
      </tr>
      <tr>
      	<th>조회수</th>
        <td colspan="2">${board.bhit}</td>  
      </tr>
     
    </table>

	
	<br>
	<a href="/"><p>HOME</p></a>
	<a href="/board/blist"><div class="list"><p>목록</p></div></a> 
    <div onclick="deleteBtn()" class="list"><p>삭제</p></div>
    <a href="/board/bupdate?bno=${board.bno}"><div class="list"><p>수정</p>
    </div></a>
	
	<script>
    function deleteBtn(){
    	if(confirm(${board.bno}+" 번을 삭제하시겠습니까?")){
    		location.href="/board/bdelete?bno="+${board.bno};
    	}
    }
  </script>
  
</body>
</html>