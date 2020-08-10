package test200731;

import java.sql.*;

public class MemberDAO {
	Connection con = null; // 접속허가 정보를 담는 변수
	PreparedStatement pstmt = null; // 쿼리문 전송을 담당하는 변수
	ResultSet rs = null; // SELECT 결과를 저장하는 변수
	
	// DB 접속 및 접속허가를 위한 메소드
	public void dbConnection() {
		con = DBConnection.makeConnection();
	}
	
	public void selectAll() {
		String sql = "SELECT * FROM ICIAMEMBER";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("MNUMBER"));
				System.out.println(rs.getString("MNAME"));
				System.out.println(rs.getString("MADDRESS"));
				System.out.println(rs.getString("MPHONE"));
				System.out.println(rs.getString("MBIRTH"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 회원등록 메소드
	public boolean joinMember(MemberDTO member) {
		String sql = "INSERT INTO ICIAMEMBER(MNUMBER, MNAME, MADDRESS, MPHONE, MBIRTH)"
				+ "VALUES(SEQ_ICIA.NEXTVAL, ?, ?, ?,TO_DATE(?, 'YYYY-MM-DD'))";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMname());
			pstmt.setString(2, member.getMaddress());
			pstmt.setString(3, member.getMphone());
			pstmt.setString(4, member.getMbirth());
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
	

	//정보수정 메소드
	public boolean UpdateMember(MemberDTO member) {
		String sql = "UPDATE ICIAMEMBER SET MADDRESS = ? WHERE MNUMBER = ? " ;
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // 위의문장을 작성햇다.
			pstmt.setString(1 ,member.getMaddress());;
			pstmt.setInt(2 ,member.getMnumber()); //위의 물음표에 맞는 자리 1~2 에 값입력
			int result = pstmt.executeUpdate();//쿼리문을 실행
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
	//삭제 메소드
	public boolean DeleteMember(MemberDTO member) {
		String sql = " DELETE FROM ICIAMEMBER WHERE MNUMBER = ? ";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // 위의문장을 작성햇다.
			pstmt.setInt(1 ,member.getMnumber()); //위의 물음표에 맞는 자리 1~2 에 값입력
			int result = pstmt.executeUpdate();//쿼리문을 실행
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
}