package test200731;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int selectNum = 0;
		
		MemberDTO member = null;
		
		MemberDAO memberDAO = new MemberDAO();
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("0.DB 접속|1.전체조회|2.회원등록|3.회원정보수정(주소만)|4.삭제");
			System.out.println("----------------------------");
			System.out.println("선택>> ");
			selectNum = sc.nextInt();
			switch(selectNum) {
			case 0:
				memberDAO.dbConnection();
				break;
			case 1:{
				memberDAO.selectAll();
				break;}
			case 2:{
				System.out.print("이름: ");
				String mname = sc.next();
				System.out.print("주소: ");
				String maddress = sc.next();
				System.out.print("전화번호: ");
				String mphone = sc.next();
				System.out.print("생년월일(yyyymmdd): ");
				String mbirth = sc.next();
				member = new MemberDTO();
				member.setMname(mname);
				member.setMaddress(maddress);
				member.setMphone(mphone);
				member.setMbirth(mbirth);
				// 리턴없이 호출
//				memberDAO.joinMember(member);
				// boolean 리턴이 있는 호출
				boolean result = memberDAO.joinMember(member);
				if(result) {
					System.out.println("회원등록 성공");
				} else {
					System.out.println("회원등록 실패");
				}
				break;}
			case 3:{
				
				System.out.println("수정할 회원의 번호 : ");
				int mnumber = sc.nextInt();
				System.out.println("수정할 주소 : ");
				String maddress = sc.next();		
				member = new MemberDTO();
				member.setMaddress(maddress);
				member.setMnumber(mnumber);
				boolean result = memberDAO.UpdateMember(member);
				if(result) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
				break;
			}
			case 4:{
				
				System.out.println("삭제할 회원의 번호 : ");
				int mnumber = sc.nextInt();
				member = new MemberDTO();
				member.setMnumber(mnumber);
				boolean result = memberDAO.DeleteMember(member);
				if(result) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			
		}

			}
			}
		}

}


