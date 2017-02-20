package service;

import java.util.*;
import domain.AdminBean;

public interface AdminService {
    //CRUD,bussines Logic
    //녹색 주석 컴파일되면 없어짐, 장기적으로 
    /**
     * CREATE : INSERT
     */
    /**
     * READ : SELECT
     */
    /**
     * UPDATE : UPDATE
     */
    /**
     * DELETE : DELETE
     */
    //create
    public void regist(AdminBean member);
    //read
    public AdminBean findById(String id);
    public List<AdminBean> findByName(String name);//똑같은 이름이 있을 때
    public Map<String,AdminBean> mapfindByName(String name);
    public List<AdminBean> adminlist(); //찾은 결과는 Map형식으로 담지 않음
    public List<String> keylist(); 
    public int count();
    //update
    public void update(AdminBean member);
    //delete
    public void remove(String id); //비밀번호 노출,공개키
    //util
    //validation
}
