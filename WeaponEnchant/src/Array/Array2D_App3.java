package Array;

import java.util.Scanner;

public class Array2D_App3 {

	public static void main(String[] args) {
		// 1학년 1학기부터 4학년 2학기 까지 성적 입력후 총합과 평균구하기
		Scanner sc = new Scanner(System.in);
		
		//double grade [] [] = new double [4][2];
		double grade [] [] =new double[4][2];
		double sumGr=0;
		double averageGr=0;
		int i =0;
		int j =0;
		for( i =0 ; i<grade.length; i++) {
			for( j =0 ; j<grade[i].length; j++) {
				System.out.println((i+1)+"학년"+(j+1)+"학기 : " );
				grade[i][j] = sc.nextDouble();
				sumGr+=grade[i][j];
			}
		}
			averageGr=(sumGr/(grade.length*grade[0].length));
		System.out.println("총합 : "+sumGr);
		System.out.println("평균 : "+averageGr);
	}
}

