package Board;

import java.sql.*;

public class BoardDAO {
	Connection con = null; // 접속허가 정보를 담는 변수
	PreparedStatement pstmt = null; // 쿼리문 전송을 담당하는 변수
	PreparedStatement pstmt1 = null; // 쿼리문 전송을 담당하는 변수
	ResultSet rs = null; // SELECT 결과를 저장하는 변수

	// DB 접속 및 접속허가를 위한 메소드
	public void dbConnection() {
		con = connection.makeConnection();
	}

	// 글전체조회
	public void selectAll() {
		String sql = "SELECT * FROM BOARD";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("글번호 : " + rs.getInt("BNUMBER"));
				System.out.println("작성자 : " + rs.getString("BWRITER"));
				System.out.println("글제목 : " + rs.getString("BSUBJECT"));
				System.out.println("글내용 : " + rs.getString("BCONTENTS"));
				System.out.println("작성일 : " + rs.getString("BDATE"));
				System.out.println("조회수 : " + rs.getString("BHITS"));
				System.out.println("-----------------------------------------");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 글등록 메소드
	public boolean Write(BoardDTO board) {
		String sql = "INSERT INTO BOARD(BNUMBER, BWRITER, BSUBJECT, BCONTENTS, BDATE, BHITS)"
				+ "VALUES(SEQ_BNUMBER.NEXTVAL, ?, ?, ?,TO_DATE(SYSDATE, 'YYYY-MM-DD'),?)";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getBwriter());
			pstmt.setString(2, board.getBsubject());
			pstmt.setString(3, board.getBcontents());
			pstmt.setInt(4, 0);
			// 리턴값 확인 없이 INSERT 수행
//			pstmt.executeUpdate();
			// 리턴값 확인해서 성공, 실패 판단
			int result = pstmt.executeUpdate();
			if (result > 0) {
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

	// 글 번호로 조회 or 메소드를 두개만들어서 조회수올리는것과 내용불러오는것을 분리
	public boolean Finding(int bnumber) {
		String sql = " SELECT BCONTENTS FROM BOARD WHERE BNUMBER = ? ";
		String sql1 = " UPDATE BOARD SET BHITS = BHITS + 1 WHERE BNUMBER = ? ";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // 위의문장을 작성햇다.
			pstmt.setInt(1, bnumber); // 위의 물음표에 맞는 자리 1~2 에 값입력
			pstmt.executeUpdate();// 쿼리문을 실행
			pstmt1 = con.prepareStatement(sql1); // 위의문장을 작성햇다.
			pstmt1.setInt(1, bnumber);
			pstmt1.executeUpdate();// 쿼리문을 실행
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("글내용 : " + rs.getString("BCONTENTS"));
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

	// 조회수별 글목록 메소드
	public void Findinghits() {
		String sql = " SELECT BHITS,BCONTENTS FROM BOARD ORDER BY BHITS DESC ";
		try {
			pstmt = con.prepareStatement(sql);// 쿼리문 입력
			pstmt.executeUpdate();// 쿼리문을 실행
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("조회수 : " + rs.getString("BHITS") + " / 글내용 : " + rs.getString("BCONTENTS"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 삭제 메소드
	public boolean Delete(BoardDTO board) {
		String sql = " DELETE  FROM BOARD WHERE BNUMBER = ? ";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // 위의문장을 작성햇다.
			pstmt.setInt(1, board.getBnumber()); // 위의 물음표에 맞는 자리 1~2 에 값입력
			int result = pstmt.executeUpdate();// 쿼리문을 실행
			if (result > 0) {
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

	// 정보수정 메소드
	public boolean Update(BoardDTO board) {
		String sql = "UPDATE BOARD SET BCONTENTS = ? WHERE BNUMBER = ? ";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // 위의문장을 작성햇다.
			pstmt.setString(1, board.getBcontents());
			;
			pstmt.setInt(2, board.getBnumber()); // 위의 물음표에 맞는 자리 1~2 에 값입력
			int result = pstmt.executeUpdate();// 쿼리문을 실행
			if (result > 0) {
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