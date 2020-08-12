package Gugudanclass;

public class GuguDAO {

//	//계산부분
	public int[] cal(int num) {
		int []Gugu = new int[9];
		for(int i=1;i<=Gugu.length;i++) {
			Gugu[i-1] = num*i;
		}
		return Gugu;
	}
	//출력부분
	public void calPrint(int[] Gugu) {
		for(int i=0;i<Gugu.length;i++) {
			System.out.println(Gugu[i]);
			}
	}
}
