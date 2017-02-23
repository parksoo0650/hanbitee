package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.PatientBean;
import jdk.nashorn.internal.ir.RuntimeNode.Request;
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
	    HttpSession session=request.getSession();
	    
	    PatientService service = PatientServiceImpl.getInstance();
	    PatientBean bean= new PatientBean();
	    Separator.init(request, response);
	    switch (Separator.command.getAction()) {
	    case "move":
		DispatcherServlet.send(request, response);
		break;
	    case "mypage":
		System.out.println("bbbbbbbbb");
		String birth=service.getBirth();
		System.out.println("생년월일:"+birth);
		request.setAttribute("birth", birth);
		DispatcherServlet.send(request, response);
		break;
	    case "login":
		String pw = request.getParameter("password");
		String id =request.getParameter("id");
		System.out.println("디비 가기전 비번="+pw);
		 bean.setPatID(id);
		  System.out.println("아이디===="+id);
		try {
		    PatientBean temp = service.login(bean);
		    System.out.println("===================디비 가따온 temp값"+service.login(bean).getPatID());
		    System.out.println("=========bean 접근 성공=========="+temp.getPatID());
		    System.out.println("=========bean 접근 성공=========="+bean.getPatID());
		    bean = service.login(bean);
		    if(!bean.getPatID().equals("FAIL") && temp.getPatPass().equals(pw)){
			System.out.println("=========로그인 성공==========");
			session.setAttribute("user", temp);
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
	    case "logout":
		session.invalidate();
		Separator.command.setDirectory("common");
		Separator.command.setPage("main");
		DispatcherServlet.send(request, response);
		break;
	    default:
		break;
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
