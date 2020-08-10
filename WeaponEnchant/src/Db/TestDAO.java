package Db;

import java.sql.*;

public class TestDAO {
//Data Access Object
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	 // DB 접속 메서드
	public void dbConnection() {
		//makeConnetion 은 static 메소드 이기떄문에 클래스를통해 직접 접근가능
		con = DBConnection.makeConnection();
	}
	//CUSTOMER table full lookup method
	public void selectAll() {
		//실행할 쿼리문을 미리 변수로 선언
		String sql = "SELECT * FROM CUSTOMER";
		
		try {
			// Connection 클래스에서 제공하는
			//prepareStatement 메소드 활용하여 쿼리문 전송준비
			pstmt = con.prepareStatement(sql);
			//쿼리문 실행하여 실행 결과를 rs에 저장
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("CUSTID"));
				System.out.println(rs.getString("NAME"));
				System.out.println(rs.getString("ADDRESS"));
				System.out.println(rs.getString("PHONE"));
				
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertCustomer(CustomerDTO customerDTO) {
		String sql = "INSERT INTO CUSTOMER(CUSTID,NAME,ADDRESS,PHONE)" + "VALUES(SEQ_CUSTID.NEXTVAL,?,?,?)"; // VALUES 는 물음표 로 처리
		try {
			pstmt = con.prepareStatement(sql);
			//pstmt.setInt(1, 10);// (?의순서 몇번째물음표값 쓸지 , 10) 입력받은값 세팅
			pstmt.setString(1, customerDTO.getName());
			pstmt.setString(2, customerDTO.getAddress());
			pstmt.setString(3, customerDTO.getPhone());
			pstmt.executeUpdate();//업데이트 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
