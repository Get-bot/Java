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
		
		System.out.print("��й�ȣ > : ");
		dto.setPassword(sc.next());
		
		System.out.print("��й�ȣ Ȯ�� > : ");

		dto.setPasswordCheck(sc.next());
		boolean pass = true;
		while(pass) {
		if(dto.getPassword().equals(dto.getPasswordCheck())) {
		System.out.println("��й�ȣ�� ��ġ�մϴ�.");
		pass = false;
		}else {
		System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�.");
		System.out.println("�ٽ��Է����ּ���.");
		System.out.print("��й�ȣ Ȯ�� > : ");
		dto.setPasswordCheck(sc.next());
		}
		}
		System.out.print("�̸� > : ");
		dto.setName(sc.next());
		
		System.out.print("���� > : ");
		dto.setBirth(sc.next());
		
		System.out.print("���� > : ");
		dto.setGender(sc.next());
		
		System.out.print("�̸����ּ� > : ");
		dto.setEforID(sc.next());
		
		System.out.print("��ȭ��ȣ > : ");
		dto.setPhone(sc.next());
		dtolist.add(dto);
	}

	public void printID(NaverDTO dto) {
		for(int i=0; i<dtolist.size();i++) {
		System.out.println("�̸� : "+dtolist.get(i).getName());
		System.out.println("ID : "+dtolist.get(i).getID());
		System.out.println("��� :"+ dtolist.get(i).getPassword());
		}	
}
	public void printAll(NaverDTO dto) {	
		for(int i=0; i<dtolist.size();i++) {
		System.out.println(dtolist.get(i));
		}
	}

		
	}



