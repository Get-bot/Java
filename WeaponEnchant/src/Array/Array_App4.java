package Array;

import java.util.Scanner;

public class Array_App4 {

	public static void main(String[] args) {
		int num[] = {1,2,5,3,4,7,6,9,10,8};
		int value =0 ;
		int index = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		value = sc.nextInt()	;
		for(int i=0; i<num.length; i++) {
			//�Է��� ���ڿ� �迭�� ��� �����Ϳ� �������� ���� ��
			if(value == num[i]) {
				System.out.println(i);
				index = i;
			}
//			index++;
		}
		System.out.println(value+"��"+(index+1)+"��° �ֽ��ϴ�.");
		
		
	}

}
