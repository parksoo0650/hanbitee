<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<ul class="gnb width_full_size text_center" style="height:40%">
		<li><a href="<%=application.getContextPath()%>/home.do?action=move&page=main" >홈으로</a></li>
		<li><a href="<%=application.getContextPath()%>/patient.do?action=mypage&page=detail">마이페이지</a></li>
		<li><a href="<%=application.getContextPath()%>/patient.do?action=move&page=treatmentList">진료기록</a></li>
		<li><a href="<%=application.getContextPath()%>/board.do?action=move&page=articleList">게시판</a></li>
		<li style="float:right"><a href="<%=application.getContextPath()%>/home.do?action=logout&page=main">로그아웃</a></li>
	</ul>	

