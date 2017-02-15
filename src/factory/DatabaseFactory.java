package factory;

import constants.Database;
import domain.DatabaseBean;
import enums.Vendor;

public class DatabaseFactory { //static으로 만든다.
    public static DatabaseBean createDatabase(
	    Vendor vendor,String username,String password){
	String driver="",url="";
	switch(vendor){
	case DB2 : 
	    driver=Database.DB2_DRIVER;
	    url=Database.DB2_URL;
	    break;
	case ORACLE :
	    driver=Database.ORACLE_DRIVER;
	    url=Database.ORACLE_URL;
	    break;
	case MSSQL : break;
	case MYSQL : 
	    driver=Database.MYSQL_DRIVER;
	    url=Database.MYSQL_URL;
	    break;
	case MARIADB : break;
	default: break;
	}
	return new DatabaseBean(driver, url, username, password);
    }
}
