<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%
	int month = Integer.parseInt(request.getParameter("month")) 
	,year = Integer.parseInt(request.getParameter("year"));

	String res = "0";
	switch (month) {
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	    res = "31";
	    break;
	case 4: case 6: case 9: case 11:
	    res = "30";
	    break;
	case 2:
	    if (year % 4 == 0 && year % 100 != 0) {
		res = "29";
	    } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
		res = "29";
	    } else {
		res = "28";
	    }
	    break;
	default:
	    res = "몰라";
	}
%>
<%=year%>년  <%=month %>월은 <%=res %>일 입니다. 
</body>
</html>