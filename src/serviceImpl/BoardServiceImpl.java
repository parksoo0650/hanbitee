package serviceImpl;

import java.util.*;

import dao.BoardDAO;
import daoImpl.BoardDAOImpl;
import domain.ArticleBean;
import service.BoardService;

public class BoardServiceImpl implements BoardService{
    static BoardServiceImpl instance = new BoardServiceImpl();
    public static BoardServiceImpl getInstance(){
	return instance;
    }
    private BoardDAO dao;
    private BoardServiceImpl() {
	dao = BoardDAOImpl.getInstance();
    }
    @Override
    public int addArticle(ArticleBean param) throws Exception {
	return dao.insert(param);
	
    }
    @Override
    public ArticleBean findOne(ArticleBean param) throws Exception {
	return dao.selectBySeq(param);
    }

    @Override
    public List<ArticleBean> findSome(String[] param) throws Exception {
	return dao.selectByWord(param);
    }
    @Override
    public List<ArticleBean> list() throws Exception {
	return dao.selectAll();
    }
    @Override
    public int update(ArticleBean param) throws Exception {
	return dao.update(param);
    }
    @Override
    public int delete(ArticleBean param) throws Exception{
	return dao.delete(param);
    }

}
