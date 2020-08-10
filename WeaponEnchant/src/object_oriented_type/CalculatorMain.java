package object_oriented_type;

public class CalculatorMain {
	
	public static void main(String[] args) {
		//Calculator 클래스의 객체 선언
		Calculator cal = new Calculator();
		cal.sum(5, 10);
		int val1 =10;
		int val2 =7;
		double val3 =0.5;
		cal.sum(val1, val2);
//		cal.sum(val1, val3)//double 타입이 아니기때문에 실행안함
		
		cal.sum1(5, 3);
		System.out.println(cal.sum1(8, 12));
//		=System.out.println(20);
		int result = cal.sum1(7, 10);
		System.out.println(result);
		
		//Calculator 클래스의 execute 메소드 호출
		cal.execute();
	}
	
	
	
	
}
