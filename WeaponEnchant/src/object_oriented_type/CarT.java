package object_oriented_type;

import java.util.Scanner;

public class CarT {
	Scanner sc=new Scanner(System.in);
void sum (int num1,int num2) {
	System.out.println("µ¡¼ÀÀº : "+num1+num2);
}	
void sub (int num1 , int num2) {
    int result = num1 - num2;
    System.out.println("»¬¼À°á°ú : "+ result);
}
int multi (int num1, int num2) {
	int result = num1*num2;
	return result;
}
void divi() {
  	System.out.println("¼ıÀÚÀÔ·Â : ");
	int num1 =sc.nextInt();
   	System.out.println("¼ıÀÚÀÔ·Â : ");    	
	int num2 =sc.nextInt();
	int result = num1/num2;
	System.out.println("³ª´°¼À°á°ú : "+result);
}
}
