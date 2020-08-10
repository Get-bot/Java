package Array;

import java.util.Scanner;

public class Array_App2 {

	public static void main(String[] args) {
		//아래 min 안나오는 이유찾기 
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 개수를 입력하세요 : ");
		int T = sc.nextInt();
		int[] num = new int[T];
		int max = num[0] ;
		int min = num[0];
		System.out.println("배열의 수"+T+"개를 입력해주세요");
		for(int i= 0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if(max<num[i]) {
				max=num[i];
		}
			if(min>num[i]) {
				min=num[i];
		}

	}
		System.out.println("최대 값 : "+max);
		System.out.println("최소 값 : "+min);
}
}

