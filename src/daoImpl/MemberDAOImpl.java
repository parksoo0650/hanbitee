package daoImpl;

import java.sql.*;
import java.util.*;
import constants.Database;
import dao.MemberDAO;
import domain.*;
import enums.Vendor;
import factory.DatabaseFactory;

public class MemberDAOImpl implements MemberDAO {
     //intance하나 만들고 더이상 만들지 않는다.
    public static MemberDAOImpl getInstance() { //싱글턴 패턴
        return new MemberDAOImpl();
    }
    public MemberDAOImpl(){
	
    }
    @Override
    public int insert(MemberBean member) throws Exception{
	    return DatabaseFactory.createDatabase(
		    Vendor.ORACLE,Database.USERNAME,Database.PASSWORD).getConnection().createStatement().executeUpdate(String.format("INSERT INTO Member (id,name,ssn, password, profileImg, phone, email,rank) "
		    + "VALUES('%s','%s','%s','%s','%s','%s','%s','%s')",member.getId(), member.getName(), member.getPassword(),
		    member.getProfileImg(), member.getPhone(), member.getEmail(), member.getRank()));
    }

    @Override
    public MemberBean selectById(String id)  throws Exception{
	 MemberBean member = new MemberBean();
	 ResultSet set = DatabaseFactory.createDatabase(
		    Vendor.ORACLE,Database.USERNAME,Database.PASSWORD).getConnection().prepareStatement(id).executeQuery(
			    String.format("SELECT * FROM Member WHERE id='%s'", id));
		if(set.next()){
		    member.setId(set.getString("id"));
		    member.setName(set.getString("name"));
		    member.setSsn(set.getString("ssn"));
		    member.setPassword(set.getString("password"));
		    member.setProfileImg(set.getString("profileimg"));
		    member.setPhone(set.getString("phone"));
		    member.setEmail(set.getString("email"));
		    member.setRank(set.getString("rank"));
		}
	return member;
    }
    @Override
    public int update(MemberBean member) throws Exception{
	   return DatabaseFactory.createDatabase(
		    Vendor.ORACLE,Database.USERNAME,Database.PASSWORD).getConnection().createStatement().executeUpdate(String.format("UPDATE Member SET"
	    				+ "password = '%s'"
	    				+",profileimg = '%s'"
	    				+",phone = '%s'"
	    				+",email = '%s'"
	    				+"WHERE id = '%s'",
	    				member.getPassword(), member.getProfileImg(),
	    				member.getPhone(), member.getEmail(),
	    				member.getId()));
    }

    @Override
    public int delete(MemberBean member)  throws Exception{
	String sql = String.format("DELETE FROM Member where id='%s'", member.getId());
	return DatabaseFactory.createDatabase(
		    Vendor.ORACLE,Database.USERNAME,Database.PASSWORD).getConnection().createStatement().executeUpdate(sql);
    }

}
