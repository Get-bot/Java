package Db;

public class CustomerDTO {
	//custid, name, address, phone 필드 생성한 후
	// 각 필드에 대한 getter,setter,
	// 모든 필드를 매개변수로하는 생성자,기본생성자,toString 메소드 선언
	
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
