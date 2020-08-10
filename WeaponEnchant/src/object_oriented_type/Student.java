package object_oriented_type;

public class Student {
	String name = "»ç¶÷1";
	int age;
	String mobileNumber;
	String address;
	boolean exp;
	
	Student(String name, int age, String mobileNumber, String address) {
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	
	
	
	public Student(String name, int age, String mobileNumber, String address, boolean exp) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.exp = exp;
	}



	Student() {
		
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", exp=" + exp + "]";
	}
	
	
	

}
