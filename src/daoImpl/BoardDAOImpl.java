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
	return DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD)
		.getConnection()
		.createStatement().
		executeUpdate(String.format("%s",""));
    }
    @Override
    public ArticleBean selectBySeq(ArticleBean param) throws Exception {
	ArticleBean article  = null;
	String sql = String.format("SELECT art_seq, pat_id, title, content, regdate, readCount FROM Article"
	+" WHERE art_seq='%s'", param.getSeq());
	ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeQuery(sql);
	while(rs.next()){
	    article  = new ArticleBean();
	    article.setSeq(rs.getString("art_seq"));
	    article.setId(rs.getString("pat_id"));
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
	String sql="SELECT art_seq, id, title, content, regdate, readCount FROM Article WHERE " 
	+ param[0] + " LIKE '%"+param[1]+"%'";
	
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
    public List<ArticleBean> selectAll(int[] pageArr){
	String sql = String.format("SELECT t2.* "+
				"FROM (SELECT ROWNUM seq,t.* "+
				"FROM (SELECT * FROM ARTICLE ORDER BY art_seq DESC) t) t2 "+
				"WHERE t2.seq BETWEEN %s AND %s ",pageArr[0],pageArr[1]);
	List<ArticleBean> list = new ArrayList<ArticleBean>();
	ArticleBean article = null;
	ResultSet rs;
	try {
	    rs = DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection()
	    .createStatement()
	    .executeQuery(sql);
	    while(rs.next()){
		    article = new ArticleBean();
		    article.setSeq(rs.getString("art_seq"));
		    article.setId(rs.getString("pat_id"));
		    article.setTitle(rs.getString("title"));
		    article.setRegdate(rs.getString("regdate"));
		    article.setReadCount(rs.getString("readCount"));
		    list.add(article);
		}
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	System.out.println("sql 쿼리"+sql);
	
	return list;
    }
    @Override
    public int update(ArticleBean param) throws Exception {
	return  DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD)
		.getConnection()
		.createStatement()
		.executeUpdate(String.format("UPDATE Article SET title = '%s',"
			+ "content = '%s' WHERE id='%s'"
			, param.getTitle()
			, param.getContent() 
			,param.getId()));
    }
    @Override
    public int delete(ArticleBean param) throws Exception {
	return DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD)
		.getConnection()
		.createStatement()
		.executeUpdate(String.format("DELETE FROM Article WHERE id = '%s' and art_seq='%s'",
			param.getId(), param.getSeq()));
    }
    @Override
    public int count(){
	int count=0;
	String sql = "SELECT COUNT(*) COUNT FROM Article";
	Statement stmt;
	try {
	    stmt = DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()){
		count=Integer.parseInt(rs.getString("count"));
		}
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return count;
	}
    
}
