package Weapon_Enchant;

// import java.sql.Date;

public class UserDTO {
	// 유저
	private String uid; // 회원 id
	private String upass; // 회원 비번
	private String uname; // 회원 이름
	private String wname; // 무기 이름
	// 무기판매구매
	private int money;// 소지금
	private int reinmoney;// 강화금액
	private int resultm; // 금액저장
	private String weaponsalename;// 판매할무기 이름
	private int per;// 강화확륙
	private int wnum;// 무기넘버
	private String wsetw;// 무기상태
	// 은행
	private int bank;// 은행
	private int bankm;// 뱅크머니

	UserDTO() {

	}

	public UserDTO(String uid, String upass, String uname, String wname, int money, int reinmoney, int resultm,
			String weaponsalename, int per, int wnum, String wsetw, int bank, int bankm) {
		super();
		this.uid = uid;
		this.upass = upass;
		this.uname = uname;
		this.wname = wname;
		this.money = money;
		this.reinmoney = reinmoney;
		this.resultm = resultm;
		this.weaponsalename = weaponsalename;
		this.per = per;
		this.wnum = wnum;
		this.wsetw = wsetw;
		this.bank = bank;
		this.bankm = bankm;

	}

	public String getUid() {
		return uid;
	}

	public String getUpass() {
		return upass;
	}

	public String getUname() {
		return uname;
	}

	public String getWname() {
		return wname;
	}

	public int getMoney() {
		return money;
	}

	public int getReinmoney() {
		return reinmoney;
	}

	public int getResultm() {
		return resultm;
	}

	public String getWeaponsalename() {
		return weaponsalename;
	}

	public int getPer() {
		return per;
	}

	public int getWnum() {
		return wnum;
	}

	public String getWsetw() {
		return wsetw;
	}

	public int getBank() {
		return bank;
	}

	public int getBankm() {
		return bankm;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setReinmoney(int reinmoney) {
		this.reinmoney = reinmoney;
	}

	public void setResultm(int resultm) {
		this.resultm = resultm;
	}

	public void setWeaponsalename(String weaponsalename) {
		this.weaponsalename = weaponsalename;
	}

	public void setPer(int per) {
		this.per = per;
	}

	public void setWnum(int wnum) {
		this.wnum = wnum;
	}

	public void setWsetw(String wsetw) {
		this.wsetw = wsetw;
	}

	public void setBank(int bank) {
		this.bank = bank;
	}

	public void setBankm(int bankm) {
		this.bankm = bankm;
	}

	@Override
	public String toString() {
		return "UserDTO [uid=" + uid + ", upass=" + upass + ", uname=" + uname + ", wname=" + wname + ", money=" + money
				+ ", reinmoney=" + reinmoney + ", resultm=" + resultm + ", weaponsalename=" + weaponsalename + ", per="
				+ per + ", wnum=" + wnum + ", wsetw=" + wsetw + ", bank=" + bank + ", bankm=" + bankm + "]";
	}

}
