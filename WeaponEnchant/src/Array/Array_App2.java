package Array;

import java.util.Scanner;

public class Array_App2 {

	public static void main(String[] args) {
		//�Ʒ� min �ȳ����� ����ã�� 
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ������ �Է��ϼ��� : ");
		int T = sc.nextInt();
		int[] num = new int[T];
		int max = num[0] ;
		int min = num[0];
		System.out.println("�迭�� ��"+T+"���� �Է����ּ���");
		for(int i= 0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if(max<num[i]) {
				max=num[i];
		}
			if(min>num[i]) {
				min=num[i];
		}

	}
		System.out.println("�ִ� �� : "+max);
		System.out.println("�ּ� �� : "+min);
}
}

