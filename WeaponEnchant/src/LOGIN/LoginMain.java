package LOGIN;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int selectNum = 0;
		
		LoginDTO login = null;
		
		LoginDAO LoginDAO = new LoginDAO();
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("0.DB ����|1.ȸ������|2.�α���|3.ȸ��õü����|4.���̵��ߺ�üũ");
			System.out.println("----------------------------");
			System.out.println("����>> ");
			selectNum = sc.nextInt();
			switch(selectNum) {
			case 0:
				 LoginDAO.dbConnection();
				break;
			case 1:{
				System.out.print("ID: ");
				String ID = sc.next();
				System.out.print("PassWord: ");
				String PassWord = sc.next();
				System.out.print("Name: ");
				String Name = sc.next();
				System.out.print("Phone : ");
				String Phone = sc.next();
				System.out.print("Age : ");
				String Age = sc.next();
				login = new LoginDTO();
				login.setId(ID);
				login.setPass(PassWord);
				login.setName(Name);
				login.setPhone(Phone);
				login.setAge(Age);
				boolean result = LoginDAO.joinLogin(login);
				if(result) {
					System.out.println("ȸ����� ����");
				} else {
					System.out.println("ȸ����� ����");
				}
				break;}
			case 2:{
				System.out.print("���̵��Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pass = sc.next();
				login = new LoginDTO();
				login.setId(id);
				login.setPass(pass);
				boolean result = LoginDAO.Login(login); // �α��� �޼ҵ� ���� �� result�� ����
				if(result) {
					System.out.println("�α��� ����");
				} else {
					System.out.println("�α��� ����");
				}
				break;}
			case 3:{
				LoginDAO.selectAll();
				break;}
			case 4:{
				System.out.print("���̵��Է� : ");
				String id = sc.next();
				boolean result = LoginDAO.LogCheck(id); // üũ �޼ҵ� ���� �� result�� ���Ϲ���
				if(result) {
					System.out.println("������� ID�Դϴ�.");
				} else {
					System.out.println("����ϽǼ��ִ� ID�Դϴ�.");
				}
			}
			}
			}
		}
}


