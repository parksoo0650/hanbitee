<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../common/top.jsp" />
<jsp:include page="../common/header.jsp"/>
<div id="container">
<form  id="frm" action="${context}/patient.do"  class="">
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
<input id="log" type="submit" value="로그인"/>
</form>
</div>
<script>
$((function(){
	$('#container').addClass('width_full_size').css('height','600px')
	.css('position','relative').css('top','+=50').css('width','20%');
	$('#frm').addClass('margin_center').css('width','20%');
});
</script>
