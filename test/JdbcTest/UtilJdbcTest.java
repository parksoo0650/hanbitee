package JdbcTest;

import static org.junit.Assert.*;

import org.junit.Test;

import util.JdbcTest;

public class UtilJdbcTest {

    @Test
    public void testGetName() {
	JdbcTest jtest = new JdbcTest();
	assertTrue(jtest.getName().equals("홍길동"));
    }

}
