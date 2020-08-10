package object_oriented_type;

public class MobileMain {

	public static void main(String[] args) {
		// 기본생성자를 이용한 Mobile 객체 생성
		Mobile mobile1 = new Mobile();
		mobile1.company = "애플";
		mobile1.model = "아이폰11s";
		mobile1.color = "black";
		mobile1.type = 5;
		
		Mobile mobile2 = new Mobile();
		mobile2.model = "s20";
		mobile2.color = "red";
		mobile2.type = 5;
		
		System.out.println(mobile2.color);
		System.out.println(mobile2.company);
		System.out.println(mobile2.model);
		System.out.println(mobile2.type);
		
		// 객체를 만들 때 필드 정보를 함께 저장하고자 할때
		// 매개변수가 있는 생성자를 사용
		
		Mobile mobile3 = new Mobile();
		System.out.println(mobile3.color);
		System.out.println(mobile3.company);
		System.out.println(mobile3.model);
		System.out.println(mobile3.type);
		
		// 모든 필드를 매개변수로 하는 생성자를 이용한 객체 생성
		Mobile mobile4 = new Mobile("삼성", "노트10", "black", 5); // 매개값
		System.out.println(mobile4.color);
		System.out.println(mobile4.company);
		System.out.println(mobile4.model);
		System.out.println(mobile4.type);
		
		mobile4.model = "노트10plus";
		System.out.println(mobile4.model);
		

	}

}
