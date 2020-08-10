package Array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Array_App {

	public static void main(String[] args) {
		//크기가 5인 정수형 배열을 선언
		// 값 알아서
		// 입력된 값의 총합과 평균
		Scanner sc= new Scanner(System.in);
		int T = 0;
		int i =0;
		System.out.println("배열의 개수를 입력하세요.");
		T=sc.nextInt();
		int[] num;
		num = new int[T];
		DecimalFormat df=new DecimalFormat("#.##");
		double sum = 0;
		double average = 0;
		System.out.println("수"+T+"개를 입력하세요");
		for(i= 0; i<num.length; i++ ) {
			num[i]=sc.nextInt();
			sum+=num[i];
		}
		average = sum/i;
		System.out.println("총합 : "+df.format(sum));
		System.out.println("평균"+df.format(average));
}		
}
