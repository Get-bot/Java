package Array;

import java.util.Scanner;

public class Array2D_App3 {

	public static void main(String[] args) {
		// 1�г� 1�б���� 4�г� 2�б� ���� ���� �Է��� ���հ� ��ձ��ϱ�
		Scanner sc = new Scanner(System.in);
		
		//double grade [] [] = new double [4][2];
		double grade [] [] =new double[4][2];
		double sumGr=0;
		double averageGr=0;
		int i =0;
		int j =0;
		for( i =0 ; i<grade.length; i++) {
			for( j =0 ; j<grade[i].length; j++) {
				System.out.println((i+1)+"�г�"+(j+1)+"�б� : " );
				grade[i][j] = sc.nextDouble();
				sumGr+=grade[i][j];
			}
		}
			averageGr=(sumGr/(grade.length*grade[0].length));
		System.out.println("���� : "+sumGr);
		System.out.println("��� : "+averageGr);
	}
}

