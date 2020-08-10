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
        System.out.println("| 1. µ¡¼À | 2. –E¼À | 3.°ö¼À | 4.³ª´°¼À | 5.Á¾·á |");
        System.out.println("------------------------------------------------------");
        System.out.print("¼±ÅÃ : ");
        int selectNo =sc.nextInt();
        switch(selectNo) {
        case 1:{
        	num1 =5;
        	num2 =5;
        	ca.sum(num1,num2);
        }
        case 2:{
        	System.out.println("¼ıÀÚÀÔ·Â : ");
        	num1 =sc.nextInt();
           	System.out.println("¼ıÀÚÀÔ·Â : ");    	
        	num2 =sc.nextInt();
        	ca.sub(num1,num2);
        }
        case 3:{
           	System.out.println("¼ıÀÚÀÔ·Â : ");
        	num1 =sc.nextInt();
           	System.out.println("¼ıÀÚÀÔ·Â : ");    	
        	num2 =sc.nextInt();
        	int result = ca.multi(num1,num2);
        	System.out.println("°ö¼À°á°ú : "+result);
        }
        case 4:{
        	ca.divi();
        }
	}

}
}
}