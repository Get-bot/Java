package object_oriented_type_practice2;

import java.util.*;

public class ArrayList_Ex {

	public static void main(String[] args) {
		/*
		 * ArrayList, set, map
		 *  -ArrayList 크기 지정이 따로없음 넣는데로 계속 넣어짐
		 *  -index 번호를가지고 입출력
		 *  -클래스이름과 같으면 혼동함
		 */
		// Numbers 라는 이름의 ArrayList 선언
		List<Integer> numbers = new ArrayList<Integer>();
		//<> : Generic
		//타입 변환을 하지 않고도 해당 타입을 사용할 수 있게 해줌
		List<String> strs = new ArrayList<String>();
		//numbers 에 값 저장
		numbers.add(10);//numbers 에 10저장
		int num = 100;
		numbers.add(num);
		numbers.add(500);
		numbers.add(1, 99);// 해당 인덱스에 끼워넣기
		numbers.add(1, 999);// 해당위치에넣고 나머지는 뒤로밀려남
		//전체 데이터 삭제 : numbers.clear(); ,
		//numbers.remove(2)-해당 index위치를 지우고 뒤의숫자를떙김
		//출력
		System.out.println(numbers.get(0));//get(index number)
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(3));
//		System.out.println(numbers.get(4));//오류 (들어간 값의수가 배열의크기를 결정하기때문) 공간없음
		//ArrayList 크기 출력
		System.out.println(numbers.size());
		//for문 이용해 ArrayList에 담긴 데이터 출력
		for(int i=0; i<numbers.size(); i++) {
			System.out.println("Index"+i+" : "+numbers.get(i));
		}
		strs.add("가가가가");
		System.out.println(strs.get(0));
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		StudentDTO stu = new StudentDTO();
		stu.setName("회원1");
		stu.setAddress("인천");
		stu.setPhone("010-5855-4989"); //하나로 묶임
		
		StudentDTO stu1 = new StudentDTO();
		stu1.setName("회원2");
		stu1.setAddress("인천");
		stu1.setPhone("010-2222-2222"); //하나로 묶임
		
		
		stuList.add(stu);// Index(0) = stu
		stuList.add(stu1);
//		System.out.println(stuList.get(0)); 이런식으로 사용할경우 Index 주소 값이나옴 object_oriented_type_practice2.StudentDTO@15db9742
		System.out.println(stuList.get(0).getName());//필드값으로 변환
		System.out.println(stuList.get(1).getName());//필드값으로 변환
		
		for(int i=0 ; i<stuList.size(); i++) {
			System.out.println("전체출력 : "+stuList.get(i));
			System.out.println("이름만 출력 : "+stuList.get(i).getName());
	}
	}
}
