package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.PatientBean;
import service.PatientService;
import serviceImpl.PatientServiceImpl;
import util.DispatcherServlet;
import util.Separator;

/**
 * Servlet implementation class MemberController
 */
@WebServlet({"/patient.do"})
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("=========서블릿 진입 성공========");
	    PatientService service = PatientServiceImpl.getInstance();
	    PatientBean bean= new PatientBean();
	    Separator.init(request, response);
	    switch (Separator.command.getAction()) {
	    case "move":
		DispatcherServlet.send(request, response);
		break;
	    case "login":
		String pw = request.getParameter("password");
		System.out.println("디비 가기전 비번="+pw);
		bean.setPatID(request.getParameter("id"));
		try {
		    PatientBean temp = service.login(bean);
		    System.out.println("=========bean 접근 성공==========");
		    if(!bean.getPatID().equals("FAIL") && temp.getPatPass().equals(pw)){
			System.out.println("디비 갔다온 후 비번="+pw);
			System.out.println("=========로그인 성공==========");
			System.out.println("이동할 페이지 이름"+Separator.command.getView());
			DispatcherServlet.send(request, response);
		    }else{
			System.out.println("=========로그인 실패==========");
			Separator.command.setPage("loginForm");
			Separator.command.setView();
			DispatcherServlet.send(request, response);
		
		    }
		} catch (Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		break;
	    default:
		break;
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
