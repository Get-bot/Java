package Array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		    String[][] str = {{"chair","����"},{"desk","å��"},{"water","��"},{"pencil","����"},{"watch","�ð�"}};
		    Scanner scan = new Scanner(System.in);
		    double result = 0;
		    String input = null;

		    for(int i=0;i<str.length;i++) {
		        System.out.print("����"+(i+1)+". "+str[i][0]+"�� ���� �����ΰ���? ");
		        input = scan.nextLine();

		            if (str[i][1].equals(input)) {
		                result++;
		                System.out.println("�����Դϴ�.");
		            } else {
		                System.out.println("Ʋ�Ƚ��ϴ�.");
		                System.out.println("������ "+str[i][1]+"�Դϴ�.");
		            }
		    }
		    System.out.println("�� "+result+"�� �����Դϴ�.");
		    System.out.println("������� "+(result/str.length*100)+"% �Դϴ�.");
		    scan.close();
		}
}