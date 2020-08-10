package object_oriented_type_practice;

public class Student {
	//교육원 훈련생 정보를 담을 필드와 모든 필드를 매개변수로 하는 생성자를 선언
	String name;
	int age;
	String birth;
	String mobileNumber;
	String address;
	boolean exp;
	String phone;
	
	Student(){
		
	}
	
	public Student(String name, int age,String birth, String mobileNumber, String address, boolean exp) {
		super();
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.exp = exp;
	}

	public Student(String name, String address,String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}


	}
	


