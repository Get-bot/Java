package Array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Array_App {

	public static void main(String[] args) {
		//ũ�Ⱑ 5�� ������ �迭�� ����
		// �� �˾Ƽ�
		// �Էµ� ���� ���հ� ���
		Scanner sc= new Scanner(System.in);
		int T = 0;
		int i =0;
		System.out.println("�迭�� ������ �Է��ϼ���.");
		T=sc.nextInt();
		int[] num;
		num = new int[T];
		DecimalFormat df=new DecimalFormat("#.##");
		double sum = 0;
		double average = 0;
		System.out.println("��"+T+"���� �Է��ϼ���");
		for(i= 0; i<num.length; i++ ) {
			num[i]=sc.nextInt();
			sum+=num[i];
		}
		average = sum/i;
		System.out.println("���� : "+df.format(sum));
		System.out.println("���"+df.format(average));
}		
}
