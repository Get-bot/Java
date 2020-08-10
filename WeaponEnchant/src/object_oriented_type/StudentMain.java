package object_oriented_type;

public class StudentMain {

	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.age = 24;
		stud1.mobileNumber = "001";
		stud1.address = "incheon";
		stud1.exp = false;
		System.out.println(stud1.name);
		System.out.println(stud1.age);
		System.out.println(stud1.mobileNumber);
		System.out.println(stud1.address);
		System.out.println(stud1.toString());
		
		Student stud2 = new Student();
		stud2.name = "사람2";
		stud2.age = 26;
		stud2.mobileNumber = "002";
		stud2.address = "incheon";
		System.out.println(stud2.name);
		System.out.println(stud2.age);
		System.out.println(stud2.mobileNumber);
		System.out.println(stud2.address);
		
		Student stud3 = new Student();
		stud3.name = "사람3";
		stud3.age = 29;
		stud3.mobileNumber = "003";
		stud3.address = "incheon";
		System.out.println(stud3.name);
		System.out.println(stud3.age);
		System.out.println(stud3.mobileNumber);
		System.out.println(stud3.address);
		
		// 매개변수가 있는  생성자를 이용한 객체 생성
		Student stud4 = new Student("사람4", 22, "004", "인천", false);
		System.out.println(stud4.name);
		System.out.println(stud4.age);
		System.out.println(stud4.mobileNumber);
		System.out.println(stud4.address);
		System.out.println(stud4.toString());
		

	}

}
