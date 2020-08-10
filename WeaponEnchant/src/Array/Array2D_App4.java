package Array;

import java.util.Scanner;

public class Array2D_App4 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		double count = 0;
		double average = 0;
		String [][] str = {{"chair","의자"},
							{"desk","책상"},
							{"water","물"},
							{"pencil","연필"},
							{"watch","시계"}};
		String input ="";	
		for(int i=0; i<str.length;i++) {
			for(int j=0; j<str[1].length; j++ ) {
				System.out.print("문제"+(i+1)+"."+str[i][j]+"의 뜻은 무엇인가요? ");
				input = sc.nextLine();
				if(str[i][j].equals(input)) {
					System.out.println("정답입니다.");
					count++;
				}else{
					System.out.println("틀렸습니다.");
					System.out.println("정답은" +str[i][j]+"입니다.");
				}											
		}
		average=(count/str.length)*100;
		System.out.println("총"+count+"개 정답입니다.");
		System.out.println("정답률은"+average+"% 입니다.");
		sc.close();
}


}
}
