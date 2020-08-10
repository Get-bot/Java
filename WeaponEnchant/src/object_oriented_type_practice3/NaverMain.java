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
//		dto.setName("회원1");//매개변수가 
		//네임필드에 회원1 이라는 값을주고싶을떄
		//set method 이용하여 name 필드 에 값저장
		//get method 이용하여 name 필드 값 출력
//		System.out.println(stu1.getName());
		
		while(run) {			
		    System.out.println("--------------------------------------------------------------------------------");
	        System.out.println("| 1. 신규등록 | 2. 정보확인 | 3.아이디비번출력 | 4. | 5.종료 |");
	        System.out.println("--------------------------------------------------------------------------------");
	        System.out.print("선택 > ");
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
	        	System.out.println("종료합니다.");
	        	run =false;
	        	break;
        }
       	}
       }
	}

	
}

