package object_oriented_type_practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NaverService {
	Scanner sc = new Scanner(System.in);
	List<NaverDTO> dtolist = new ArrayList<NaverDTO>();
	public void scanUser(NaverDTO dto, Scanner sc) {
		dto = new NaverDTO();
		System.out.print("ID > : ");
		dto.setID(sc.next());
		
		System.out.print("비밀번호 > : ");
		dto.setPassword(sc.next());
		
		System.out.print("비밀번호 확인 > : ");

		dto.setPasswordCheck(sc.next());
		boolean pass = true;
		while(pass) {
		if(dto.getPassword().equals(dto.getPasswordCheck())) {
		System.out.println("비밀번호가 일치합니다.");
		pass = false;
		}else {
		System.out.println("비밀번호가 일치하지않습니다.");
		System.out.println("다시입력해주세요.");
		System.out.print("비밀번호 확인 > : ");
		dto.setPasswordCheck(sc.next());
		}
		}
		System.out.print("이름 > : ");
		dto.setName(sc.next());
		
		System.out.print("생일 > : ");
		dto.setBirth(sc.next());
		
		System.out.print("성별 > : ");
		dto.setGender(sc.next());
		
		System.out.print("이메일주소 > : ");
		dto.setEforID(sc.next());
		
		System.out.print("전화번호 > : ");
		dto.setPhone(sc.next());
		dtolist.add(dto);
	}

	public void printID(NaverDTO dto) {
		for(int i=0; i<dtolist.size();i++) {
		System.out.println("이름 : "+dtolist.get(i).getName());
		System.out.println("ID : "+dtolist.get(i).getID());
		System.out.println("비번 :"+ dtolist.get(i).getPassword());
		}	
}
	public void printAll(NaverDTO dto) {	
		for(int i=0; i<dtolist.size();i++) {
		System.out.println(dtolist.get(i));
		}
	}

		
	}



