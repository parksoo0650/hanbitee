package serviceImpl;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import domain.ArticleBean;

public class BoardServiceTest {
    BoardServiceImpl service = BoardServiceImpl.getInstance();
    @Test @Ignore
    public void testAddArticle() {
	fail("Not yet implemented");
    }

    @Test @Ignore
    public void testFindOne() throws Exception {
	ArticleBean article = new ArticleBean();
	article.setSeq("45");
	assertTrue(service.findOne(article).getId().equals("hong"));
    }

    @Test @Ignore
    public void testFindSome() {
	fail("Not yet implemented");
    }

    @Test @Ignore
    public void testList() {
	fail("Not yet implemented");
    }

    @Test @Ignore
    public void testUpdate() {
	fail("Not yet implemented");
    }

    @Test @Ignore
    public void testDelete() {
	fail("Not yet implemented");
    }

}
