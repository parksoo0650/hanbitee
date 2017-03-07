package factory;

import command.ListCommand;
import command.MoveCommand;
import command.Command;

public class CommandFactory {
    public static Command createCommand(String directory, String action, String page){
	Command cmd=null;
	switch(action){
	case "move" : case "login" : case "logout": case "mypage" : case " register":
	case "detail" :
	    cmd=new MoveCommand(directory, action, page);
	    break;
	    default:
		break;
	}
	return cmd;
    }
    public static Command createCommand(String directory, String action, String page, String pageNo) {
	Command cmd=null;
	switch (action) {
	case "list":
	    cmd=new ListCommand(directory, action, page, pageNo);
	    break;
	default:
	    break;
	}
	return cmd;
    }
}
