<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<%!
	public int add(int a, int b){
    	return a+b;
	}

	public int subtract(int a, int b){
	    return a-b;
	}
%>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<%
	int value1=3;
	int value2=9;
	%>
	
	<%=value1 %> + <%=value2%> = <%=add(value1, value2) %>
	<br />
	<%=value1 %> - <%=value2 %> = <%=subtract(value1, value2) %>
</body>
</html>