package object_oriented_type;

public class Calculator {
	// 덧셈 메소드 선언
	/*
	 * 리턴 : 없음
	 * 매개변수 : 정수형 변수 2개
	 * 메소드 이름 : sum
	 * 메소드 수행 내요 : 매개변수 2개의 합
	 */
	void sum(int num1,int num2){
		System.out.println(num1+num2);
	}
	/*
	 * 리턴:정수값 리턴
	 * 매개변수 :정수형 변수 2개
	 * 메소드 이름 : sum1
	 * 메소드 수행내용 :
	 * 			-매개변수 2개의 합계산
	 * 			-합산 결과 리턴
	 */
	int sum1(int num1, int num2) {
		int sum = num1+num2; //이값을 
		return sum;//여기서 리턴
	}
	//add method, return type : int, Parameter : x , y
	int add(int x, int y) {
		int result = x+y; //x+y 를 result 에저장
		return result;	// method add 는 (x,y)	
	}
	
	double avg(int x, int y) {
		double sum = add(x,y);  //method add 에서 리턴된 값을 sum 에 저장
		double result = sum/2; //sum/2 값을 result 에 저장
		return result;// method avg 는 sum/2
				
	}
	void execute() {
		double result = avg(7,10); // 7+10 /2  로 결과 처리되 result 에 보관
				System.out.println("실행결과 : "+result);
	}
	
}
