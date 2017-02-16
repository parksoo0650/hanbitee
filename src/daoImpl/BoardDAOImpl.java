package daoImpl;

import java.sql.*;
import java.util.*;
import constants.Database;
import enums.Vendor;
import factory.DatabaseFactory;
import dao.BoardDAO;
import domain.ArticleBean;

public class BoardDAOImpl implements BoardDAO {
    public static BoardDAOImpl instance = new BoardDAOImpl(); 
    public static BoardDAOImpl getInstance() {
	return instance;
    }
    private BoardDAOImpl(){}
    @Override
    public int insert(ArticleBean param) throws Exception {
	return DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeUpdate(String.format("INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)"+
		"VALUES(art_seq.NEXTVAL, '%s', '%s', '%s', '%s', '%s','%d')",param.getId() ,  param.getName(),
		param.getTitle(), param.getContent(), param.getRegdate(), param.getReadCount()));
    }
    @Override
    public ArticleBean selectBySeq(ArticleBean param) throws Exception {
	ArticleBean article  = null;
	String sql = String.format("SELECT art_seq, id, title, content, regdate, readCount FROM Article "
	+" WHERE art_seq='%id'", param.getSeq());
	ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeQuery(sql);
	while(rs.next()){
	    article  = new ArticleBean();
	    article.setSeq(rs.getString("art_seq"));
	    article.setId(rs.getString("id"));
	    article.setTitle(rs.getString("title"));
	    article.setContent(rs.getString("content"));
	    article.setRegdate(rs.getString("regdate"));
	    article.setReadCount(rs.getString("readCount"));
	}
	return article;
    }

    @Override
    public List<ArticleBean> selectByWord(String[] param) throws Exception {
	List<ArticleBean> list = new ArrayList<ArticleBean>();
	ArticleBean article = null;
	String sql=String.format("SELECT art_seq, id, title, content, regdate, readCount FROM Article "
		+ "WHERE" + param[0] +" = like %" + param[1]+"%");
	ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeQuery(sql);
	while(rs.next()){
	    article = new ArticleBean();
	    article.setSeq(rs.getString("art_seq"));
	    article.setId(rs.getString("id"));
	    article.setTitle(rs.getString("title"));
	    article.setContent(rs.getString("content"));
	    article.setRegdate(rs.getString("regdate"));
	    article.setReadCount(rs.getString("readCount"));
	    list.add(article);
	}
	return list;
    }

    @Override
    public List<ArticleBean> selectAll() throws Exception {
	List<ArticleBean> list = new ArrayList<ArticleBean>();
	ArticleBean article = null;
	ResultSet rs =  DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection()
	.createStatement()
	.executeQuery("SELECT art_seq, id, title, content, regdate, readCount FROM Article");
	while(rs.next()){
	    article = new ArticleBean();
	    article.setSeq(rs.getString("art_seq"));
	    article.setId(rs.getString("id"));
	    article.setTitle(rs.getString("title"));
	    article.setContent(rs.getString("content"));
	    article.setRegdate(rs.getString("regdate"));
	    article.setReadCount(rs.getString("readCount"));
	    list.add(article);
	}
	return list;
    }
    @Override
    public int update(ArticleBean param) throws Exception {
	return DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD)
		.getConnection().createStatement().executeUpdate( String.format("UPDATE Article SET title = '%s',"
		+ "content = '%s' WHERE id='%s", param.getTitle(), param.getContent() ,param.getId()));
	 
	
    }

    @Override
    public int delete(ArticleBean param) throws Exception {
	return DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD)
		.getConnection()
		.createStatement()
		.executeUpdate(String.format("DELETE FROM Article WHERE hong = '%s' and art_seq='%s'",
		param.getId(), param.getSeq()));
    }

}
