package daoImpl;

import java.sql.*;
import java.util.*;
import constants.Database;
import dao.PatientDAO;
import domain.*;
import enums.Vendor;
import factory.DatabaseFactory;

public class PatientDAOImpl implements PatientDAO {
     //intance하나 만들고 더이상 만들지 않는다.
    final String prop="pat_id,pat_pass,pat_name,pat_gen," 
	    +"pat_jumin,pat_phone,pat_email,pat_addr,pat_job";
  
 
    public static PatientDAOImpl getInstance() { //싱글턴 패턴
        return new PatientDAOImpl();
    }
    public PatientDAOImpl(){
	
    }
    @Override
    public int insert(PatientBean member) throws Exception{
	String sql = String.format("INSERT INTO Patient" +"("+prop+") VALUES"
		+"(%s,%s)", "");
	    return DatabaseFactory.createDatabase(
		    Vendor.ORACLE,Database.USERNAME,Database.PASSWORD)
		    .getConnection()
		    .createStatement()
		    .executeUpdate("");
    }

    @Override
    public PatientBean selectById(String id)  throws Exception{
	String sql="SELECT pat_id,doc_id,nur_id,pat_pass,pat_name,pat_gen," 
	    +"pat_jumin,pat_phone,pat_email,pat_addr,pat_job FROM Patient where pat_id='"+id+"'";
	 PatientBean member = new PatientBean();
	 ResultSet set = DatabaseFactory.createDatabase(
		    Vendor.ORACLE,Database.USERNAME,Database.PASSWORD)
		 .getConnection()
		 .createStatement()
		 .executeQuery(sql);
	 	System.out.println("쿼리="+sql);
		if(set.next()){
		   member.setPatID(set.getString("pat_id"));
		   member.setDocID(set.getString("doc_id"));
		   member.setNurID(set.getString("nur_id"));
		   member.setPatPass(set.getString("pat_pass"));
		   member.setPatName(set.getString("pat_name"));
		   member.setPatGen(set.getString("pat_gen"));
		   member.setPatJumin(set.getString("pat_jumin"));
		   member.setPatPhone(set.getString("pat_phone"));
		   member.setPatEmail(set.getString("pat_email"));
		   member.setPatAddr(set.getString("pat_addr"));
		   member.setPatJob(set.getString("pat_job"));
		}else{
		    member.setPatID("FAIL");
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
