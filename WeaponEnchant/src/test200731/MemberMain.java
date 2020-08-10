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
			System.out.println("0.DB ����|1.��ü��ȸ|2.ȸ�����|3.ȸ����������(�ּҸ�)|4.����");
			System.out.println("----------------------------");
			System.out.println("����>> ");
			selectNum = sc.nextInt();
			switch(selectNum) {
			case 0:
				memberDAO.dbConnection();
				break;
			case 1:{
				memberDAO.selectAll();
				break;}
			case 2:{
				System.out.print("�̸�: ");
				String mname = sc.next();
				System.out.print("�ּ�: ");
				String maddress = sc.next();
				System.out.print("��ȭ��ȣ: ");
				String mphone = sc.next();
				System.out.print("�������(yyyymmdd): ");
				String mbirth = sc.next();
				member = new MemberDTO();
				member.setMname(mname);
				member.setMaddress(maddress);
				member.setMphone(mphone);
				member.setMbirth(mbirth);
				// ���Ͼ��� ȣ��
//				memberDAO.joinMember(member);
				// boolean ������ �ִ� ȣ��
				boolean result = memberDAO.joinMember(member);
				if(result) {
					System.out.println("ȸ����� ����");
				} else {
					System.out.println("ȸ����� ����");
				}
				break;}
			case 3:{
				
				System.out.println("������ ȸ���� ��ȣ : ");
				int mnumber = sc.nextInt();
				System.out.println("������ �ּ� : ");
				String maddress = sc.next();		
				member = new MemberDTO();
				member.setMaddress(maddress);
				member.setMnumber(mnumber);
				boolean result = memberDAO.UpdateMember(member);
				if(result) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				break;
			}
			case 4:{
				
				System.out.println("������ ȸ���� ��ȣ : ");
				int mnumber = sc.nextInt();
				member = new MemberDTO();
				member.setMnumber(mnumber);
				boolean result = memberDAO.DeleteMember(member);
				if(result) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				break;
			
		}

			}
			}
		}

}


