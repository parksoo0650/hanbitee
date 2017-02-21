<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="context" value="<%=request.getContextPath()%>" />
<c:set var="img" value="${context} }" />



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/hanbit.css"/>
</head>
<body>

<div id="wrapper" class="width_full_size" style="height:100%;">
<div id="header" class="width_full_size position_fixed" style="height:100px">
<div class="logo_box width_full_size" style="height:60%;">
<img src="${img}/images/common/index_logo.png" class="image_center" />

<img src="${context}/images/common/index_logo.png" class="image_center" />
</div>

	<ul class="gnb width_full_size text_center" style="height:40%">
		<li><a href="${context}/patient.do?action=move&page=registerForm" >회원가입</a></li>
		<li><a href="${context}/patient.do?action=move&page=loginForm">로그인</a></li>
		<li><a href="${context}/board.do?action=move&page=main">자유게시판</a></li>
		<li><a href="${context}/admin.do?action=move&page=loginForm">관리자모드</a></li>
		<li><div class="tooltip"><a href="#">병원소개</a>
  			<span class="tooltiptext">구현되지 않은 기능입니다.</span>
			</div>
		</li>
	</ul>	
</div>
</div>

</body>