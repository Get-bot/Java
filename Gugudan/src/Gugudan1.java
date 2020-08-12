
public class Gugudan1 {
	
//	public static void main(String[] args) {
//		int []Gugu = new int[9];
//		//2단 계산후 배열에저장
//		for(int i=1;i<=Gugu.length;i++) {	
//			Gugu[i-1] = 2*i;
//			}
//		//배열에 저장된값 호출
//		for(int i=0;i<Gugu.length;i++) {
//		System.out.println(Gugu[i]);
//		}
//	}
//		//메소드 생성
		//계산부분
		public static int[] cal(int num) {
			int []Gugu = new int[9];
			for(int i=1;i<=Gugu.length;i++) {
				Gugu[i-1] = num*i;
			}
			return Gugu;
		}
		//출력부분
		public static void calPrint(int[] Gugu) {
			for(int i=0;i<Gugu.length;i++) {
				System.out.println(Gugu[i]);
				}
		}
		//처리부분	
		public static void main(String[] args) {
		int[] Gugu2=cal(2);
		calPrint(Gugu2);
		int[] Gugu3=cal(3);
		calPrint(Gugu3);
		int[] Gugu4=cal(4);
		calPrint(Gugu4);
	}
}
