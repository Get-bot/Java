package Db;

public class CustomerDTO {
	//custid, name, address, phone �ʵ� ������ ��
	// �� �ʵ忡 ���� getter,setter,
	// ��� �ʵ带 �Ű��������ϴ� ������,�⺻������,toString �޼ҵ� ����
	
	private int custid;
	private String name;
	private String address;
	private String phone;
	
	CustomerDTO(){
		
	}

	//get
		public int getCustid() {return custid;}
		public String getName() {return name;}
		public String getAddress() {return address;}
		public String getPhone() {	return phone;}
	//set
		public void setCustid(int custid) {this.custid = custid;}
		public void setName(String name) {this.name = name;}
		public void setAddress(String address) {this.address = address;}
		public void setPhone(String phone) {this.phone = phone;}
		
	@Override
	public String toString() {
		return "CustomerDTO [custid=" + custid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}



	
}
