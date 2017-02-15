package serviceImpl;
import domain.MemberBean;
import service.MemberService;

import java.sql.Statement;

import dao.MemberDAO;
import daoImpl.MemberDAOImpl;
public class MemberServiceImpl implements MemberService{
    private MemberDAO dao;
    private static MemberServiceImpl instance = new MemberServiceImpl();
    private MemberBean session;
    public static MemberServiceImpl getInstance() {
        return instance;
    }
    private MemberServiceImpl() {
	dao = MemberDAOImpl.getInstance();
	session = new MemberBean();
    }
    @Override
    public MemberBean findById(String id) throws Exception{
	return dao.selectById(id); 
	//MemberDAOImpl.getInstance().selectById(id);
    }
    @Override
    public boolean login(MemberBean member) throws Exception{
	boolean flag = false;
	MemberBean temp = this.findById(member.getId());
	if(member.getPassword().equals(temp.getPassword())){
	    flag=true;
	    session=temp;
	}
	return flag;
	//MemberDAOImpl.getInstance().login(member);
    }

    @Override
    public int join(MemberBean member) throws Exception {
	return dao.insert(member); 
	//MemberDAOImpl.getInstance().insert(member);
    }
    @Override
    public int change(MemberBean member) throws Exception {
	return dao.update(member); 
	//MemberDAOImpl.getInstance().update(member);
    }

    @Override
    public int remove(MemberBean member) throws Exception {
	return dao.delete(member); 
	//MemberDAOImpl.getInstance().delete(member);
    }
    @Override
    public boolean logout(MemberBean member) throws Exception {
	session=null;
	return true;
    }
}
