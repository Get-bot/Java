package object_oriented_type;

public class CalculatorMain {
	
	public static void main(String[] args) {
		//Calculator Ŭ������ ��ü ����
		Calculator cal = new Calculator();
		cal.sum(5, 10);
		int val1 =10;
		int val2 =7;
		double val3 =0.5;
		cal.sum(val1, val2);
//		cal.sum(val1, val3)//double Ÿ���� �ƴϱ⶧���� �������
		
		cal.sum1(5, 3);
		System.out.println(cal.sum1(8, 12));
//		=System.out.println(20);
		int result = cal.sum1(7, 10);
		System.out.println(result);
		
		//Calculator Ŭ������ execute �޼ҵ� ȣ��
		cal.execute();
	}
	
	
	
	
}
