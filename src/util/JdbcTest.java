package util;
import java.sql.*;
import java.util.*;
import constants.Database;
public class JdbcTest {
    public static void main(String[] args) {
	try {
	    Class.forName(Database.ORACLE_DRIVER);
	    Connection connection = DriverManager.getConnection(
		   Database.ORACLE_URL,
		   Database.USERNAME,
		   Database.PASSWORD);
	    Statement stat = connection.createStatement();
	    String sql="SELECT * FROM Member WHERE id = 'hong'",result="";
	    ResultSet set = stat.executeQuery(sql); //공유가능
	    while(set.next()){
		result=set.getString("name");
	    }
	    System.out.println("회원이름 :" + result);
	} catch (Exception e) {
	    System.out.println("에러발생");
	    e.printStackTrace();
	}
	
    }
}
