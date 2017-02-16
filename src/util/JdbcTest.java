package util;
import java.sql.*;
import java.util.*;
import constants.Database;
public class JdbcTest {
    public String getName(){
	String result="0";
	try {
	    Class.forName(Database.ORACLE_DRIVER);
	    Connection connection = DriverManager.getConnection(
		   Database.ORACLE_URL,
		   Database.USERNAME,
		   Database.PASSWORD);
	    Statement stat = connection.createStatement();
	    String sql="SELECT * FROM Member WHERE id = 'hong'";
	    ResultSet rs = stat.executeQuery(sql); //공유가능
	    while(rs.next()){
		result=rs.getString("name");
	    }
	    System.out.println("회원이름 :" + result);
	} catch (Exception e) {
	    System.out.println("에러발생");
	    e.printStackTrace();
	}
	return result;
    }
    
}
