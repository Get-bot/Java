package LOGIN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//회원 정보출력
public class LoginDAO {
	Connection con = null; // 접속허가 정보를 담는 변수
	PreparedStatement pstmt = null; // 쿼리문 전송을 담당하는 변수
	ResultSet rs = null; // SELECT 결과를 저장하는 변수
	
	// DB 접속 및 접속허가를 위한 메소드
	public void dbConnection() {
		con = connection.makeConnection();
	}
	
	public void selectAll() {
		String sql = "SELECT * FROM LOGIN";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("ID : "+rs.getString("U_ID"));
				System.out.println("Pass : "+rs.getString("U_PASS"));
				System.out.println("Name : "+ rs.getString("U_NAME"));
				System.out.println("Phone : " +rs.getString("U_PHONE"));
				System.out.println("Age : " +rs.getString("U_AGE"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 회원등록 메소드
	public boolean joinLogin(LoginDTO login) {
		String sql = "INSERT INTO LOGIN (U_ID,U_PASS, U_NAME,U_PHONE,U_AGE)"
				+ "VALUES(?, ?, ?, ?, ?)";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, login.getId());
			pstmt.setString(2, login.getPass());
			pstmt.setString(3, login.getName());
			pstmt.setString(4, login.getPhone());
			pstmt.setString(5, login.getAge());
			// 리턴값 확인 없이 INSERT 수행
//			pstmt.executeUpdate();
			// 리턴값 확인해서 성공, 실패 판단
			int result = pstmt.executeUpdate();
			if(result>0) {
				insertResult = true;
			} else {
				insertResult = false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertResult;
	}
	

	//로그인 메소드
	public boolean Login(LoginDTO login) {
		boolean insertResult = false;
		try {
			String sql ="select U_PASS,U_ID from LOGIN where U_ID = ?"; // login테이블에서 id, pass 조회 id에맞는
		    pstmt =con.prepareStatement(sql); // id 에맞는 pass불러오기
		    pstmt.setString(1,login.getId()); // 설정한 id 에 비번 컬럼 호출
			rs=pstmt.executeQuery();  //쿼리 실행
			if(rs.next())  {
				String upass = rs.getString("U_PASS"); //  불러온 u_pass컬럼의 값을 upass 에저장
				if(upass.equals(login.getPass())) // upass 와 스캔받은 비밀번호가 일치하는지 조회
				insertResult = true; // 일치할시 insertResult 값을 true 로변경
			} else {
				insertResult = false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertResult; // 값리턴
}

	public boolean LogCheck(String id) {
		boolean insertResult = false;
		try {
			String sql ="select * from LOGIN where U_ID = ?"; // login테이블에서 id, 조회 id에맞는
		    pstmt =con.prepareStatement(sql); // id 에맞는 id불러오기
		    pstmt.setString(1,id); // 설정한 id 에 맞는 id 컬럼 호출
			rs=pstmt.executeQuery();  //쿼리 실행
			if(rs.next())  {
				insertResult = true; // 일치할시 insertResult 값을 true 로변경
			} else {
				insertResult = false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertResult; // 값리턴
}
	
}