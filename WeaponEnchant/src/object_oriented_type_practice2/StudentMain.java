package object_oriented_type_practice2;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String name = "";
		String address = "";
		String phone = "";
		
		StudentDTO stu = null; 
		StudentDTO stu1 = null;
		
		Application app = new Application();
		
//		StudentDTO stu1= new StudentDTO();
//		stu1.setName("ȸ��1");//�Ű������� 
		//�����ʵ忡 ȸ��1 �̶�� �����ְ������
		//set method �̿��Ͽ� name �ʵ� �� ������
		//get method �̿��Ͽ� name �ʵ� �� ���
//		System.out.println(stu1.getName());
		
		while(run) {			
		    System.out.println("---------------------------------------------------------------------------------------------------------");
	        System.out.println("| 1. �űԵ�� | 2. �⼮üũ | 3.������Ȯ�� | 4.�������� | 5.���� |6. DTOClass �̿��� ��ü|");
	        System.out.println("---------------------------------------------------------------------------------------------------------");
	        System.out.print("���� : ");
	        int selectNo =sc.nextInt();
	        switch(selectNo) {
	        case 1:{
	        	System.out.println("�̸� : ");
	        	name = sc.nextLine();
	        	System.out.println("�ּ� : ");
	        	address = sc.nextLine();
	        	System.out.println("���� : ");
	        	phone = sc.nextLine();
	        	
	        	stu = new StudentDTO(name,address,phone);
	        	break;
	        }
	        case 2:{
	        	app.enter(stu);
	        	break;
	        }
	        case 3:{
	        	app.mypro(stu);
	        	break;
	        }
	        case 4:{
	        	//��������
	        	//�ּҸ� ����Ư���÷� �ٲٰ� ��� �ʵ尪 ���
	        	stu = new StudentDTO();
	        	app.modify(stu);	        	
	        	break;
	        }
	        case 6 :{
	        	// DTOClass �̿��� ��ü ����
	        	stu1 = new StudentDTO();
	        	//set �޼ҵ带 �̿��� �� �ʵ尪 ����
	        	System.out.println("�̸� : ");
	        	stu1.setName(sc.nextLine());
	        	System.out.println("�ּ� : ");
	        	stu1.setAddress(sc.nextLine());
	        	System.out.println("���� : ");
	        	stu1.setPhone(sc.nextLine());
        }
       	}
       }
	}
}

