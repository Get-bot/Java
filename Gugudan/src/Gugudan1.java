
public class Gugudan1 {
	
//	public static void main(String[] args) {
//		int []Gugu = new int[9];
//		//2�� ����� �迭������
//		for(int i=1;i<=Gugu.length;i++) {	
//			Gugu[i-1] = 2*i;
//			}
//		//�迭�� ����Ȱ� ȣ��
//		for(int i=0;i<Gugu.length;i++) {
//		System.out.println(Gugu[i]);
//		}
//	}
//		//�޼ҵ� ����
		//���κ�
		public static int[] cal(int num) {
			int []Gugu = new int[9];
			for(int i=1;i<=Gugu.length;i++) {
				Gugu[i-1] = num*i;
			}
			return Gugu;
		}
		//��ºκ�
		public static void calPrint(int[] Gugu) {
			for(int i=0;i<Gugu.length;i++) {
				System.out.println(Gugu[i]);
				}
		}
		//ó���κ�	
		public static void main(String[] args) {
		int[] Gugu2=cal(2);
		calPrint(Gugu2);
		int[] Gugu3=cal(3);
		calPrint(Gugu3);
		int[] Gugu4=cal(4);
		calPrint(Gugu4);
	}
}
