<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="xyz.itwill.dto.MemberDTO"%>
<%@page import="xyz.itwill.dto.ReviewDTO"%>
<%@page import="java.util.List"%>
<%@page import="xyz.itwill.dao.ReviewDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- REVIEW 테이블에 저장된 게시글을 검색하여 게시글 목록을 클라이언트에게 전달하여 응답하는 JSP 문서 --%>
<%-- => 게시글을 페이지로 구분하여 검색 처리 - 페이징 처리 --%>
<%
	//게시글 검색 기능에 필요한 전달값(검색대상과 검색단어)을 반환받아 저장
	String search=request.getParameter("search");
	if(search==null) {//전달값이 없는 경우
		search="";
	}
	
	String keyword=request.getParameter("keyword");
	if(keyword==null) {
		keyword="";
	}

	//페이징 처리에 필요한 전달값(페이지 번호)을 반환받아 저장
	// => 페이징 처리에 필요한 전달값이 없는 경우 1번째 페이지의 게시글 목록을 검색하여 응답
	int pageNum=1;
	if(request.getParameter("pageNum")!=null) {//전달값이 있는 경우
		pageNum=Integer.parseInt(request.getParameter("pageNum"));
	}
	
	//하나의 페이지에 검색되어 출력될 게시글의 갯수 설정 - 전달값으로 반환받아 저장 가능
	int pageSize=10; //한페이지에 10개 출력
	
	
	//게시글 검색 관련 정보를 전달받아 REVIEW 테이블에 저장된 게시글 중 검색 처리된 전체   
	//게시글의 갯수를 검색하여 반환하는 DAO 클래스의 메소드 호출
	int totalReview=ReviewDAO.getDAO().selectReviewCount(search, keyword);
			
	//전체 페이지의 갯수를 계산하여 저장
	//int totalPage=totalReview / pageSize + totalReview % pageSize == 0 ? 0 : 1; //0과 같은지 나머지가 없는지, 나머지가 없으면 0 나머지가 있으면 1제공하여 몫에다가 더하기 	
	int totalPage=(int)Math.ceil((double)totalReview / pageSize); //ceil : 소수점 밑에 숫자가 있으면 올림처리, 더블을 반환하기 때문에 형변환하기
	
	//전달받은 페이지 번호가비정상적인 경우
	if(pageNum<=0 || pageNum>totalPage){
		pageNum=1; //1번째 페이지의 게시글 목록을 검색
	}
	
	//요청한 페이지 번호에 대한 시작 게시글의 행번호를 계산하여 저장
	//ex) 1page : 1, 2page : 11, 3page : 21, 4page : 31 ...
	int startRow=(pageNum-1)*pageSize+1;	 //(2(page)-1)*10+1 =11

	//요청한 페이지 번호에 대한 종료 게시글의 행번호를 계산하여 저장
	//ex) 1page : 10, 2page : 20, 3page : 30, 4page : 40 ...
	int endRow=pageNum*pageSize;
	
	//마지막 페이지의 종료 게시글 행번호가 검색 게시글의 갯수보다 많은 경우 
	if(endRow>totalReview){
		endRow=totalReview; //종료 게시글 행번호를 검색 게시글의 갯수로 변경
	}
	
	//페이징 처리 관련 정보와 게시글 검색 기능 관련 정보를 전달하여 REVIEW 테이블에 저장된
	//게시글 목록을 검색하여 List 객체로 반환하는 DAO클래스의 메소드 호출
	List<ReviewDTO> reviewList=ReviewDAO.getDAO().selectReviewList(startRow, endRow, search, keyword);
	
	//세션에 저장된 권한 관련 속성값을 객체로 반환받아 저장
	// => 로그인 상태의 사용자에게만 글쓰기 권한 제공
	// => 비밀글인 경우 로그인 상태의 사용자가 게시글 작성자이거나 관리자인 경우에만 사용 권한 제공
	MemberDTO loginMember=(MemberDTO)session.getAttribute("loginMember");
	
	//서버 시스템의 현재 날짜를 제공받아 저장
	// => 게시글 작성날짜와 현재 날짜를 비교하여 게시글 작성날짜를 다르게 출력되도록 응답 처리
	String currentDate=new SimpleDateFormat("yyy-MM-dd").format(new Date());
	
	//페이지에 출력될 게시글의 일련번호 시작값을 계산하여 저장
	// => 검색게시글의 갯수 : 91 >> 1page : 91~82, 2page : 81~72, 3page : 71~62, ...
	int printNum=totalReview-(pageNum-1)*pageSize; //
	
%>    
<style type="text/css">
#review_list{
	width:1000px;
	margiin:0 auto;
	text-algin:center;
}
#review_title{
	font-size:1.2em;
	font-weight:bold;
}

table{
	margin:5px auto;
	border:1px solid #000;
	border-collapse: collapse;
}
th{
	border:1px solid #000;
	background:#000;
	color:#fff;
}
td{
	border:1px solid #000;
	text-algin:center;
}

.subject{
	text-align:left;
	padding:5px;
	white-space:nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}
#review_list a:hover{
	text-decoration: none;
	color:blue;
	font-weight: bold;
}
.subject_hidden{
	background-color: #000;
	color:#fff;
	font-size:14px;
	border:1px solid #000;
	border-radius: 4px;
}
	
</style>

<h1>제품후기</h1>
<div id="review_list">
	<div id="review_title">제품후기목록(<%=totalReview %>)</div>
	<% if(loginMember!=null) {%>
	<div style="text-algin:right;">
		<button type="button">글쓰기</button>
	</div>
	<%}%>
	
	<%-- 게시글 목록 출력 --%>
	<table>
		<tr>
			<th width="100">글번호</th>
			<th width="500">제목</th>
			<th width="100">작성자</th>
			<th width="100">조회수</th>
			<th width="200">작성일</th>
		</tr>
		
		<% if(totalReview==0){ %>
		<tr>
			<td colspan="5">검색된 게시글이 없습니다.</td>
		</tr>
		<%} else{ %>
			<%-- List 객체의 요소 (ReviewDTO 객체)를 하나씩 제공받아 처리하기 위한 반복문 --%>
			<% for(ReviewDTO review : reviewList){ %>
				<tr>
					<%-- 게시글 일련번로 : Review 테이블의 글번호가 아닌 게시글의 일련번호로 응답 처리 --%>
					<td><%=printNum %></td>
					<% pageNum--; %><%-- 게시글 일련번호를 1씩 감소하여 저장 --%>
					
					<%-- 제목 --%>
					<td class="subject">
						<%-- 게시글이 답글인 경우에 대한 응답 처리--%>
						<% if(review.getRestep()!=0) { //검색된 게시글이 답글인 경우 %>
							<span style="margin-left:<%=review.getRelevel()*20 %>px;">└[답글]</span>
						<% } %>
						<%-- 게시글의 상태를 비교하여 제목과 링크를 다르게 설정 --%>
					
					</td>
				</tr>
			<% } %>
		<% } %>
	</table>
</div>









