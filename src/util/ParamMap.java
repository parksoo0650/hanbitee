package util;

import javax.servlet.http.HttpServletRequest;

public class ParamMap {
    public static String getValues(HttpServletRequest request,String name){
	String rs="";
	String[] values=(String[])request.getParameterMap().get(name);
	for(String s:values){
	    rs+=s+",";
	    
	}
	System.out.println("선택된 값은:"+rs);
	rs=rs.substring(0,rs.length()-1);
	return rs;
    }
}
