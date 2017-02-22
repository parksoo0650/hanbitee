<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css}/hanbit.css" />
<div id="container" class="width_full_size margin_center" style="height:600px; margin_top:40%">
<form action="${context}/patient.do" method="get" style="width:50%;height: 50%" class="margin_center">
<table class="table_default" style="width:100%;">
	<tr>
		<th>진료</th>
		<th>진료일</th>
		<th>진료NO</th>
		<th>담당의사</th>
		<th>직책</th>
		<th>진료과목</th>
		<th>병명</th>
		<th>처방내역</th>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>

</table>
<input type="hidden" name="action" value="login"/>
<input type="hidden" name="page" value="main"/>
</form>
</div>

