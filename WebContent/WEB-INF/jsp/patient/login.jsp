<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="service.PatientService" %>
<%@ page import="serviceImpl.PatientServiceImpl" %>
<%@ page import="domain.PatientBean" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<link rel="stylesheet" href="<%=application.getContextPath()%>/css/hanbit.css" />
	<title>Document</title>
</head>
<body>
<%
	PatientBean member  = new PatientBean();
	PatientService service = PatientServiceImpl.getInstance();
	member.setPatID(request.getParameter("userid"));
	member.setPatPass(request.getParameter("password"));
	boolean check = service.login(member);
	if(check){
%>
	로그인 되었습니다!!!
	환영합니다! <%=request.getParameter("userid")%> 님
	<a href="">내정보</a>
	<input type="button" value="로그아웃" onclick="location='patLoginForm.jsp'"/>
<%
	}else{
%>
	로그인 실패입니다.!!!
	<input type="button" value="뒤로가기" onclick="location='patLoginForm.jsp'"/>    
<% 
	}
%>
</body>
</html>