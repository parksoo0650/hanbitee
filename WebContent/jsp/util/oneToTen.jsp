<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>1-10까지의 합</title>
</head>
<body>
	<%
		int sum=0;
		for(int i=0; i<=10; i++){
		    sum+=i;
		}
	%>
	<%=sum %>
</body>
</html>