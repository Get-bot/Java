package object_oriented_type;

import java.util.Scanner;

public class CarMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car1 car = new Car1(5);
		System.out.println("������ �������ּ���");
		int gas = sc.nextInt();
//		car.setGas(5);
		car.setGas(gas);
		boolean gasState = car.isLeftGas();
		System.out.println(car.gas);
		if(gasState) {
			System.out.println("���");
			car.run();
		}

	}

}
