package object_oriented_type_practice;

public class Student {
	//������ �Ʒû� ������ ���� �ʵ�� ��� �ʵ带 �Ű������� �ϴ� �����ڸ� ����
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
	


