package Gugudanclass;

import java.util.Scanner;

public class lastGugu {
//
	public static void main(String[] args) {
/*사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)
을 계산해 출력한다.

사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.

예를 들어 사용자가 8,7과 같은 문자열을 입력하면 팔칠단을 구현한다.
 팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 
 까지 구현하는 것을 의미한다
*/
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자두개를 입력해주세요;");
		System.out.println("입력방식 숫자1,숫자2");
		String inputVal = sc.nextLine();
		String [] splitedVal = inputVal.split(",");
		System.out.println(inputVal);
		int num1 = Integer.parseInt(splitedVal[0]);
		int num2 = Integer.parseInt(splitedVal[1]);
		for(int i=2;i<=num1;i++) {
			for(int j =1;j<=num2;j++) {
				int result = i*j;
				System.out.println(i+"x"+j+"="+result);
			}
		}
//			
		sc.close();
	}

}
