package Board_practice3;

public class BoardDTO {
	//필드
	private String Board;
	private String Password;
	private String PassCheck;
	private int SelectNo;
	//기본생성자
BoardDTO(){
	
}


//set
public void setBoard(String board) {Board = board;}
public void setPassword(String password) {Password = password;}
public void setPassCheck(String passCheck) {PassCheck = passCheck;}
public void setSelectNo(int selectno) {SelectNo = selectno;}

//get
public String getBoard() {return Board;}
public String getPassword() {	return Password;}
public String getPassCheck() {return PassCheck;}
public int getSelectNo() {return SelectNo;}


@Override
public String toString() {
	return "BoardDTO [Board=" + Board + ", Password=" + Password + ", PassCheck=" + PassCheck
			+ ", SelectNo=" + SelectNo + "]";
}


}