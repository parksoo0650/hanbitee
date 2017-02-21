<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/css/hanbit.css" /> 

</head>
<body>
<div id="wrapper" class="width_full_size" style="height:100%;">
<div id="header" class="width_full_size position_fixed" style="height:100px">
<div class="logo_box width_full_size" style="height:60%;">
<img src="<%=application.getContextPath()%>/images/common/index_logo.png" class="image_center" />

</div>
	<ul class="gnb width_full_size text_center" style="height:40%">
		<li><a href="<%=application.getContextPath()%>/patient.do?action=move&page=registerForm" >회원가입</a></li>
		<li><a href="<%=application.getContextPath()%>/patient.do?action=move&page=loginForm">로그인</a></li>
		<li><a href="<%=application.getContextPath()%>/board.do?action=move&page=main">자유게시판</a></li>
		<li><div class="dropdown">
		<a href="<%=application.getContextPath()%>/admin.do?action=move&page=loginForm">관리자모드</a>
		<div class="dropdown_content">		
			<p><a href="html/staff/doctors.html" style="color:black;">의사</a></p>
	 		<p><a href="" style="color:black;">간호사</a></p>
	 		<p><a href="" style="color:black;">환자</a></p>
	  		<p><a href="" style="color:black;">진료</a></p>
	  		<p><a href="" style="color:black;">차트</a><p>
	  		</div>
		</div>
		</li>
		<li><div class="tooltip"><a href="#">병원소개</a>
  			<span class="tooltiptext">구현되지 않은 기능입니다.</span>
			</div>
		</li>
	</ul>	
</div>
<div style="height:100px"></div>
<div id="container" class="width_full_size" style="height:700px;">

</div>
</div>
	<div id="footer" class="width_full_size" style="height:80px;border-top: 1px solid #5a5a5a;">
	<dl class="notice">
		<dt><a href="#">공지사항</a></dt>
	</dl>
	<dl class="policy">
		<dt>네이버 정책 및 약관</dt>
		<dd class="f"><a href="http://www.navercorp.com/" id="plc.intronhn">회사소개</a></dd>
		<dd><a href="http://mktg.naver.com/" id="plc.adinfo">광고</a></dd>
		<dd><a href="https://submit.naver.com/" id="plc.search">마이비즈니스</a></dd>
		<dd><a href="https://www.navercorp.com/ko/company/proposalGuide.nhn" id="plc.contact">제휴제안</a></dd>
		<dd><a href="rules/service.html" id="plc.service">이용약관</a></dd>
		<dd><a href="rules/privacy.html" id="plc.privacy">개인정보처리방침</a></dd>
		<dd><a href="rules/youthpolicy.html" id="plc.youth">청소년보호정책</a></dd>
		<dd><a href="rules/spamcheck.html" id="plc.policy">네이버 정책</a></dd>
		<dd><a href="https://help.naver.com/" id="plc.helpcenter">네이버 고객센터</a></dd>
	</dl>
	<address>&copy;<a href="http://www.navercorp.com/">NAVER Corp.</a></address>
	</div>

</body>
</html>