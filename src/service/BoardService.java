package service;

import java.util.*;

import domain.ArticleBean;

public interface BoardService{
    public int addArticle(ArticleBean param) throws Exception;
    public ArticleBean findOne(ArticleBean param) throws Exception;
    public List<ArticleBean> findSome(String[] param) throws Exception;
    public List<ArticleBean> list() throws Exception;
    public int update(ArticleBean param) throws Exception; 
    public int delete(ArticleBean param) throws Exception;
    public int count() throws Exception;
}
