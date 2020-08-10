package object_oriented_type_practice2;

public class StudentDTO {
	//DTO(Data Transfer Object) : 데이터를 담아서 전달하기 위한 클래스
	//교육원 훈련생 정보를 담을 필드와 모든 필드를 매개변수로 하는 생성자를 선언
	private String name;
	private int age;
	private String birth;
	private String mobileNumber;
	private String address;
	private boolean exp;
	private String phone;
	
	/*
	 * public ,private : 접근제한자 
	 * 나(이클래스)만쓸수있는 
	 * get,set 메소드
	 *  사용 이유 : 필드에 직접 접근이 아닌 메소드를 통한 간접 접근하여 필드값지정및 수정
	 * get method : 외부에서 필드값을 쓰고자 할떄
	 * set method : 외부에서 필드값을 설정하고자 할때
	 */
	//기본 생성자
	public StudentDTO() {
		
	}
	//name 필드에 대한 get, set 메소드선언 // this 가붙으면 필드를가리키는구나
	public void setName(String data) {	this.name = data;}
	public void setAge(int data) {	this.age = data;}
	public void setBirth(String data) {	this.birth = data;}
	public void setMobileNumber(String data) {	this.mobileNumber = data;}
	public void setAddress(String data) {	this.address = data;}
	public void setExp(boolean data) {	this.exp = data;}
	public void setPhone(String data) {	this.phone = data;}
	
	//get
	public String getName() {return name;}
	public int getAge() {return age;}
	public String getBirth() {return birth ;}
	public String getMobileNumber() {	return mobileNumber;}
	public String getAddress() {	return address;}
	public boolean getExp() {	return exp;}
	public String getPhone() {return phone;}//return시켜주기
	//같은 클래스안에있기때문에 사용가능
	
	
	
	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", age=" + age + ", birth=" + birth + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + ", exp=" + exp + ", phone=" + phone + "]";
	}
	
	public StudentDTO(String name, int age, String birth, String mobileNumber, String address, boolean exp,
			String phone) {
		super();
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.exp = exp;
		this.phone = phone;
	}
}
	


