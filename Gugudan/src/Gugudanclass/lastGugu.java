package Gugudanclass;

import java.util.Scanner;

public class lastGugu {
//
	public static void main(String[] args) {
/*����ڰ� �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ����� ����Ѵ�.
���� ��� ����ڰ� 8�� �Է��ϸ� ���ȴ�, 19�� �Է��ϸ� �ʱ��ʱ���(2 * 1���� 19 * 19)
�� ����� ����Ѵ�.

����ڰ� �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ����� ����Ѵ�.

���� ��� ����ڰ� 8,7�� ���� ���ڿ��� �Է��ϸ� ��ĥ���� �����Ѵ�.
 ��ĥ���� 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 
 ���� �����ϴ� ���� �ǹ��Ѵ�
*/
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڵΰ��� �Է����ּ���;");
		System.out.println("�Է¹�� ����1,����2");
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
