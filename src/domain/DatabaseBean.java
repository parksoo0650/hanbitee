package domain;

import java.sql.Connection; //API
import java.sql.DriverManager;

import constants.Database;
public class DatabaseBean {
    private String driver, url, username, password;
    private Connection connection; //보안, 갖다 쓸수 만 있게 만든다.
    public DatabaseBean(String driver, String url, String username, String password) {
	this.driver=driver;
	this.url=url;
	this.username=username;
	this.password=password;
    }
    public Connection getConnection() {
        try {
	   Class.forName(driver);
	   connection = DriverManager.getConnection(url, username, password);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return connection;
    }
    
}
