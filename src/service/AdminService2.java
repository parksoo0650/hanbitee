package service;

import domain.AdminBean;

public interface AdminService2 {
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
    public AdminBean[] findByName(String name);//똑같은 이름이 있을 때
    public int countByName(String name);
    public AdminBean[] list();
    public int count();
    //update
    public void changeRank(AdminBean member);
    //delete
    public void remove(String id); //비밀번호 노출,공개키
    //util
    //validation
    public boolean exist(String keyword);
}
