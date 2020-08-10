package object_oriented_type;

public class Mobile {
	String company = "삼성";
	String model;
	String color;
	int type; // 4g, 5g
	
	// 모든 필드를 매개변수로 하는 생성자
	Mobile(String company, String model, String color, int type) {
		// 전달받은 매개변수에 담긴 값을 각각 필드에 저장
		this.company = company; // 필드 = 매개변수
		this.model = model;
		this.color = color;
		this.type = type;
	}
	
	// 기본생성자 선언
	Mobile() {
		
	}
	// 생성자 overloading: 생성자를 여러 개 생성할 수 있음
	
	Mobile(String model, String color, int type) {
		this.model = model;
		this.color = color;
		this.type = type;
	}

}
