package object_oriented_type;

public class Calculator {
	// ���� �޼ҵ� ����
	/*
	 * ���� : ����
	 * �Ű����� : ������ ���� 2��
	 * �޼ҵ� �̸� : sum
	 * �޼ҵ� ���� ���� : �Ű����� 2���� ��
	 */
	void sum(int num1,int num2){
		System.out.println(num1+num2);
	}
	/*
	 * ����:������ ����
	 * �Ű����� :������ ���� 2��
	 * �޼ҵ� �̸� : sum1
	 * �޼ҵ� ���೻�� :
	 * 			-�Ű����� 2���� �հ��
	 * 			-�ջ� ��� ����
	 */
	int sum1(int num1, int num2) {
		int sum = num1+num2; //�̰��� 
		return sum;//���⼭ ����
	}
	//add method, return type : int, Parameter : x , y
	int add(int x, int y) {
		int result = x+y; //x+y �� result ������
		return result;	// method add �� (x,y)	
	}
	
	double avg(int x, int y) {
		double sum = add(x,y);  //method add ���� ���ϵ� ���� sum �� ����
		double result = sum/2; //sum/2 ���� result �� ����
		return result;// method avg �� sum/2
				
	}
	void execute() {
		double result = avg(7,10); // 7+10 /2  �� ��� ó���� result �� ����
				System.out.println("������ : "+result);
	}
	
}
