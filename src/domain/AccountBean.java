package domain;

import java.io.Serializable;
import java.util.Calendar;
import util.RandomGenerator;

public class AccountBean implements Serializable{
    private static final long serialVersionUID = 1L; //ObjectStream을 던질려고, 
    protected String uid,accountType,createDate,money, accountNo;

    public void setMoney(String money){
	this.money=money;
    }
    public String getMoney(){
	return money;
    }
    public void setUid(String uid){
	this.uid=uid;
    }
    public String getUid(){
	return uid;
    }
    public void setAccountType(String accountType){
	this.accountType=accountType;
    }
    public String getAccountType(){
  	return accountType;
    }
    public void setAccountNo(String accountNo){
	this.accountNo=accountNo;
    }
    public String getAccountNo(){
	return accountNo;
    }
    public void setCreateDate(String createDate){
	this.createDate=createDate;
    }
    public String getCreateDate(){
 	return createDate;
    }
    @Override
    public String toString() {
        return String.format("%s [%s] %s %s ￦%s",
        	accountNo,
        	accountType,
        	uid,createDate,money
        	);
    }
}
