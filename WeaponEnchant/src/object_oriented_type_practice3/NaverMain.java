package object_oriented_type_practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NaverMain {


	public static void main(String[] args) {
		List<NaverDTO> dtolist = new ArrayList<NaverDTO>();
		NaverDTO dto = new NaverDTO(); 	
		NaverService ser = new NaverService();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
//		NaverDTO dot= new NaverDTO();
//		dto.setName("ȸ��1");//�Ű������� 
		//�����ʵ忡 ȸ��1 �̶�� �����ְ������
		//set method �̿��Ͽ� name �ʵ� �� ������
		//get method �̿��Ͽ� name �ʵ� �� ���
//		System.out.println(stu1.getName());
		
		while(run) {			
		    System.out.println("--------------------------------------------------------------------------------");
	        System.out.println("| 1. �űԵ�� | 2. ����Ȯ�� | 3.���̵������ | 4. | 5.���� |");
	        System.out.println("--------------------------------------------------------------------------------");
	        System.out.print("���� > ");
	        dto.setSelectNo(sc.nextInt());
	        switch(dto.getSelectNo()) {
	        case 1:{
	        	ser.scanUser(dto, sc);
	        	break;
	        }
	        case 2:{
	        	ser.printAll(dto);
	        	break;
	        }
	        case 3:{
	        	ser.printID(dto);
	        	break;
	        }
	        case 4:{	
	        	break;
	        }
	        case 5 :{
	        	System.out.println("�����մϴ�.");
	        	run =false;
	        	break;
        }
       	}
       }
	}

	
}

