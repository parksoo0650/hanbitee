package serviceImpl;


import java.util.*;

import domain.MemberBean;
import service.AdminService;

public class AdminServiceImpl implements AdminService {
    private Map<String, MemberBean> map; 
    public AdminServiceImpl() {
	map = new HashMap<String, MemberBean>();
    }
    @Override
    public void regist(MemberBean member) {
	map.put(member.getId(), member);
    }
    @Override
    public MemberBean findById(String id) {
	return map.get(id);
    }
    @Override
    public List<MemberBean> findByName(String name) {
	List<MemberBean> list = new ArrayList<MemberBean>();
	for(MemberBean m:memberlist()){
	    if(name.equals(m.getName())){
		list.add(m);
	    }
	}
	return list;
    }
    @Override
    public List<MemberBean> memberlist() {
	List<MemberBean> list = new ArrayList<MemberBean>();
	for(Map.Entry<String, MemberBean> e:map.entrySet()){
	    list.add(e.getValue());
	    
	}
	return list;    
    }
    @Override
    public int count() {
	return map.size();
    }
    @Override
    public void update(MemberBean member) {
	for(MemberBean m : memberlist()){
	    if(member.getId().equals(m.getId())){
		m.setPassword(member.getPassword());
		break;
	    }
	}
    }
    @Override
    public void remove(String id) {
	map.remove(findById(id));
    }
    @Override
    public Map<String, MemberBean> mapfindByName(String name) {
	Map<String,MemberBean> temp = new HashMap<String,MemberBean>();
	for(Map.Entry<String, MemberBean> e : map.entrySet()){
	    if(name.equals(e.getValue().getName())){
		temp.put(e.getKey(), e.getValue());
	    }
	}
	return temp;
    }
    @Override
    public List<String> keylist() {
	List<String> list = new ArrayList<String>();
	for(Map.Entry<String, MemberBean> e:map.entrySet()){
	    list.add(e.getKey());
	}
	return list;  
    }
}
