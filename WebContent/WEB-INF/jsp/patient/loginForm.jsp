<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../common/top.jsp" />
<jsp:include page="../common/header.jsp"/>
<div id="container">
<form id="loginForm">
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
$(function(){
	var loginForm=$('#loginForm');
	var tab=loginForm.find('table');
	$('#container').addClass('width_full_size').css('height','+=600')
	.css('position','relative').css('top','+=50').css('width','+=20');
	loginForm.addClass('margin_center').css('width','+=20');
	$('#loginForm input[value=로그인]').click(function() {
		loginForm.attr("action","${context}/patient.do");
		loginForm.attr("method","post");
		var idVal=tab.find('input[name=id]').val();
		var pwVal=tab.find('input[name=password]').val();
		if(idVal==''||pwVal==''){
			alert('값을 먼저 입력해주세요');
		}else{
			alert('로그인 하기 위해 입력한 ID 값, PW값'+idVal+'PW='+pwVal);
			loginForm.submit();
		}
	});

});
</script>
