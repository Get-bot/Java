package Array;

import java.util.Scanner;

public class Array_App5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		int countMoney[] = { 500, 100, 50, 10 };
		int changeCount = 0;
		for (int i = 0; i < countMoney.length; i++) {
			if (money >= countMoney[i]) {
				changeCount = money / countMoney[i];
				money = money % countMoney[i];

			}
			System.out.println(countMoney[i] + "원 동전 : " + changeCount + "개");
		}
		
	}

}
