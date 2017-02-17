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
<%
	BoardService service = BoardServiceImpl.getInstance();
	List<ArticleBean> list = service.list(); 
	int rowCount=5;
	int card = service.count();
%>
<div style="width: 90%; margin-top:10%">
<table class="table_default margin_center" style="width: 500px;">
	<tr>
		<th colspan="5"  style="text-align: right;">총 개시글 수 :<%=card%> 건 </th>
	</tr>
	<tr>
		<td>No</td>
		<td>ID</td>
		<td>제목</td>
		<td>등록일</td>
		<td>조회수</td>
	</tr>
<%
	for(int i=0; i<rowCount;i++){
    
%>
	<tr>
		<td><%=list.get(i).getSeq() %></td>
		<td><%=list.get(i).getId() %></td>
		<td><a href=""><%=list.get(i).getTitle() %></a></td>
		<td><%=list.get(i).getRegdate()%></td>
		<td><%=list.get(i).getReadCount() %></td>
	</tr>
<%
}
%>
</table>
<nav style="width: 500px; margin:0 auto;">
	<ul class="gnb" style="text-align: center;">
<%   
	int pageCount=(card%rowCount==0)?card/rowCount:card/rowCount+1;
	for(int i=0; i<pageCount; i++){%>	
	<a href=""><li style="text-align: center; width: 20px;">
	<%=i+1%>
	</li></a>
 <% }%>
  </ul>
  </nav>
  </div>
</body>
</html>