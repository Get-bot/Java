package Array;

public class Array {

	public static void main(String[] args) {
		// ������ �迭���� ����
		int[] num;
		int num1 [];
		//�迭 �����ϸ鼭 �ʱⰪ ����
		int num2 [] = {1, 2, 3, 4};
		
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2]);
		System.out.println(num2[3]);
		// String Ÿ�� �迭�� �����Ͽ� ���� �ٿ� ���� 4���� �̸��� �����ϰ� Ǯ��
		
		String[] name = {"ö��" ,"����" ,"���� "," ����"};
		name[3]="Į�ٶ�";
		String n ="";
 		 n ="īŸ";
			name [2] = n;
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		//�迭�� ũ�� �� Ȱ��
		System.out.println(name.length);
		//
		
		String[] str = {"ö��","����","����","����"};
		
		for(int i = 0 ; i<str.length; i++) {
			System.out.println(str[i]);
		}
		int[] num3 = new int[4];
		System.out.println(num3.length);
		for(int i = 0; i<num3.length; i++) {
			System.out.println(num3[i]);
		}
		
		
		
		
		}
}



