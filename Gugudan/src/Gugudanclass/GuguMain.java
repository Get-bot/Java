package Gugudanclass;

public class GuguMain {

	public static void main(String[] args) {
		//클래스 이용 구구단출력
		GuguDAO gu = new GuguDAO();
		int[] Gugu2=gu.cal(2);
		gu.calPrint(Gugu2);
		int[] Gugu3=gu.cal(3);
		gu.calPrint(Gugu3);
		int[] Gugu4=gu.cal(4);
		gu.calPrint(Gugu4);
	}

}
