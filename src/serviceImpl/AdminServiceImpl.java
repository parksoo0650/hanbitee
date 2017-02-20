package serviceImpl;


import java.util.*;

import domain.AdminBean;
import service.AdminService;

public class AdminServiceImpl implements AdminService {
    private Map<String, AdminBean> map; 
    public AdminServiceImpl() {
	map = new HashMap<String, AdminBean>();
    }
    @Override
    public void regist(AdminBean admin) {
	map.put(admin.getAdmID(), admin);
    }
    @Override
    public AdminBean findById(String id) {
	return map.get(id);
    }
    @Override
    public List<AdminBean> findByName(String name) {
	List<AdminBean> list = new ArrayList<AdminBean>();
	for(AdminBean m:adminlist()){
	    if(name.equals(m.getAdmName())){
		list.add(m);
	    }
	}
	return list;
    }
    @Override
    public List<AdminBean> adminlist() {
	List<AdminBean> list = new ArrayList<AdminBean>();
	for(Map.Entry<String, AdminBean> e:map.entrySet()){
	    list.add(e.getValue());
	    
	}
	return list;    
    }
    @Override
    public int count() {
	return map.size();
    }
    @Override
    public void update(AdminBean admin) {
	for(AdminBean m : adminlist()){
	    if(admin.getAdmID().equals(m.getAdmID())){
		m.setAdmPass(admin.getAdmPass());
		break;
	    }
	}
    }
    @Override
    public void remove(String id) {
	map.remove(findById(id));
    }
    @Override
    public Map<String, AdminBean> mapfindByName(String name) {
	Map<String,AdminBean> temp = new HashMap<String,AdminBean>();
	for(Map.Entry<String, AdminBean> e : map.entrySet()){
	    if(name.equals(e.getValue().getAdmName())){
		temp.put(e.getKey(), e.getValue());
	    }
	}
	return temp;
    }
    @Override
    public List<String> keylist() {
	List<String> list = new ArrayList<String>();
	for(Map.Entry<String, AdminBean> e:map.entrySet()){
	    list.add(e.getKey());
	}
	return list;  
    }
  
}
