package object_oriented_type_practice;

import java.util.Date;

public class Application {

	public static void enter(Student stu) {
		System.out.println("Application 클래스의 enter 메소드");
		System.out.println(stu.name+" 님 입실완료");
		System.out.println("입실시간 : "+new Date());

	}

	public void mypro(Student stu) {
		System.out.println(stu.name);
		System.out.println(stu.address);
		System.out.println(stu.phone);
		
	}
//객체를 언제선언하냐에따라 값이달리진다.
	public void modify(Student stu) {
		// TODO Auto-generated method stub
		
	}

}
