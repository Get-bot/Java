package Array;

import java.util.Scanner;

public class B {

//public static void printS{
//	case 1: {
//		System.out.print("학생수> "+t);
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 0;
		int j=0;
		int[] numSt=null;
		double sum=0;
		boolean run =true;
		while(run){
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------------------");
			System.out.print("선택> ");
			select = sc.nextInt();
			switch (select) {
			case 1: {
			System.out.print("학생수> ");		 
			int t=sc.nextInt();
			numSt =new int[t];	
			break;}
			case 2: {
				for(j=0; j<numSt.length ;j++ ) {
					System.out.print((j+1)+"번 째 학생점수 : ");
					numSt[j]=sc.nextInt();
						}
				break;
				}
			case 3: {
				for(j=0; j<numSt.length; j++) {
					System.out.println((j+1)+"번 쨰 학생점수 : "+numSt[j]);
				}
				break;	}
			case 4: {
				for(j=0; j<numSt.length; j++) {
					for(int k= 0 ; k<numSt.length ; k++)
					 if(numSt[j]>numSt[k]) {
						 //3>2
						 int save = numSt[j];
						 numSt[j]=numSt[k];
						 numSt[k]=save;					 
					 }
				}
				for(j=0; j<numSt.length ;j++) {
				sum += numSt[j];
				}
				double average = sum/numSt.length;
				System.out.println("최고점수 : "+numSt[0]);
				System.out.println("평균점수 : "+average);
				System.out.println("내림차순 정렬");
				for(j=0; j<numSt.length ; j++) {
					System.out.println(numSt[j]);				
				}
				break;}	
			case 5:{System.out.println("프로그램 종료");	
			run = false;
			break;}
			default :{
				System.out.println("잘못입력 하셧습니다. 목록내에서 입력해주세요.");
			break;}
			}
		}
		

	}
	}

