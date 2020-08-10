package Db;

import java.util.*;

public class DBMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int selectNum = 0;
		
		CustomerDTO customerDTO = null;
		DBService dbService = new DBService();
		
		TestDAO tDAO = new TestDAO();
	
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("0.DB ����|1.��ü��ȸ2|.�����ͻ���|3.");
			System.out.println("----------------------------------------------");
			selectNum = sc.nextInt();
			switch(selectNum) {
			case 0 : 
				tDAO.dbConnection();
				break;
			case 1 :
				 tDAO.selectAll();
				 break;
			case 2 :
				 System.out.print("�̸� : ");
				 String name = sc.next();
				 System.out.print("�ּ� : ");
				 String address = sc.next();
				 System.out.print("��ȭ��ȣ : ");
				 String phone = sc.next();
				 customerDTO = new CustomerDTO();
				 customerDTO.setName(name);
				 customerDTO.setAddress(address);
				 customerDTO.setPhone(phone);
				 //��ĵ���� �Է¹������� DB���־�����
				 tDAO.insertCustomer(customerDTO);
				 
			}
		}
		
	}

}
