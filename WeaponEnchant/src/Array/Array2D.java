package Array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		    String[][] str = {{"chair","의자"},{"desk","책상"},{"water","물"},{"pencil","연필"},{"watch","시계"}};
		    Scanner scan = new Scanner(System.in);
		    double result = 0;
		    String input = null;

		    for(int i=0;i<str.length;i++) {
		        System.out.print("문제"+(i+1)+". "+str[i][0]+"의 뜻은 무엇인가요? ");
		        input = scan.nextLine();

		            if (str[i][1].equals(input)) {
		                result++;
		                System.out.println("정답입니다.");
		            } else {
		                System.out.println("틀렸습니다.");
		                System.out.println("정답은 "+str[i][1]+"입니다.");
		            }
		    }
		    System.out.println("총 "+result+"개 정답입니다.");
		    System.out.println("정답률은 "+(result/str.length*100)+"% 입니다.");
		    scan.close();
		}
}