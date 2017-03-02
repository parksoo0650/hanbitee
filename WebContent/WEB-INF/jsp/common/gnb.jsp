<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<ul id="commonGnb" style="height:40%">
		<li><a>고객:회원가입</a></li>
		<li><a>고객:로그인</a></li>
		<li><a>스탭:로그인</a></li>
		<li><a>관리자:로그인</a></li>
		<li><a>게시판</a></li>
		<li><div class="tooltip"><a href="#">병원소개</a>
  			<span class="tooltiptext">구현되지 않은 기능입니다.</span>
			</div>
		</li>
	</ul>
<script>
$(function() {
	var commonGnb = $('#commonGnb');
	commonGnb.addClass('gnb').addClass('width_full_size').addClass('text_center');
	commonGnb.find('li:nth-child(1)').click(function(){
		alert('jQuery Test!!!');
		goPage('${context}/patient.do','move','registerForm');
	});
	commonGnb.find('li:nth-child(2)').click(function(){
		alert('고객 로그인 클릭 했음!!!');
		goPage('${context}/patient.do','move','loginForm');
	});
	commonGnb.find('li:nth-child(3)').click(function(){
		alert('스탭 로그인 클릭 했음!!!');
		goPage('${context}/staff.do','move','pageloginForm');
	});
	commonGnb.find('li:nth-child(4)').click(function(){
		alert('관리자 로그인 클릭 했음!!!');
		goPage('${context}/admin.do','move','loginForm');
	});
	commonGnb.find('li:nth-child(5)').click(function(){
		alert('게시판 클릭 했음!!!');
		goPage('${context}/board.do','move','articleList');
	});
});
</script>