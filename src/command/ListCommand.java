package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import handler.CommandHandler;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class ListCommand extends Command implements CommandHandler{
   
    public ListCommand(String directory, String action, String page,String pageNo) {
	super.directory=directory;
	super.action=action;
	super.page=page;
	super.pageNo=pageNo;
	super.setView();
    }

    @Override
    public String process() {
	// TODO Auto-generated method stub
	return null;
    }
  
  
}
