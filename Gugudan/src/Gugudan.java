import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		//2��
//		System.out.println("2��");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
		//3��
//		System.out.println("3��");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
//		
//		//4��
//		System.out.println("4��");
//		int result = 4*1;
//		System.out.println(result);
//		result = 4*2;
//		System.out.println(result);
//		result = 4*3;
//		System.out.println(result);
//		result = 4*4;
//		System.out.println(result);
//		result = 4*5;
//		System.out.println(result);
//		result = 4*6;
//		System.out.println(result);
//		result = 4*7;
//		System.out.println(result);
//		result = 4*8;
//		System.out.println(result);
//		result = 4*9;
//		System.out.println(result);
//	
//	//4��,5��
//	int num = 4;
//	int num1 = 5;
//	//4��
//	System.out.println("4��");
//	int i = num*1;
//	System.out.println(i);
//	 i = num*2;
//	System.out.println(i);
//	 i = num*3;
//	System.out.println(i);
//	 i = num*4;
//	System.out.println(i);
//	 i = num*5;
//	System.out.println(i);
//	 i = num*6;
//	System.out.println(i);
//	 i = num*7;
//	System.out.println(i);
//	 i = num*8;
//	System.out.println(i);
//	 i = num*9;
//	System.out.println(i);
//	
//	//5��
//	System.out.println("5��");
//	 i = num1*1;
//	System.out.println(i);
//	 i = num1*2;
//	System.out.println(i);
//	 i = num1*3;
//	System.out.println(i);
//	 i = num1*4;
//	System.out.println(i);
//	 i = num1*5;
//	System.out.println(i);
//	 i = num1*6;
//	System.out.println(i);
//	 i = num1*7;
//	System.out.println(i);
//	 i = num1*8;
//	System.out.println(i);
//	 i = num1*9;
//	System.out.println(i);
//	
	//Scanner
//	Scanner sc= new Scanner(System.in);
//	System.out.print("����Ͻ� ������ ���ڸ� �Է����ּ���.");
//	int num = sc.nextInt();
//	System.out.println(num+"��");
//	int i = num*1;
//	System.out.println(i);
//	 i = num*2;
//	System.out.println(i);
//	 i = num*3;
//	System.out.println(i);
//	 i = num*4;
//	System.out.println(i);
//	 i = num*5;
//	System.out.println(i);
//	 i = num*6;
//	System.out.println(i);
//	 i = num*7;
//	System.out.println(i);
//	 i = num*8;
//	System.out.println(i);
//	 i = num*9;
//	System.out.println(i);
		
	//�ݺ��� �̿� 6��7��
//	int i = 1;
//	int	result = 0;
//	System.out.println("6��");
//	while(9 >= i ) {
//	result = 6*i;
//	System.out.println("6x"+i+"="+result);
//	i++;
//	}
//	System.out.println("7��");
//	for(i=1;i<=9;i++) {
//	result = 7*i;
//		System.out.println("7x"+i+"="+result);	
//	}
	//if�� �̿� 8��,9��	
		Scanner sc=new Scanner(System.in);
		int num = 0;
		int result = 0;
		System.out.println("����Ͻ� ���ڸ� �Է��ϼ��� :");
		num = sc.nextInt();
		if(num > 1 && num<10) {
			System.out.println(num+"��");
			for(int i = 1; i<=9 ; i++) {
				result = num * i;
				System.out.println(num+"x"+i+"="+result);
			}
		
		}else {
			System.out.println("2�̻�,9������ ���� �Է��Ҽ��ֽ��ϴ�.");
		}
		
}
}
