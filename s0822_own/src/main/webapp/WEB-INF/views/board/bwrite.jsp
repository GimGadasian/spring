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
	.button-wrapper {
		 width: 620px;
		  margin: 0 auto;
		  text-align: right; /* 버튼을 왼쪽 정렬 */
		}
		
		.button-wrapper button {
		  display: inline-block;
		  margin: 0 10px;
		}

</style>
<script>
        function readURL(input) {
        	  if (input.files && input.files[0]) {
        	    var reader = new FileReader();
        	    reader.onload = function(e) {
        	      document.getElementById('preview').src = e.target.result;
        	    };
        	    reader.readAsDataURL(input.files[0]);
        	  } else {
        	    document.getElementById('preview').src = "";
        	  }
        	}
        </script>
</head>
<body>
	<h2>register post</h2>
	
	<section>
    
    <hr>

    <form action="/board/bwrite" name="write" method="post" enctype="multipart/form-data">
      <table>
        <colgroup>
          <col width="15%">
          <col width="85%">
        </colgroup>
        
        <tr>
          <th>제목</th>
          <td>
            <input type="text" name="btitle">
          </td>
        </tr>
        <tr>
          <th>작성자</th>
          <td>
            <input type="text" name="id" value="bbb">
          </td>
        </tr>
        <tr>
          <th>내용</th>
          <td>
            <textarea name="bcontent" cols="50" rows="10"></textarea>
          </td>
        </tr>
        <tr>
          <th>이미지 첨부</th>
          <td>
            <input type="file" name="files" id="file" onchange="readURL(this);">
            
          </td>
        </tr>
        <tr>
          <th>이미지 보기</th>
          <td>
             <img id="preview" style="width:200px" />
          </td>
        </tr>
        
      </table>
      <hr>
      <div class="button-wrapper">
        <button type="submit" class="write">작성완료</button>
        <button type="button" onclick="javascript:location.href='/bList'" class="cancel">취소</button>
      </div>
    </form>

  </section>

	
	<br>
	<a href="/"><p>HOME</p></a>
	
</body>
</html>