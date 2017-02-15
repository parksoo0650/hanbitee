<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="util.BMI" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Bmi 측정</title>
</head>
<body>
<%
	int age = Integer.parseInt(request.getParameter("age"));
	if(age<=2){
%>
	다시 입력하세요!!!
	<input type="button" value="뒤로가기" onclick="location='bmiInput.jsp'"/>
<%    
	}else{
	double kg=Double.parseDouble(request.getParameter("kg"));
	double cm=Double.parseDouble(request.getParameter("cm"));
%>

키 :<%=cm %><br />
몸무게 : <%=kg %><br />
신체지수 : <%=new BMI().getBmi(cm, kg)%>
<%	
	}
%>
</body>
</html>