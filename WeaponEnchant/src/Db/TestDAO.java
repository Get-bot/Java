package Db;

import java.sql.*;

public class TestDAO {
//Data Access Object
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	 // DB ���� �޼���
	public void dbConnection() {
		//makeConnetion �� static �޼ҵ� �̱⋚���� Ŭ���������� ���� ���ٰ���
		con = DBConnection.makeConnection();
	}
	//CUSTOMER table full lookup method
	public void selectAll() {
		//������ �������� �̸� ������ ����
		String sql = "SELECT * FROM CUSTOMER";
		
		try {
			// Connection Ŭ�������� �����ϴ�
			//prepareStatement �޼ҵ� Ȱ���Ͽ� ������ �����غ�
			pstmt = con.prepareStatement(sql);
			//������ �����Ͽ� ���� ����� rs�� ����
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
		String sql = "INSERT INTO CUSTOMER(CUSTID,NAME,ADDRESS,PHONE)" + "VALUES(SEQ_CUSTID.NEXTVAL,?,?,?)"; // VALUES �� ����ǥ �� ó��
		try {
			pstmt = con.prepareStatement(sql);
			//pstmt.setInt(1, 10);// (?�Ǽ��� ���°����ǥ�� ���� , 10) �Է¹����� ����
			pstmt.setString(1, customerDTO.getName());
			pstmt.setString(2, customerDTO.getAddress());
			pstmt.setString(3, customerDTO.getPhone());
			pstmt.executeUpdate();//������Ʈ 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
