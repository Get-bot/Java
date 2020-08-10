package test200731;

import java.sql.*;

public class MemberDAO {
	Connection con = null; // �����㰡 ������ ��� ����
	PreparedStatement pstmt = null; // ������ ������ ����ϴ� ����
	ResultSet rs = null; // SELECT ����� �����ϴ� ����
	
	// DB ���� �� �����㰡�� ���� �޼ҵ�
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
	
	// ȸ����� �޼ҵ�
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
			// ���ϰ� Ȯ�� ���� INSERT ����
//			pstmt.executeUpdate();
			// ���ϰ� Ȯ���ؼ� ����, ���� �Ǵ�
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
	

	//�������� �޼ҵ�
	public boolean UpdateMember(MemberDTO member) {
		String sql = "UPDATE ICIAMEMBER SET MADDRESS = ? WHERE MNUMBER = ? " ;
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // ���ǹ����� �ۼ��޴�.
			pstmt.setString(1 ,member.getMaddress());;
			pstmt.setInt(2 ,member.getMnumber()); //���� ����ǥ�� �´� �ڸ� 1~2 �� ���Է�
			int result = pstmt.executeUpdate();//�������� ����
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
	//���� �޼ҵ�
	public boolean DeleteMember(MemberDTO member) {
		String sql = " DELETE FROM ICIAMEMBER WHERE MNUMBER = ? ";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // ���ǹ����� �ۼ��޴�.
			pstmt.setInt(1 ,member.getMnumber()); //���� ����ǥ�� �´� �ڸ� 1~2 �� ���Է�
			int result = pstmt.executeUpdate();//�������� ����
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