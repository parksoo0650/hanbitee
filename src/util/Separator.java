package util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import factory.CommandFactory;

public class Separator { //url이 넘어오면 분리함
    public static CommandFactory factory= new CommandFactory();
    public static Command command;
    public static void init(HttpServletRequest request, HttpServletResponse response)
    				throws ServletException, IOException{
	String path = request.getServletPath();
	String directory=path.substring(0, path.indexOf("."));
	String action=request.getParameter("action");
	String page=request.getParameter("page");
	String pageNo=request.getParameter("pageNo");
	System.out.println("Separator path="+path);
	System.out.println("Separator dir="+directory);
	System.out.println("Separator action="+action);
	System.out.println("Separator page="+page);
	System.out.println("Separator pageNo="+pageNo);
	if(pageNo==null){
	    command=CommandFactory.createCommand(directory, action, page);
	}else{
	    command=CommandFactory.createCommand(directory, action, page, pageNo);
	}
	
    }
}
