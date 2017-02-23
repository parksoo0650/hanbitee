package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DispatcherServlet;
import util.Separator;
@WebServlet("/doctor.do")
public class DoctorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("=======닥터 서블릿 진입 성공=======");
	    Separator.init(request, response);
	switch(Separator.command.getAction()){
	case "move" :
	    System.out.println("이동할 페이지===="+Separator.command.getView());
	    DispatcherServlet.send(request, response);
	    break;
	default:break;
	}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
