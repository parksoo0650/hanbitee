package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import handler.CommandHandler;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class MoveCommand extends Command implements CommandHandler {
    @Getter
    @Setter
    protected String directory, action, page, pageNo, searchWord;
    @Getter
    protected String view;

    public MoveCommand(String directory, String action, String page) {
	this.directory = directory;
	this.action = action;
	this.page = page;
	this.setView();
    }

    // TODO Auto-generated constructor stub

    public void setView() {
	this.view = (directory.equals("/home")) ? "/WEB-INF/jsp/common/" + this.page + ".jsp"
		: "/WEB-INF/jsp" + this.directory + "/" + this.page + ".jsp";
	System.out.println("aaaaaaaaaaaa");
    }


}
