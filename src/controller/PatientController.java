package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */
@WebServlet({"/patient/loginForm.do","/patient/registerForm.do"})
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("=========서블릿 진입 성공========");
	    String action[] = getAction(request.getServletPath());
	    switch (action[1]) {
	    case "loginForm":
		request.getRequestDispatcher(action[0]+action[1]+action[2]).forward(request, response);
		System.out.println(action[0]+action[1]+action[2]);
		break;
	    case "registerForm":
		request.getRequestDispatcher(action[0]+action[1]+action[2]).forward(request, response);
		break;
	    default:
		break;
	    }
	}
	protected String[] getAction(String path) throws ServletException, IOException{
	    String[] action=new String[3];
	    
	    //split으로 patient, loginForm 을 분리시켜서 아래에 넣으세요
	    String[] exten=path.split("\\.");
	    String[] name=exten[0].split("/");
	    action[0]="/WEB-INF/jsp/"+name[1]+"/";
	    action[1]=name[2];
	    action[2]=".jsp";
	    return action;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
