package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.PatientBean;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;
import util.DispatcherServlet;
import util.Separator;

/**
 * Servlet implementation class FormController
 */
@WebServlet("/home.do")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("=======홈 서블릿 진입 성공=======");
	    Separator.init(request, response);
	    HttpSession session = request.getSession();
	    PatientBean bean = new PatientBean();
	    switch(Separator.command.getAction()){
	    case "move":
		session.setAttribute("user",bean);
		DispatcherServlet.send(request, response);
		break;
	    case "logout":
		session.invalidate();
		DispatcherServlet.send(request, response);
		break;
	    default:break;
	    }
	    
	    
	}
}
