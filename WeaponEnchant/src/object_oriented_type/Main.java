package object_oriented_type;

import java.util.Scanner;

public class Main {

	  public static void main(String[] args) {
          Caltest ca = new Caltest(); //객체생성 ->생성자호출
          Scanner sc = new Scanner(System.in);
          boolean run = true; 
  /*        System.out.println("------------------------------------------------------");
          System.out.println("| 1. 덧셈 | 2. 뺼셈 | 3.곱셈 | 4.나눗셈 | 5.종료 |");
          System.out.println("------------------------------------------------------");
          System.out.print("선택 : ");
          ca.setselect(sc.nextInt());
          System.out.print("첫번째 숫자입력 : ");
          ca.setNum1(sc.nextInt());
          System.out.print("두번째 숫자입력 : ");
          ca.setNum2(sc.nextInt());
 */ 
          while(run) {
          System.out.println("------------------------------------------------------");
          System.out.println("| 1. 덧셈 | 2. 뺼셈 | 3.곱셈 | 4.나눗셈 | 5.종료 |");
          System.out.println("------------------------------------------------------");
          System.out.print("선택 : ");
          ca.setselect(sc.nextInt());
          if(ca.getNum1()==0 || ca.getNum2()==0) {
        	    System.out.print("첫번째 숫자입력 : ");
                ca.setNum1(sc.nextInt());
        	    System.out.print("두번째 숫자입력 : ");
                ca.setNum2(sc.nextInt());
          }//스캐너 값을 set메서드를 이용하여 입력
          if(ca.getselect()==1) {
             System.out.println("덧셈결과"+ca.pls());
          }
          else if(ca.getselect()==2) {
             System.out.println("밸셈결과"+ca.min());
          }
          else if(ca.getselect()==3) {
             System.out.println("곱셈결과"+ca.mul());
          }
          else if(ca.getselect()==4) {
             System.out.println("나눗셈결과"+ca.div());
          }
          else if(ca.getselect()==5) {
        	  System.out.println("종료합니다");
        	  run = false;
          }
          else {
             System.out.println("올바른 번호를 입력해주세요.");
          }
          //get메서드 이용해 값 입력
          

}
}
}

