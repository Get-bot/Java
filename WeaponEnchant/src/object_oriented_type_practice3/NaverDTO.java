package object_oriented_type_practice3;

public class NaverDTO {
	private	String ID;
	private	String Password;
	private	String PasswordCheck;
	private	String Name;
	private	String Birth;
	private	String Gender;
	private	String EforID;
	private	String Phone;
	private	int SelectNo;
		
		// 기본 생성자 선언
		NaverDTO(){
		}
		
		public NaverDTO( String iD, String password, String passwordCheck, String name, String birth,
				String gender, String eforID, String phone, int selectno) {
			super();
			this.ID = iD;
			this.Password = password;
			this.PasswordCheck = passwordCheck;
			this.Name = name;
			this.Birth = birth;
			this.Gender = gender;
			this.EforID = eforID;
			this.Phone = phone;
			this.SelectNo = selectno;
		}

		//Set 부분
		public void setID(String iD) {ID = iD;}
		public void setPassword(String password) {Password = password;}
		public void setPasswordCheck(String passwordCheck) {PasswordCheck = passwordCheck;}
		public void setName(String name) {Name = name;}
		public void setBirth(String birth) {Birth = birth;}
		public void setGender(String gender) {Gender = gender;}
		public void setEforID(String eforID) {EforID = eforID;}
		public void setPhone(String phone) {Phone = phone;}
		public void setSelectNo(int selectno) {SelectNo = selectno;}
		
	
		
		//get 부분
		public String getID() {return ID;}
		public String getPassword() {return Password;}
		public String getPasswordCheck() {return PasswordCheck;}
		public String getName() {return Name;}
		public String getBirth() {return Birth;}
		public String getGender() {return Gender;}
		public String getEforID() {return EforID;	}
		public String getPhone() {return Phone;}
		public int getSelectNo() {return SelectNo;}

		@Override
		public String toString() {
			return "NaverDTO [ID=" + ID + ", Password=" + Password + ", PasswordCheck="
					+ PasswordCheck + ", Name=" + Name + ", Birth=" + Birth + ", Gender=" + Gender + ", EforID="
					+ EforID + ", Phone=" + Phone + "]";
		}

}
