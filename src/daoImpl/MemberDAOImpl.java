package daoImpl;

import java.sql.*;
import java.util.*;
import constants.Database;
import dao.PatientDAO;
import domain.*;
import enums.Vendor;
import factory.DatabaseFactory;

public class MemberDAOImpl implements PatientDAO {
     //intance하나 만들고 더이상 만들지 않는다.
    public static MemberDAOImpl getInstance() { //싱글턴 패턴
        return new MemberDAOImpl();
    }
    public MemberDAOImpl(){
	
    }
    @Override
    public int insert(PatientBean member) throws Exception{
	    return DatabaseFactory.createDatabase(
		    Vendor.ORACLE,Database.USERNAME,Database.PASSWORD)
		    .getConnection()
		    .createStatement()
		    .executeUpdate("");
    }

    @Override
    public PatientBean selectById(String id)  throws Exception{
	 PatientBean member = new PatientBean();
	 ResultSet set = DatabaseFactory.createDatabase(
		    Vendor.ORACLE,Database.USERNAME,Database.PASSWORD)
		 .getConnection()
		 .prepareStatement(id)
		 .executeQuery("");
		if(set.next()){
		
		}
	return member;
    }
    @Override
    public int update(PatientBean member) throws Exception{
	   return DatabaseFactory.createDatabase(
		    Vendor.ORACLE,Database.USERNAME,Database.PASSWORD)
		   .getConnection()
		   .createStatement()
		   .executeUpdate("");
    }

    @Override
    public int delete(PatientBean member)  throws Exception{
	return DatabaseFactory.createDatabase(
		    Vendor.ORACLE,Database.USERNAME,Database.PASSWORD)
		.getConnection()
		.createStatement()
		.executeUpdate("");
    }

}
