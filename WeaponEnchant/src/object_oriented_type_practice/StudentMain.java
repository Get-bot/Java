package object_oriented_type_practice;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String name = "";
		String address = "";
		String phone = "";
		
		Student stu = null; 
		
		Application app = new Application();
		
		while(run) {			
		    System.out.println("------------------------------------------------------");
	        System.out.println("| 1. �űԵ�� | 2. �⼮üũ | 3.������Ȯ�� | 4. | 5.���� |");
	        System.out.println("------------------------------------------------------");
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
	        	
	        	stu = new Student(name,address,phone);
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
	        	stu = new Student();
	        	app.modify(stu);	        	
	        	break;
	        }
		}


	}
	}
}
