package object_oriented_type_practice2;

import java.util.*;

public class ArrayList_Ex {

	public static void main(String[] args) {
		/*
		 * ArrayList, set, map
		 *  -ArrayList ũ�� ������ ���ξ��� �ִµ��� ��� �־���
		 *  -index ��ȣ�������� �����
		 *  -Ŭ�����̸��� ������ ȥ����
		 */
		// Numbers ��� �̸��� ArrayList ����
		List<Integer> numbers = new ArrayList<Integer>();
		//<> : Generic
		//Ÿ�� ��ȯ�� ���� �ʰ� �ش� Ÿ���� ����� �� �ְ� ����
		List<String> strs = new ArrayList<String>();
		//numbers �� �� ����
		numbers.add(10);//numbers �� 10����
		int num = 100;
		numbers.add(num);
		numbers.add(500);
		numbers.add(1, 99);// �ش� �ε����� �����ֱ�
		numbers.add(1, 999);// �ش���ġ���ְ� �������� �ڷιз���
		//��ü ������ ���� : numbers.clear(); ,
		//numbers.remove(2)-�ش� index��ġ�� ����� ���Ǽ��ڸ�����
		//���
		System.out.println(numbers.get(0));//get(index number)
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(3));
//		System.out.println(numbers.get(4));//���� (�� ���Ǽ��� �迭��ũ�⸦ �����ϱ⶧��) ��������
		//ArrayList ũ�� ���
		System.out.println(numbers.size());
		//for�� �̿��� ArrayList�� ��� ������ ���
		for(int i=0; i<numbers.size(); i++) {
			System.out.println("Index"+i+" : "+numbers.get(i));
		}
		strs.add("��������");
		System.out.println(strs.get(0));
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		StudentDTO stu = new StudentDTO();
		stu.setName("ȸ��1");
		stu.setAddress("��õ");
		stu.setPhone("010-5855-4989"); //�ϳ��� ����
		
		StudentDTO stu1 = new StudentDTO();
		stu1.setName("ȸ��2");
		stu1.setAddress("��õ");
		stu1.setPhone("010-2222-2222"); //�ϳ��� ����
		
		
		stuList.add(stu);// Index(0) = stu
		stuList.add(stu1);
//		System.out.println(stuList.get(0)); �̷������� ����Ұ�� Index �ּ� ���̳��� object_oriented_type_practice2.StudentDTO@15db9742
		System.out.println(stuList.get(0).getName());//�ʵ尪���� ��ȯ
		System.out.println(stuList.get(1).getName());//�ʵ尪���� ��ȯ
		
		for(int i=0 ; i<stuList.size(); i++) {
			System.out.println("��ü��� : "+stuList.get(i));
			System.out.println("�̸��� ��� : "+stuList.get(i).getName());
	}
	}
}
