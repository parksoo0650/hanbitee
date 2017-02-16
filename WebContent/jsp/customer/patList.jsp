<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="serviceImpl.BoardServiceImpl" %>
<%@ page import="domain.ArticleBean" %>
<%@ page import="service.BoardService" %>
<%@ page import="java.util.List" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<link rel="stylesheet" href="../../css/hanbit.css" />
</head>
<body>
<div style="width: 90%; margin-top:10%" >
<table class="table_default margin_center" style="width: 500px;">
	<tr>
		<td>No</td>
		<td>ID</td>
		<td>제목</td>
		<td>등록일</td>
		<td>조회수</td>
	</tr>
<%
	BoardService service = BoardServiceImpl.getInstance();
	List<ArticleBean> list = service.list(); 
	int card=5;
	int count = service.count();
	int blockCount=count/card;
	if(count%card==0){
	    blockCount = count/card;
	}else{
	    blockCount = count/card + 1;
	}
	int blockNo=0;
	int blockStart=1;
	int blockEnd=0;
	for(int i=0; i<card;i++){
    
%>
	<tr>
		<td><%=list.get(i).getSeq() %></td>
		<td><%=list.get(i).getId() %></td>
		<td><%=list.get(i).getTitle() %></td>
		<td><%=list.get(i).getRegdate()%></td>
		<td><%=list.get(i).getReadCount() %></td>
	</tr>
<%
}
%>
	<tr>
	<td></td>
	</tr>
	<div>
		<%="◀" %>
		<%= blockStart %>
		<%= blockEnd %>
		<%= "▶" %>
		
	</div>
</table>
</div>
</body>
</html>