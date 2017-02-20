<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="serviceImpl.PatientServiceImpl" %>
<%@ page import="service.PatientService" %>
<%@ page import="domain.PatientBean" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%
	PatientService service = PatientServiceImpl.getInstance();
	PatientBean member = new PatientBean();
	member.setPatID((request.getParameter("userid")));
	member.setPatPass(request.getParameter("password"));
	member.setPatName(request.getParameter("name"));
	member.setPatEmail(request.getParameter("email"));
	member.setParJumin(request.getParameter("birthyear"));
%>
</body>
</html>