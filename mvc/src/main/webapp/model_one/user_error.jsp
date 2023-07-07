<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%-- 에러메세지를 클라이언트에게전달하여 응답하는 JSP 문서  --%> 
 <%-- --%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC</title>
<style type="text/css">
body{
	text-align:center;
}
.message{
	color:red;
	font-size:1.5em;
}
</style>

</head>
<body>
	<h1>에러페이지</h1>
	<hr>
	<p class="message">프로그램 실행에 예기치 못한 오류 발생</p>
	<button type="button" onclick="locataion.href='user_login.jsp';">메인으로</button>
</body>
</html>