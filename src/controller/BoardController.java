package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.ArticleBean;
import domain.PatientBean;
import handler.PageHandler;
import service.BoardService;
import service.PatientService;
import serviceImpl.BoardServiceImpl;
import serviceImpl.PatientServiceImpl;
import util.DispatcherServlet;
import util.Pagination;
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
	    Pagination pg = new Pagination();
	    Map<String, String>params=new HashMap<>();
	    PageHandler handler=new PageHandler();
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
		params.put("pageNo", request.getParameter("pageNo"));
		System.out.println("handler에 들어가기전 count : " + service.count());
		params.put("count", String.valueOf(service.count()));
		handler.process(params);
		int[] pageArr={handler.getAttribute()[3],handler.getAttribute()[4]};
		list=service.list(pageArr);
		String[] arr={"count","pageCount","pageNo","pageStart","pageEnd",
				"blockStart","blockEnd","prevBlock","nextBlock"};
		for(int i=0; i<arr.length; i++){
		    request.setAttribute(arr[i], handler.getAttribute()[i]);
		
		}
		request.setAttribute("list", list);
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
