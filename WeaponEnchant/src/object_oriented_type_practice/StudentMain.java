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
	        System.out.println("| 1. 신규등록 | 2. 출석체크 | 3.내정보확인 | 4. | 5.종료 |");
	        System.out.println("------------------------------------------------------");
	        System.out.print("선택 : ");
	        int selectNo =sc.nextInt();
	        switch(selectNo) {
	        case 1:{
	        	System.out.println("이름 : ");
	        	name = sc.nextLine();
	        	System.out.println("주소 : ");
	        	address = sc.nextLine();
	        	System.out.println("전번 : ");
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
	        	//정보수정
	        	//주소를 서울특별시로 바꾸고 모든 필드값 출력
	        	stu = new Student();
	        	app.modify(stu);	        	
	        	break;
	        }
		}


	}
	}
}
