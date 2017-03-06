package command;

import handler.CommandHandler;
import lombok.*;

@Data
public class Command{
    @Setter @Getter
    protected String directory,action,page,pageNo;
    @Getter
    protected String view;
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
 

    
}
