package util;

import java.util.List;

import javax.swing.JOptionPane;

import dao.MemberDAO;
import daoImpl.MemberDAOImpl;
import domain.MemberBean;
import enums.Butt;
import service.MemberService;
import serviceImpl.MemberServiceImpl;
public class DAOTest {
    public static void main(String[] args) {
	MemberDAO dao = new MemberDAOImpl();
	MemberBean member  = new MemberBean();
	MemberService service = MemberServiceImpl.getInstance();
	
		member = new MemberBean();
		String[] strArr = JOptionPane.showInputDialog("아이디,비밀번호").split(",");
		member.setId(strArr[0]);
		member.setPassword(strArr[1]);
		boolean check=false;
		
		String result="";
		try {
		    check = service.login(member);
		    if(check){
			result="로그인 되었습니다.";
			while(true){
			Butt[] buttons={Butt.CLOSE,Butt.MEM_ADD,Butt.FIND_BY_ID,Butt.LIST,Butt.RANK,Butt.DELETE};
			Butt select = (Butt)JOptionPane.showInputDialog(
			null,
			"MEMBER PAGE",
			"SELECT MEMBER MENU",
			JOptionPane.QUESTION_MESSAGE,
			null,
			buttons,
			buttons[1]
			);
			  switch (select) { //select
			    case CLOSE: //Butt에서 정의한 상수, static 점유하지 않음
				return;
			    case MEM_ADD:
				
				//현재 인원수는 3명입니다.
				break;
			    case FIND_BY_ID:
				try {
				    member = MemberDAOImpl.getInstance().selectById("kim");
				} catch (Exception e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
				System.out.printf("회원이름 : %s",member.getName());
				break;
			    case LIST:
				break;
			    case RANK:
				member = new MemberBean();
				String temp2=JOptionPane.showInputDialog("수정", member.toString());
				String[] tempArr = temp2.split(",");
				member.setId(tempArr[0]);
				member.setRank(tempArr[1]);
				break;
			    case DELETE:
				JOptionPane.showInputDialog("삭제할 아이디를 입력하세요");
				JOptionPane.showMessageDialog(null, "아이디가 삭제 되었습니다.");
				break;			
			    }
			}
		    }else{
			result="로그인 실패햐였습니다.";
		    }
		    	  
		    
		} catch (Exception e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
		
    }
   }
