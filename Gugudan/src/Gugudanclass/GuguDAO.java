package Gugudanclass;

public class GuguDAO {

//	//���κ�
	public int[] cal(int num) {
		int []Gugu = new int[9];
		for(int i=1;i<=Gugu.length;i++) {
			Gugu[i-1] = num*i;
		}
		return Gugu;
	}
	//��ºκ�
	public void calPrint(int[] Gugu) {
		for(int i=0;i<Gugu.length;i++) {
			System.out.println(Gugu[i]);
			}
	}
}
