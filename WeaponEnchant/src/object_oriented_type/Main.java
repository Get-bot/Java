package object_oriented_type;

import java.util.Scanner;

public class Main {

	  public static void main(String[] args) {
          Caltest ca = new Caltest(); //��ü���� ->������ȣ��
          Scanner sc = new Scanner(System.in);
          boolean run = true; 
  /*        System.out.println("------------------------------------------------------");
          System.out.println("| 1. ���� | 2. �E�� | 3.���� | 4.������ | 5.���� |");
          System.out.println("------------------------------------------------------");
          System.out.print("���� : ");
          ca.setselect(sc.nextInt());
          System.out.print("ù��° �����Է� : ");
          ca.setNum1(sc.nextInt());
          System.out.print("�ι�° �����Է� : ");
          ca.setNum2(sc.nextInt());
 */ 
          while(run) {
          System.out.println("------------------------------------------------------");
          System.out.println("| 1. ���� | 2. �E�� | 3.���� | 4.������ | 5.���� |");
          System.out.println("------------------------------------------------------");
          System.out.print("���� : ");
          ca.setselect(sc.nextInt());
          if(ca.getNum1()==0 || ca.getNum2()==0) {
        	    System.out.print("ù��° �����Է� : ");
                ca.setNum1(sc.nextInt());
        	    System.out.print("�ι�° �����Է� : ");
                ca.setNum2(sc.nextInt());
          }//��ĳ�� ���� set�޼��带 �̿��Ͽ� �Է�
          if(ca.getselect()==1) {
             System.out.println("�������"+ca.pls());
          }
          else if(ca.getselect()==2) {
             System.out.println("������"+ca.min());
          }
          else if(ca.getselect()==3) {
             System.out.println("�������"+ca.mul());
          }
          else if(ca.getselect()==4) {
             System.out.println("���������"+ca.div());
          }
          else if(ca.getselect()==5) {
        	  System.out.println("�����մϴ�");
        	  run = false;
          }
          else {
             System.out.println("�ùٸ� ��ȣ�� �Է����ּ���.");
          }
          //get�޼��� �̿��� �� �Է�
          

}
}
}

