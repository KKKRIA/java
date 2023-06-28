<%@page import="xyz.itwill.util.Utility"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 아이디 검색 관련 정보를 전달받아 MEMBER 테이블에 저장된 회원정보의 아이디를 검색하여
클라이언트에게 전달하여 응답하는 JSP 문서 --%>



<%
	if(request.getMethod().equals("GET")){
		response.sendRedirect(request.getContextPath()+"/index.jsp?group=error&worker=error_400");
		return;
	}


	//전달값을 반환받아 저장
	String id=request.getParameter("name");
	String email=request.getParameter("email");
	
	
	//저장된 값이 같은지 비교
	if(!loginMember.getName().equals(name)){
		session.setAttribute("message", "입력하신 내용이 맞지 않습니다.");
		out.println("<script type='text/javascript'>");
		out.println("location.herf='"+request.getContextPath()+"/index.jsp?group=member&worker=search_id");
		out.println("</script>");
		return;
	}
	
	if(!loginMember.getEmail().equals(email)){
		session.setAttribute("message", "입력하신 내용이 맞지 않습니다.");
		out.println("<script type='text/javascript'>");
		out.println("location.herf='"+request.getContextPath()+"/index.jsp?group=member&worker=search_id");
		out.println("</script>");
		return;
	}
	
	
	//아이디와 회원상태를 전달받아 MEMBER 테이블에 저장된 회원정보의 회원상태를 변경하는 DAO 클래스의 메소드 호출
	MemberDAO.getDAO().updateMemberStatus(loginMember.getId(), 0);
	
	
	
%>





<%--
<%
	if(request.getMethod().equals("GET")) {
		out.println("<script type='text/javascript'>");
		out.println("location.href='"+request.getContextPath()+"/index.jsp?group=error&worker=error_400'");
		out.println("</script>");
		return;
	}

	//전달값을 반환받아 저장 - 암호화 처리
	String passwd=Utility.encrypt(request.getParameter("passwd"));
	
	//로그인 상태의 사용자 비밀번호와 전달받은 비밀번호를 비교하여 같지 않은 경우
	if(!loginMember.getPasswd().equals(passwd)) {
		session.setAttribute("message", "입력하신 비밀번호가 맞지 않습니다.");
		out.println("<script type='text/javascript'>");
		out.println("location.href='"+request.getContextPath()+"/index.jsp?group=member&worker=password_confirm&action=modify'");
		out.println("</script>");
		return;
	}
%>
--%>


<h1>아이디 검색 결과</h1> 
<p style="font-size: 1.5em;">홍길동님의 아이디는 [abc123]입니다.</p>