<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<%!
	public int multipy(int a, int b){
    	return a * b;
	}
%>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>선언부를 사용한 두 정수값의 곱</title>
</head>
<body>
	10 * 25 = <%=multipy(10, 25) %>
</body>
</html>