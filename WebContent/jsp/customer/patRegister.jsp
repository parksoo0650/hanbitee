<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="serviceImpl.MemberServiceImpl" %>
<%@ page import="service.MemberService" %>
<%@ page import="domain.MemberBean" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = new MemberBean();
	member.setId(request.getParameter("userid"));
	member.setPassword(request.getParameter("password"));
	member.setEmail(request.getParameter("email"));                                                              
%>
</body>
</html>