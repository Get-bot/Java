package Array;

import java.util.Scanner;

public class Array2D_App4 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		double count = 0;
		double average = 0;
		String [][] str = {{"chair","����"},
							{"desk","å��"},
							{"water","��"},
							{"pencil","����"},
							{"watch","�ð�"}};
		String input ="";	
		for(int i=0; i<str.length;i++) {
			for(int j=0; j<str[1].length; j++ ) {
				System.out.print("����"+(i+1)+"."+str[i][j]+"�� ���� �����ΰ���? ");
				input = sc.nextLine();
				if(str[i][j].equals(input)) {
					System.out.println("�����Դϴ�.");
					count++;
				}else{
					System.out.println("Ʋ�Ƚ��ϴ�.");
					System.out.println("������" +str[i][j]+"�Դϴ�.");
				}											
		}
		average=(count/str.length)*100;
		System.out.println("��"+count+"�� �����Դϴ�.");
		System.out.println("�������"+average+"% �Դϴ�.");
		sc.close();
}


}
}
