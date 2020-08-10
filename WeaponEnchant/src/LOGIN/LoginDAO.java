package LOGIN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//ȸ�� �������
public class LoginDAO {
	Connection con = null; // �����㰡 ������ ��� ����
	PreparedStatement pstmt = null; // ������ ������ ����ϴ� ����
	ResultSet rs = null; // SELECT ����� �����ϴ� ����
	
	// DB ���� �� �����㰡�� ���� �޼ҵ�
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
	
	// ȸ����� �޼ҵ�
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
	

	//�α��� �޼ҵ�
	public boolean Login(LoginDTO login) {
		boolean insertResult = false;
		try {
			String sql ="select U_PASS,U_ID from LOGIN where U_ID = ?"; // login���̺��� id, pass ��ȸ id���´�
		    pstmt =con.prepareStatement(sql); // id ���´� pass�ҷ�����
		    pstmt.setString(1,login.getId()); // ������ id �� ��� �÷� ȣ��
			rs=pstmt.executeQuery();  //���� ����
			if(rs.next())  {
				String upass = rs.getString("U_PASS"); //  �ҷ��� u_pass�÷��� ���� upass ������
				if(upass.equals(login.getPass())) // upass �� ��ĵ���� ��й�ȣ�� ��ġ�ϴ��� ��ȸ
				insertResult = true; // ��ġ�ҽ� insertResult ���� true �κ���
			} else {
				insertResult = false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertResult; // ������
}

	public boolean LogCheck(String id) {
		boolean insertResult = false;
		try {
			String sql ="select * from LOGIN where U_ID = ?"; // login���̺��� id, ��ȸ id���´�
		    pstmt =con.prepareStatement(sql); // id ���´� id�ҷ�����
		    pstmt.setString(1,id); // ������ id �� �´� id �÷� ȣ��
			rs=pstmt.executeQuery();  //���� ����
			if(rs.next())  {
				insertResult = true; // ��ġ�ҽ� insertResult ���� true �κ���
			} else {
				insertResult = false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertResult; // ������
}
	
}