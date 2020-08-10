package object_oriented_type_practice2;

public class StudentDTO {
	//DTO(Data Transfer Object) : �����͸� ��Ƽ� �����ϱ� ���� Ŭ����
	//������ �Ʒû� ������ ���� �ʵ�� ��� �ʵ带 �Ű������� �ϴ� �����ڸ� ����
	private String name;
	private int age;
	private String birth;
	private String mobileNumber;
	private String address;
	private boolean exp;
	private String phone;
	
	/*
	 * public ,private : ���������� 
	 * ��(��Ŭ����)�������ִ� 
	 * get,set �޼ҵ�
	 *  ��� ���� : �ʵ忡 ���� ������ �ƴ� �޼ҵ带 ���� ���� �����Ͽ� �ʵ尪������ ����
	 * get method : �ܺο��� �ʵ尪�� ������ �ҋ�
	 * set method : �ܺο��� �ʵ尪�� �����ϰ��� �Ҷ�
	 */
	//�⺻ ������
	public StudentDTO() {
		
	}
	//name �ʵ忡 ���� get, set �޼ҵ弱�� // this �������� �ʵ带����Ű�±���
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
	public String getPhone() {return phone;}//return�����ֱ�
	//���� Ŭ�����ȿ��ֱ⶧���� ��밡��
	
	
	
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
	


