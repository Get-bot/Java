package Array;

import java.util.Scanner;

public class Array_App3 {

	public static void main(String[] args) {
		//ũ��� ���������� ù�����ڸ��� ��ġ����
		int[] num = {3,2,1,5,4,};
		int save = 0;
		for(int i= 0; i<num.length; i++) {
			for(int j =i+1; j<num.length; j++)
			 if(num[i]<num[j]) {
				 save = num[i];
				num[i]=num[j];
				num[j]=save;
			 }
		}
	for (int i = 0 ; i<num.length; i++)
	System.out.print(num[i]);
}
}

