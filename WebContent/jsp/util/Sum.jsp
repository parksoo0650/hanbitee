<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<% int sum=0; 
		for(int i=11; i<=20; i++){
		    sum+=i;
		}
	%>
	11부터 20까지의 합은 <%=sum %> 입니다.
</body>
</html>