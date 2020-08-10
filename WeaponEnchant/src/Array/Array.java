package Array;

public class Array {

	public static void main(String[] args) {
		// 정수형 배열변수 성언
		int[] num;
		int num1 [];
		//배열 선언하면서 초기값 절정
		int num2 [] = {1, 2, 3, 4};
		
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2]);
		System.out.println(num2[3]);
		// String 타입 배열을 선언하여 같은 줄에 앉은 4명의 이름을 저장하고 풀력
		
		String[] name = {"철수" ,"영희" ,"두진 "," 범진"};
		name[3]="칼바람";
		String n ="";
 		 n ="카타";
			name [2] = n;
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		//배열의 크기 값 활용
		System.out.println(name.length);
		//
		
		String[] str = {"철수","영희","두진","범진"};
		
		for(int i = 0 ; i<str.length; i++) {
			System.out.println(str[i]);
		}
		int[] num3 = new int[4];
		System.out.println(num3.length);
		for(int i = 0; i<num3.length; i++) {
			System.out.println(num3[i]);
		}
		
		
		
		
		}
}



