package Board;

import java.sql.*;

public class BoardDAO {
	Connection con = null; // �����㰡 ������ ��� ����
	PreparedStatement pstmt = null; // ������ ������ ����ϴ� ����
	PreparedStatement pstmt1 = null; // ������ ������ ����ϴ� ����
	ResultSet rs = null; // SELECT ����� �����ϴ� ����

	// DB ���� �� �����㰡�� ���� �޼ҵ�
	public void dbConnection() {
		con = connection.makeConnection();
	}

	// ����ü��ȸ
	public void selectAll() {
		String sql = "SELECT * FROM BOARD";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("�۹�ȣ : " + rs.getInt("BNUMBER"));
				System.out.println("�ۼ��� : " + rs.getString("BWRITER"));
				System.out.println("������ : " + rs.getString("BSUBJECT"));
				System.out.println("�۳��� : " + rs.getString("BCONTENTS"));
				System.out.println("�ۼ��� : " + rs.getString("BDATE"));
				System.out.println("��ȸ�� : " + rs.getString("BHITS"));
				System.out.println("-----------------------------------------");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �۵�� �޼ҵ�
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
			// ���ϰ� Ȯ�� ���� INSERT ����
//			pstmt.executeUpdate();
			// ���ϰ� Ȯ���ؼ� ����, ���� �Ǵ�
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

	// �� ��ȣ�� ��ȸ or �޼ҵ带 �ΰ����� ��ȸ���ø��°Ͱ� ����ҷ����°��� �и�
	public boolean Finding(int bnumber) {
		String sql = " SELECT BCONTENTS FROM BOARD WHERE BNUMBER = ? ";
		String sql1 = " UPDATE BOARD SET BHITS = BHITS + 1 WHERE BNUMBER = ? ";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // ���ǹ����� �ۼ��޴�.
			pstmt.setInt(1, bnumber); // ���� ����ǥ�� �´� �ڸ� 1~2 �� ���Է�
			pstmt.executeUpdate();// �������� ����
			pstmt1 = con.prepareStatement(sql1); // ���ǹ����� �ۼ��޴�.
			pstmt1.setInt(1, bnumber);
			pstmt1.executeUpdate();// �������� ����
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("�۳��� : " + rs.getString("BCONTENTS"));
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

	// ��ȸ���� �۸�� �޼ҵ�
	public void Findinghits() {
		String sql = " SELECT BHITS,BCONTENTS FROM BOARD ORDER BY BHITS DESC ";
		try {
			pstmt = con.prepareStatement(sql);// ������ �Է�
			pstmt.executeUpdate();// �������� ����
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("��ȸ�� : " + rs.getString("BHITS") + " / �۳��� : " + rs.getString("BCONTENTS"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���� �޼ҵ�
	public boolean Delete(BoardDTO board) {
		String sql = " DELETE  FROM BOARD WHERE BNUMBER = ? ";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // ���ǹ����� �ۼ��޴�.
			pstmt.setInt(1, board.getBnumber()); // ���� ����ǥ�� �´� �ڸ� 1~2 �� ���Է�
			int result = pstmt.executeUpdate();// �������� ����
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

	// �������� �޼ҵ�
	public boolean Update(BoardDTO board) {
		String sql = "UPDATE BOARD SET BCONTENTS = ? WHERE BNUMBER = ? ";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // ���ǹ����� �ۼ��޴�.
			pstmt.setString(1, board.getBcontents());
			;
			pstmt.setInt(2, board.getBnumber()); // ���� ����ǥ�� �´� �ڸ� 1~2 �� ���Է�
			int result = pstmt.executeUpdate();// �������� ����
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