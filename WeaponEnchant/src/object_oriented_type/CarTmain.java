package object_oriented_type;

import java.util.Scanner;

public class CarTmain {

	public static void main(String[] args) {
		int num1 =0;
		int num2 =0;
		CarT ca = new CarT();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {			
	    System.out.println("------------------------------------------------------");
        System.out.println("| 1. ���� | 2. �E�� | 3.���� | 4.������ | 5.���� |");
        System.out.println("------------------------------------------------------");
        System.out.print("���� : ");
        int selectNo =sc.nextInt();
        switch(selectNo) {
        case 1:{
        	num1 =5;
        	num2 =5;
        	ca.sum(num1,num2);
        }
        case 2:{
        	System.out.println("�����Է� : ");
        	num1 =sc.nextInt();
           	System.out.println("�����Է� : ");    	
        	num2 =sc.nextInt();
        	ca.sub(num1,num2);
        }
        case 3:{
           	System.out.println("�����Է� : ");
        	num1 =sc.nextInt();
           	System.out.println("�����Է� : ");    	
        	num2 =sc.nextInt();
        	int result = ca.multi(num1,num2);
        	System.out.println("������� : "+result);
        }
        case 4:{
        	ca.divi();
        }
	}

}
}
}