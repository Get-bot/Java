package object_oriented_type;

import java.util.Scanner;

public class CarT {
	Scanner sc=new Scanner(System.in);
void sum (int num1,int num2) {
	System.out.println("������ : "+num1+num2);
}	
void sub (int num1 , int num2) {
    int result = num1 - num2;
    System.out.println("������� : "+ result);
}
int multi (int num1, int num2) {
	int result = num1*num2;
	return result;
}
void divi() {
  	System.out.println("�����Է� : ");
	int num1 =sc.nextInt();
   	System.out.println("�����Է� : ");    	
	int num2 =sc.nextInt();
	int result = num1/num2;
	System.out.println("��������� : "+result);
}
}
