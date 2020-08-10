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
			System.out.println("0.DB 접속|1.전체조회2|.데이터삽입|3.");
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
				 System.out.print("이름 : ");
				 String name = sc.next();
				 System.out.print("주소 : ");
				 String address = sc.next();
				 System.out.print("전화번호 : ");
				 String phone = sc.next();
				 customerDTO = new CustomerDTO();
				 customerDTO.setName(name);
				 customerDTO.setAddress(address);
				 customerDTO.setPhone(phone);
				 //스캔에서 입력받은값을 DB에넣어주자
				 tDAO.insertCustomer(customerDTO);
				 
			}
		}
		
	}

}
