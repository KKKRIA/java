<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- RSS 서비스를 제공하는 웹프로그램을 AJAX 기능으로 요청하여 실행결과를 응답받아 클라이언트에게 전달하여 응답하는 JSP 문서--%>
<%--RSS(Really Simple Syndication 또는 Rich Site Summary) : 블로그, 뉴스, 기업정보 등과 같이
자주 업데이트 되는 사이트의 컨텐츠를 보다쉽게 사용자에게 전달하기 위해 만들어진 서비스 --%>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX</title>
</head>
<body>
	<h1>RSS Reader</h1>
	<hr>
	<div id="display"></div>
	
	<script type="text/javascript">
		$.ajax({
			type: "get",
			url: "comment_remove.jsp",
			dataType: "xml",
			success: function(xmlDoc) {
				var channelTitle=$(xmlDoc).find("channel").children("title").text();
				
				var html="<h2>+channelTitle+"</h2>";
				html+="<ul>";
				$(xmlDoc).find("item").each(function()){
					var title=$
				}
				
			},
			error: function(xhr) {
				alert("에러코드 = "+xhr.status);
			}
		});
	});
	</script>
</body>
</html>