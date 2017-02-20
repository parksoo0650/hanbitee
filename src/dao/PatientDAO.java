package dao;

import java.sql.SQLException;

import domain.PatientBean;

public interface PatientDAO { //sql명을 그대로 써준다.
    public int insert(PatientBean member) throws Exception;
    public PatientBean selectById(String id) throws Exception;
    public int update(PatientBean member) throws Exception;
    public int delete(PatientBean member) throws Exception; // 비밀번호 노출,공개키
}
