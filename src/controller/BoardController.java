package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.ArticleBean;
import domain.PatientBean;
import service.BoardService;
import service.PatientService;
import serviceImpl.BoardServiceImpl;
import serviceImpl.PatientServiceImpl;
import util.DispatcherServlet;
import util.Separator;

/**
 * Servlet implementation class BoardController
 */
@WebServlet({"/board.do"})
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("============게시판 서블릿 진입 성공==========");
	    System.out.println("=========서블릿 진입 성공========");
	    BoardService service = BoardServiceImpl.getInstance();
	    List<ArticleBean> list = new ArrayList<>();
	    PatientBean temp = new PatientBean();
	    ArticleBean bean=new ArticleBean();
	    HttpSession session = request.getSession();
	    System.out.println("로그인된 아이디=="+session);
	    Separator.init(request, response);
	    switch(Separator.command.getAction()){
	    case "move":
		    session.getAttribute("user");
		    System.out.println("이동할 페이지==="+Separator.command.getView());
		    DispatcherServlet.send(request, response);
		break;
	    case "list" : 
		try {
		    
		    list=service.list();
		    int rowCount=5;
		   
		} catch (Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		request.setAttribute("count",list.size());
		request.setAttribute("list",list);
		DispatcherServlet.send(request, response);
		break;
	    case "detail" : 
		String seq = request.getParameter("seq");
		bean.setSeq(seq);
		try {
		    bean=service.findOne(bean);
		    request.setAttribute("board", bean);
		} catch (Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		DispatcherServlet.send(request, response);
		break;
	    default:break;
	}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}	
}
