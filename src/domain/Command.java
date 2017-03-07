package domain;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import handler.Commandable;
import lombok.*;

@Data
public class Command implements Commandable{
    @Setter @Getter
    private String directory,action,page;
    @Getter
    private String view;
    public Command(String directory, String action, String page) {
	this.directory=directory;
	this.action=action;
	this.page=page;
	this.setView();
    }
    public void setView(){
	this.view=(directory.equals("/home"))?"/WEB-INF/jsp/common/"+this.page+".jsp" :
		"/WEB-INF/jsp"+this.directory+"/"+this.page+".jsp";
    	System.out.println("aaaaaaaaaaaa");
    }
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	// TODO Auto-generated method stub
	
    }
 

    
}
