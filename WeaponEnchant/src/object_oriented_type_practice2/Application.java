package object_oriented_type_practice2;

import java.util.Date;

public class Application {

	public static void enter(StudentDTO stu) {
		System.out.println("Application Ŭ������ enter �޼ҵ�");
		System.out.println(stu.name+" �� �ԽǿϷ�");
		System.out.println("�Խǽð� : "+new Date());

	}

	public void mypro(StudentDTO stu) {
		System.out.println(stu.name);
		System.out.println(stu.address);
		System.out.println(stu.phone);
		
	}
//��ü�� ���������ϳĿ����� ���̴޸�����.
	public void modify(StudentDTO stu) {
		// TODO Auto-generated method stub
		
	}

}
