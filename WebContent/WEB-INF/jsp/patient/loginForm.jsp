<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../common/top.jsp" />
<jsp:include page="../common/header.jsp"/>
<div id="container" class="width_full_size" style="height:600px;position: relative;top:100px">
<form action="${context}/patient.do" method="post" style="width:20%;" class="margin_center">
<table>
	<tr>
		<td>
		<input type="text" name="id" placeholder="아이디"/>
		</td>
		<td rowspan="2">
		
		</td>
	</tr>
	<tr>
		<td>
		<input type="password" name="password" placeholder="비밀번호"/>
		</td>
	</tr>
</table>
<input type="hidden" name="action" value="login"/>
<input type="hidden" name="page" value="main"/>
<input type="submit" value="로그인" class="width_full_size height_full_size"/>
</form>
</div>
<jsp:include page="../common/footer.jsp"/>

</body>
</html>