package service;

import javax.servlet.http.HttpSession;

import domain.PatientBean;

public interface PatientService {
    public int join(PatientBean member)throws Exception;
    public PatientBean findById(String id)throws Exception;
    public PatientBean login(PatientBean member)throws Exception;
    public boolean logout(PatientBean member)throws Exception;
    public int change(PatientBean member)throws Exception;
    public int remove(PatientBean member)throws Exception; //비밀번호 노출,공개키
    public String getBirth();
    public PatientBean getSession();
    
}
