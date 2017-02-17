<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
</head>
<body>
	<%!public String getGender(String ssn){
		    String gender="";
		    char ch = ssn.charAt(7);
			String result = "";
			if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			gender = "다시입력하세요!!!";
			}else{
		    switch(ch){
			case '1' : case '3' :
				gender = "남자"; 
				break;
			case '2' :case '4' :
				gender = "여자"; 
				break;
			case '5' : case '6' :
				gender = "외국인"; 
				break;
			default :
				gender = "몰라!!!";
		    }
		}
			return gender;
			
	}
	    
	%>
	이름 :<%=request.getParameter("name")%>
	성별 :<%=getGender(request.getParameter("ssn"))%>
</body>
</html>