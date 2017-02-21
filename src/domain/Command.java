package domain;

import handler.CommandHandler;
import lombok.*;

@Data
public class Command implements CommandHandler{
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
    @Override
    public String process() {
	return null;
    }
    public void setView(){
	this.view=(directory.equals("/home"))?"/WEB-INF/jsp/common/"+this.page+".jsp" :
		"/WEB-INF/jsp/"+this.directory+"/"+this.page+".jsp";
    }
 

    
}
