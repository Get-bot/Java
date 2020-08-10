package object_oriented_type
;

public class Naver{
	String User = "User1";
	String ID;
	String Password;
	String PasswordCheck;
	String name;
	String birth;
	String gender;
	String EforID;
	String Phone;
	
	// 기본 생성자 선언
	Naver(){
		System.out.println("기본 생성자 호출");
	
	}

	public Naver(String user, String iD, String password, String passwordCheck, String name, String birth, String gender,
			String eforID, String phone) {
		super();
		System.out.println("매개변수 있는 생성자 호출");
		User = user;
		ID = iD;
		Password = password;
		PasswordCheck = passwordCheck;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		EforID = eforID;
		Phone = phone;
	}

//메소드
	@Override//annotation 주석
	public String toString() {
		return "Naver [User=" + User + ", ID=" + ID + ", Password=" + Password + ", PasswordCheck=" + PasswordCheck
				+ ", name=" + name + ", birth=" + birth + ", gender=" + gender + ", EforID=" + EforID + ", Phone="
				+ Phone + "]";
	}




	}
	
	
	


