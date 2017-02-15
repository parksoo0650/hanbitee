package service;

import domain.MemberBean;

public interface MemberService {
    public int join(MemberBean member)throws Exception;
    public MemberBean findById(String id)throws Exception;
    public boolean login(MemberBean member)throws Exception;
    public boolean logout(MemberBean member)throws Exception;
    public int change(MemberBean member)throws Exception;
    public int remove(MemberBean member)throws Exception; //비밀번호 노출,공개키
}
