package view;

import javax.swing.JOptionPane;
import controller.*;
import enums.Butt;

public class index {
    public static void main(String[] args) {
	Butt[] buttons = {Butt.CLOSE, Butt.MEMBER, Butt.ADMIN};
	Butt select = (Butt)JOptionPane.showInputDialog(
		null, 
		"ADMIN PAGE", 
		"SELECT ADMIN MENU",
		JOptionPane.QUESTION_MESSAGE, 
		null, 
		buttons, 
		buttons[1]		
		);
	    switch(select){
	    case CLOSE : return;
	    case MEMBER : new CustomerController().start(); break;
	    case ADMIN : new AdminController().start(); break;
	    }
	    
	
  	
      }  
    
    
}
