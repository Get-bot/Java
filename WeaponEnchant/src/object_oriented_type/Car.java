package object_oriented_type;

public class Car {
	/*
	 * 클래스 3요소
	 * 1. 필드 field
	 *  - 데이터 저장을 위한 공간
	 *  - 변수와 비슷한 개념
	 *  2.생성자 constructor
	 *  -객체를 마늗ㄹ 떄 따라야 하는 규칙을 정의
	 *  -생성자는 여러 개 만들 수 있음.
	 *  -생성자는 매개변수가 있을 수도 있고 없을 수도 있음.
	 *  -생성자의 이름은 클래스 이름과 동일해야 함
	 *  3.메소드(method)
	 *  -특정 기능 수행을 정의한 블록
	 *  -매개변수가 있을 수도 있고 없을 수도 있음
	 *  -main 클래스 등에서 메소드를 호출하면 자신이 가지고 있는 기능을 수행한 후
	 *  리턴(return)을함.(return)없는경우도있음
	 */
	//필드
String color;
int speed;
String type;
String model;
String company= "벤츠";


// 기본 생성자
Car(){
	
}

//매개변수가 있는 생성자 선언
//매개변수 : model
Car(String model){
	this.model = model;
}
	
}
