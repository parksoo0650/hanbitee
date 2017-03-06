<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../common/top.jsp" />
<jsp:include page="../common/header.jsp" />

<table id="articleList">
	<tr>
		<td>
			<th>총 게시글 수:${requestScope.count}</th>
		</td>
	</tr>
	<tr>
		<th style="width:1%;">no</th>
		<th style="width:5%;">작성자</th>
		<th style="width:20%;">제목</th>
		<th style="width:5%;">작성일</th>
		<th style="width:5%;">조회수</th>
	</tr>
<c:forEach var="article" items="${requestScope.list}">
	<tr>
		<td>${article.seq}</td>
		<td>${article.id}</td>
		<td><a href="${context}/board.do?action=detail&page=articleDetail&seq=${article.seq}">${article.title}</a></td>
		<td>${article.regdate}</td>
		<td>${article.readCount}</td>
	</tr>
</c:forEach>
</table>
<nav style="width:500px;margin: 0 auto;background: gray;">
<ul class="gnb">
<c:forEach var="page" items="${requestScope.block}">
	<li style="text-align: center;width: 30px">
	<a href="">${pageNo}</a>
	</li>
</c:forEach>
</ul>
</nav>
<script>
	$(function() {
		var $articlelist=$('#articleList');
		$articlelist.addClass('table_default').addClass('margin_center')
		.css('width','78%').css('heigh','200px').css('margin-top','15px');
		$articlelist.find('tr:nth-child(1)').addClass('bg_color_gray').addClass('color_white');
	})
</script>