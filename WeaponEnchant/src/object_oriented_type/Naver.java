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
	
	// �⺻ ������ ����
	Naver(){
		System.out.println("�⺻ ������ ȣ��");
	
	}

	public Naver(String user, String iD, String password, String passwordCheck, String name, String birth, String gender,
			String eforID, String phone) {
		super();
		System.out.println("�Ű����� �ִ� ������ ȣ��");
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

//�޼ҵ�
	@Override//annotation �ּ�
	public String toString() {
		return "Naver [User=" + User + ", ID=" + ID + ", Password=" + Password + ", PasswordCheck=" + PasswordCheck
				+ ", name=" + name + ", birth=" + birth + ", gender=" + gender + ", EforID=" + EforID + ", Phone="
				+ Phone + "]";
	}




	}
	
	
	


