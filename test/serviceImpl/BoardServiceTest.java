package serviceImpl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import domain.ArticleBean;

public class BoardServiceTest {
    BoardServiceImpl service = BoardServiceImpl.getInstance();
    @Test @Ignore
    public void testAddArticle() throws Exception{
	ArticleBean article = new ArticleBean();
	article.setId("park");
	article.setName("박승");
	article.setTitle("aa");
	article.setContent("aaa");
	article.setRegdate("2017-02-16");
	assertTrue(service.addArticle(article) > 0);
    }

    @Test @Ignore
    public void testFindOne() throws Exception {
	ArticleBean article = new ArticleBean();
	article.setSeq("45");
	assertTrue(service.findOne(article).getId().equals("hong"));
    }

    @Test @Ignore
    public void testFindSome() throws Exception {
	String[] str = new String[2];
	str[0] = "id";
	str[1] = "hong";
	List<ArticleBean> list = new ArrayList<ArticleBean>();
	list = service.findSome(str);
	assertTrue(list.get(0).getId().equals("hong"));
    }

    @Test @Ignore
    public void testList() throws Exception {
	List<ArticleBean> list = new ArrayList<ArticleBean>();
	list = service.list();
	assertTrue(list.size() >= 1);
    }

    @Test  @Ignore
    public void testUpdate() throws Exception {
	ArticleBean article = new ArticleBean();
	article.setId("kim");
	article.setTitle("aaa");
	article.setContent("aaa");
	assertTrue(service.update(article) > 0);
    }

    @Test
    public void testDelete() throws Exception {
	ArticleBean article = new ArticleBean();
	article.setId("kim");
	article.setSeq("46");
	assertTrue(service.delete(article) > 0);
    }

}
