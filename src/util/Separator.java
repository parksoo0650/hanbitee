package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Command;
import factory.CommandFactory;

public class Separator { //url이 넘어오면 분리함
    public static CommandFactory factory= new CommandFactory();
    public static Command command;
    public static void init(HttpServletRequest request, HttpServletResponse response){
	String path = request.getServletPath();
	System.out.println("jsp 경로는"+path);
	String directory=path.substring(0, path.indexOf("."));
	String action=request.getParameter("action");
	String page=request.getParameter("page");
	command=Commandfactory.createCommand(directory, action, page);
    }
}
