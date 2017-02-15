package dao;

import java.sql.SQLException;

import domain.MemberBean;

public interface MemberDAO { //sql명을 그대로 써준다.
    public int insert(MemberBean member) throws Exception;
    public MemberBean selectById(String id) throws Exception;
    public int update(MemberBean member) throws Exception;
    public int delete(MemberBean member) throws Exception; // 비밀번호 노출,공개키
}
