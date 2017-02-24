<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

	<link rel="stylesheet" href="${css}/hanbit.css" />

<jsp:include page="../common/top.jsp"/>
<jsp:include page="../common/header.jsp"/>
<jsp:include page="../common/gnb.jsp"/>
<div id="container" class="width_full_size" style="height:800px;">
	<form action="patRegister.jsp" style="width:40%;margin-top:15px;" class="margin_center" >
		<table class="table_default">
			<tr>
				<td class="color_blue">한글 또는 영문으로 입력해 주세요</td>
			</tr>
			<tr>
				<td><input type="text" name="userid" value="아이디" size="20">
				<input type="button" value="중복확인">
				<p>이름을 입력하세요</td>
			</tr>
			<tr>
				<td><input type="text" name="password" value="이름" size="20">
				<p>LPOINT아이디는 자주 사용하시는 이메일주소로 입력해주세요</td>
			</tr>
			<tr>
				<td><input type="email" name="email" value="E-mail" size="20">
				<p>LPOINT아이디는 자주 사용하시는 이메일주소로 입력해주세요</td>
			</tr>
			<tr>
				<td><input type="password" name="password" value="비밀번호"
					size="20">
				<p>8~15자의 영문자,숫자,특수문자를 함께 입력해주세요</td>
			</tr>
			<tr>
				<td><input type="password" name="password" value="비밀번호확인"
					size="20">
				<p></td>
			</tr>
			<tr>
				<td><select name="birthyear" onchange="setYear();">
						<option value="생년">생년</option>
						<option value="1992">1992</option>
				</select> <select name="birthmonth">
						<option value="월">월</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
				</select> <select name="birthday">
						<option value="일">일</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
				</select><br /><br />
				<input type="text" name="ssn1" size="8" value="" onchange=""/>-<input type="text" name="ssn2" size="8"/>
				<p></td>
			</tr>
			<tr>
				<td><select name="telecom">
						<option value="SKT">SKT</option>
						<option value="KT">KT</option>
						<option value="LGU+">LGU+</option>
				</select> <select name="firstnum">
						<option value="010">010</option>
				</select> -<input type="tel" name="pnum1" size="4"> -<input
					type="tel" name="pnum2" size="4">
				<p></td>
			</tr>

			<tr align="left">
				<th>정보수신 동의<input type="checkbox" name="allcheck">전제선택
				</th>
			</tr>
			<tr>
				<td>LPOINT<input type="checkbox" name="mail" value="E-Mail">E-Mail
					<input type="checkbox" name="sms" value="SMS">SMS
					<p>
						롯데시네마<input type="checkbox" name="mail" value="E-Mail">E-Mail
						<input type="checkbox" name="sms" value="SMS">SMS
					<p>*정보수신동의를 하시면,고객혜택 및 이벤트 등 다양한 정보를 받으실 수 있습니다.</td>
			</tr>
			<tr>
				<td>개인정보 유효기간 <input type="radio" name="del" value="탈퇴 시 파기">탈퇴
					시 파기 <input type="radio" name="oneyear" value="1년">1년
					<p>*개인정보 유효기간 경과 이후 개인정보를 분리 저장관리 또는 파기합니다.
					<p></td>
			</tr>
		</table>
		<span class="color_blue">*선택항목에 동의하지 않으셔도 정상적인 서비스를 이용하실수 있습니다.</span>
		<div>
		<a href="#" class="button_link button_visited button_action button_hover" style="width:180px;">이전</a>
		<a href="#" class="button_link button_visited button_action button_hover" style="width:180px;">다음</a>
		</div>
	</form>
</div>
<jsp:include page="../common/footer.jsp"/>