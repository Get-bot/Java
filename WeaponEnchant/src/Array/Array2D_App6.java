package Array;

import java.util.Scanner;

public class Array2D_App6 {

//public static void printS{
//	case 1: {
//		System.out.print("�л���> "+t);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 0;
		int j = 0;
		int[] numSt = null;
		int t = 0;
		double sum = 0;
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("| 1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� |");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("����> ");
			select = sc.nextInt();
			switch (select) {
			case 1: {
				System.out.print("�л���> ");
				t = sc.nextInt();
				numSt = new int[t];
				break;
			}
			case 2: {
				for (j = 0; j < t; j++) {
					System.out.print((j + 1) + "�� ° �л����� : ");
					numSt[j] = sc.nextInt();
				}
				break;
			}
			case 3: {
				for (j = 0; j < t; j++) {
					System.out.println((j + 1) + "�� �� �л����� : " + numSt[j]);
				}
				break;
			}
			case 4: {
				for (j = 0; j < t; j++) {
					for (int k = 0; k < t; k++)
						if (numSt[j] > numSt[k]) {
							int save = numSt[j];
							numSt[j] = numSt[k];
							numSt[k] = save;
						}
				}
				for (j = 0; j < t; j++) {
					sum += numSt[j];
				}
				double average = sum / t;
				System.out.println("�ְ����� : " + numSt[0]);
				System.out.println("������� : " + Math.floor((average) * 10) / 10.0); // �Ҽ��� ù��¥�� �����ݿø�
				System.out.println("�������� ����");
				for (j = 0; j < numSt.length; j++) {
					System.out.println(numSt[j]);
				}
				break;
			}
			case 5: {
				System.out.println("���α׷� ����");
				run = false;
				break;
			}
			default: {
				System.out.println("�߸��Է� �ϼ˽��ϴ�. ��ϳ����� �Է����ּ���.");
				break;
			}
			}
		}
	}
}
