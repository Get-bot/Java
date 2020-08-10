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
//		stu1.setName("회원1");//매개변수가 
		//네임필드에 회원1 이라는 값을주고싶을떄
		//set method 이용하여 name 필드 에 값저장
		//get method 이용하여 name 필드 값 출력
//		System.out.println(stu1.getName());
		
		while(run) {			
		    System.out.println("---------------------------------------------------------------------------------------------------------");
	        System.out.println("| 1. 신규등록 | 2. 출석체크 | 3.내정보확인 | 4.정보수정 | 5.종료 |6. DTOClass 이용한 객체|");
	        System.out.println("---------------------------------------------------------------------------------------------------------");
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
	        	//정보수정
	        	//주소를 서울특별시로 바꾸고 모든 필드값 출력
	        	stu = new StudentDTO();
	        	app.modify(stu);	        	
	        	break;
	        }
	        case 6 :{
	        	// DTOClass 이용한 객체 생성
	        	stu1 = new StudentDTO();
	        	//set 메소드를 이용해 각 필드값 저장
	        	System.out.println("이름 : ");
	        	stu1.setName(sc.nextLine());
	        	System.out.println("주소 : ");
	        	stu1.setAddress(sc.nextLine());
	        	System.out.println("전번 : ");
	        	stu1.setPhone(sc.nextLine());
        }
       	}
       }
	}
}

