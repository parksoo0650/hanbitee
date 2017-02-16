<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="serviceImpl.BoardServiceImpl" %>
<%@ page import="domain.ArticleBean" %>
<%@ page import="service.BoardService" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%
	BoardService service = BoardServiceImpl.getInstance();
	
	
%>	
	<%=service.list()%>
</body>
</html>