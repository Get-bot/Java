package Array;

import java.util.Scanner;

public class Array2D_App5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// 정수형 배열 num 이름만 선언 (완전한 배열로 선언된 것은 아님)
		int[] num = null;
		System.out.println(num.length);
		//스캐너 입력을 통해 사이즈 지정
		System.out.println("지정한 배열 크기");
		int size = sc.nextInt();
		//입력받은 숫자를 배열 크기에 지정
		num = new int [size];
		System.out.println(num.length);
// =num = new int [5]
		
	}

}
