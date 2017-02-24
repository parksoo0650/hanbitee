<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css}/hanbit.css" />
	<ul id="ulGnb" style="height:40%">
		<li><a id="aJoin">고객:회원가입</a></li>
		<li><a id="aPatLogin">고객:로그인</a></li>
		<li><a id="aStaffLogin">스탭:로그인</a></li>
		<li><a id="aAdminLogin">관리자:로그인</a></li>
		<li><a id="aBoard">게시판</a></li>
		<li><div class="tooltip"><a href="#">병원소개</a>
  			<span class="tooltiptext">구현되지 않은 기능입니다.</span>
			</div>
		</li>
	</ul>

<script>
$(function() {
	$('#ulGnb').addClass('gnb').addClass('width_full_size')
	.addClass('text_center');
	$('#aJoin').click(function(){
		alert('jQuery Test!!!');
		location.href="${context}/patient.do?action=move&page=registerForm";
	});
	document.getElementById('aPatLogin').onclick=function(){
	alert('고객 로그인 클릭 했음!!!');
	location.href="${context}/patient.do?action=move&page=loginForm";
	}
	document.getElementById('aStaffLogin').onclick=function(){
		alert('스탭 로그인 클릭 했음!!!');
		location.href="${context}/staff.do?action=move&pageloginForm";
	}
	document.getElementById('aAdminLogin').onclick=function() {
		alert('관리자 로그인 클릭 했음!!!');
		location.href="${context}/admin.do?action=move&page=loginForm";
	}
	$('#aBoard').click(function() {
		alert('게시판 클릭 했음!!!');
		location.href="${context}/board.do?action=move&page=articleList";
	});
});
</script>