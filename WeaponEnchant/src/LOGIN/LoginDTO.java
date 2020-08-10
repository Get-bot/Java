package LOGIN;

public class LoginDTO {
	private String id;
	private String pass;
	private String name;
	private String phone;
	private String age;
	
	LoginDTO(){		
	}

 //get
	public String getId() {return id;}
	public String getPass() {return pass;}
	public String getName() {return name;}
	public String getPhone() {return phone;}
	public String getAge() {return age;}

//set
	
	public void setId(String id) {this.id = id;}
	public void setPass(String pass) {this.pass = pass;}
	public void setName(String name) {this.name = name;}
	public void setPhone(String phone) {this.phone = phone;}
	public void setAge(String age) {this.age = age;}
	
	@Override
	public String toString() {
		return "LoginDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
}





