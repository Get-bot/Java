package object_oriented_type;

public class shape_ {

	public static void main(String[] args) {
		/*
		 * ����ȯ Ư�� Ÿ���� ������ �ٸ� Ÿ���� ������ ��ȯ�ϴ� �� 1. �ڵ� ����ȯ -ũ�Ⱑ ���� Ÿ���� ū Ÿ������ ��ȯ 2. ���� ����ȯ
		 * -ũ�Ⱑ ū Ÿ���� ���� Ÿ������ ��ȯ
		 */

		int intVar = 10;
		double doubleVar = 1.0;
		printA(intVar, doubleVar);
		doubleVar = intVar;
		System.out.println("�ں���");
		System.out.println(intVar);
		System.out.println(doubleVar);
//		intVar = doubleVar;  type mismatch
		intVar = (int) doubleVar; // ���� �տ� Ÿ���� ���ð�� ��������ȯ !
		System.out.println("������");
		System.out.println(intVar);
		System.out.println(doubleVar);
	}

	public static void printA(int intVar, double doubleVar) {
		System.out.println("�ʱⰪ");
		System.out.println(intVar);
		System.out.println(doubleVar);
	}   

}
