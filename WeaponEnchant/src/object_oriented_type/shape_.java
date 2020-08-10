package object_oriented_type;

public class shape_ {

	public static void main(String[] args) {
		/*
		 * 형변환 특정 타입의 변수를 다른 타입의 변수로 변환하는 것 1. 자동 형변환 -크기가 작은 타입이 큰 타입으로 변환 2. 강제 형변환
		 * -크기가 큰 타입이 작은 타입으로 변환
		 */

		int intVar = 10;
		double doubleVar = 1.0;
		printA(intVar, doubleVar);
		doubleVar = intVar;
		System.out.println("자변후");
		System.out.println(intVar);
		System.out.println(doubleVar);
//		intVar = doubleVar;  type mismatch
		intVar = (int) doubleVar; // 변수 앞에 타입이 나올경우 강제형변환 !
		System.out.println("강변후");
		System.out.println(intVar);
		System.out.println(doubleVar);
	}

	public static void printA(int intVar, double doubleVar) {
		System.out.println("초기값");
		System.out.println(intVar);
		System.out.println(doubleVar);
	}   

}
