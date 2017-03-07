package command;

import lombok.*;

@Data
public class Command{
    @Setter @Getter
    protected String directory,action,page,pageNo;
    @Getter
    protected String view;
    public void setView(){
	this.view=(directory.equals("/home"))?"/WEB-INF/jsp/common/"+this.page+".jsp" :
		"/WEB-INF/jsp"+this.directory+"/"+this.page+".jsp";
    	System.out.println("aaaaaaaaaaaa");
    }
 

    
}
