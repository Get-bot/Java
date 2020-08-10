package Weapon_Enchant;

import java.sql.*;

public class UserDAO {
	Connection con = null; // �����㰡 ������ ��� ����
	PreparedStatement pstmt = null; // ������ ������ ����ϴ� ����
	PreparedStatement pstmt1 = null; // ������ ������ ����ϴ� ����
	PreparedStatement pstmt2 = null; // ������ ������ ����ϴ� ����
	ResultSet rs = null; // SELECT ����� �����ϴ� ����
	ResultSet rs1 = null;
	ResultSet rs2 = null;

	UserDAO userDAO = null;

	// DB ���� �� �����㰡�� ���� �޼ҵ�
	public void dbConnection() {
		con = DBConnection.makeConnection();
	}

	// DB���� ȸ�� �����ҷ�����
	public void userState(UserDTO user) {
		String sql = " SELECT * FROM WUSER U , WEAPON W  WHERE W.WNAME = U.WNAME AND USID = ? ";
		try {
			pstmt = con.prepareStatement(sql);// ������ �Է�
			pstmt.setString(1, user.getUid());
			pstmt.executeUpdate();// �������� ����
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("  ��    ��   : " + rs.getString("UNAME"));
				System.out.println("�����ѹ��� : " + rs.getString("WNAME"));
				System.out.println("�����ѱݾ� : " + rs.getString("UMONEY"));
				user.setWeaponsalename(rs.getString("WNAME"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ȸ����� �޼ҵ�
	public boolean joinuser(UserDTO user) {
		String sql = "INSERT INTO WUSER (USID, UPASS, UNAME, WNAME, UMONEY, UBANK)"
				+ "VALUES(?, ?, ?, '��' , 10000, 0 )";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getUpass());
			pstmt.setString(3, user.getUname());
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

	// ID,PassWord Ȯ�� �޼ҵ� �α���
	public boolean userCheck(UserDTO user) {
		boolean insertResult = false;
		try {
			String sql = "select UPASS,USID from WUSER where USID = ?"; // login���̺��� id, ��ȸ id���´�
			pstmt = con.prepareStatement(sql); // id ���´� id�ҷ�����
			pstmt.setString(1, user.getUid()); // ������ id �� �´� id �÷� ȣ��
			pstmt.executeUpdate();
			rs = pstmt.executeQuery(); // ���� ����
			if (rs.next()) {
				if (rs.getString("UPASS").equals(user.getUpass()))
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
	// ȸ������ ���� �޼ҵ�

	// PassWord����
	public void passUpdate(UserDTO user) {
		String sql = "UPDATE WUSER SET UPASS = ? WHERE USID = ? ";
		try {
			pstmt = con.prepareStatement(sql); // ���ǹ����� �ۼ��޴�.
			pstmt.setString(1, user.getUpass());
			pstmt.setString(2, user.getUid()); // ���� ����ǥ�� �´� �ڸ� 1~2 �� ���Է�
			pstmt.executeUpdate();// �������� ����

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Name����
	public boolean nameUpdate(UserDTO user) {
		String sql = "UPDATE WUSER SET UNAME = ? WHERE USID = ? ";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // ���ǹ����� �ۼ��޴�.
			pstmt.setString(1, user.getUname());
			pstmt.setString(2, user.getUid()); // ���� ����ǥ�� �´� �ڸ� 1~2 �� ���Է�
			pstmt.executeUpdate();
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

	// DB���� ������ ȸ�� �����ҷ�����
	public void userlog() {
		String sql = " SELECT * FROM WUSER U , WEAPON W  WHERE W.WNAME = U.WNAME ";
		try {
			pstmt = con.prepareStatement(sql);// ������ �Է�
			// pstmt.setString(1, user.getUid());
			// pstmt.executeUpdate();// �������� ����
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("�̸�   : " + rs.getString("UNAME"));
				System.out.println("���̵� : " + rs.getString("USID"));
				System.out.println("��й�ȣ : " + rs.getString("UPASS"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���� ���
	public void showWeapon() {
		String sql = "SELECT * FROM WEAPON";
		try {
			pstmt = con.prepareStatement(sql);
			// pstmt.executeUpdate();
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("WNUM") + "��" + "\t");
				System.out.print("�̸� : " + rs.getString("WNAME") + "\t");
				System.out.print("���� : " + rs.getInt("WPRICE") + "\t");
				System.out.print("�ǸŰ� : " + rs.getInt("WSALEPRICE") + "\t");
				System.out.println("��ȭȮ�� : " + rs.getInt("WPER") + "%" + "\t");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//-----------------------------------------------------------------------------------------------------------------------------���ⱸ��
	// ���ⱸ�� //�並 ����ų� ����
	public void changeWeapon(UserDTO user) {
		String sql = "UPDATE WUSER  SET WNAME = ? WHERE USID = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(2, user.getUid());
			pstmt.setString(1, user.getWname());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//���ⱸ�� ������
	public boolean buyMoney(UserDTO user) {
		boolean insertResult = false;
		buymoney(user);
		int result = 0;
		String sql = "UPDATE WUSER  SET UMONEY = ? WHERE USID = ?  ";
		String sql1 = "SELECT * FROM WUSER WHERE USID = ? ";
		try {
			pstmt1 = con.prepareStatement(sql1);
			pstmt1.setString(1, user.getUid());
			// pstmt1.executeUpdate();
			rs = pstmt1.executeQuery();
			if (rs.next()) {
				int m = rs.getInt("UMONEY");
				result = m - user.getMoney();
				if (m >= user.getMoney()) {
					pstmt = con.prepareStatement(sql);
					pstmt.setString(2, user.getUid());
					pstmt.setInt(1, result);
					pstmt.executeUpdate();
					insertResult = true; // ��ġ�ҽ� insertResult ���� true �κ���
				} else {
					insertResult = false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertResult;
	}

//������ ���� �޼ҵ� �����ϰ����ϴ� ������ ��������
	public void buymoney(UserDTO user) {
		String sql = "SELECT WPRICE FROM WEAPON WHERE WNAME = ?  ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getWname());
			// pstmt.executeUpdate();
			rs = pstmt.executeQuery();
			if (rs.next())
				user.setMoney(rs.getInt("WPRICE"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
//-----------------------------------------------------------------------------------------------------------------------------�����Ǹ�

	// �����Ǹ� �Ǹ��� �⺻��� ������ ��ȯ
	public void changeSaleWeapon(UserDTO user) {
		String sql = "UPDATE WUSER  SET WNAME = '��' WHERE USID = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//�����Ǹ� ������
	public boolean saleMoney(UserDTO user) {
		boolean insertResult = false;
		salemoney(user);
		int result = 0;
		String sql = "UPDATE WUSER  SET UMONEY = ? WHERE USID = ?  ";
		String sql1 = "SELECT * FROM WUSER WHERE USID = ? ";
		try {
			pstmt1 = con.prepareStatement(sql1);
			pstmt1.setString(1, user.getUid());
			// pstmt1.executeUpdate();
			rs = pstmt1.executeQuery();
			if (rs.next()) {
				int m = rs.getInt("UMONEY");
				result = m + user.getMoney();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(2, user.getUid());
				pstmt.setInt(1, result);
				pstmt.executeUpdate();
				insertResult = true; // ��ġ�ҽ� insertResult ���� true �κ���
			} else {
				insertResult = false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertResult;
	}

//������ ���� �޼ҵ� �����ϰ����ϴ� ������ ��������
	public void salemoney(UserDTO user) {
		String sql = "SELECT WSALEPRICE FROM WEAPON WHERE WNAME = ?  ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getWeaponsalename());
			// pstmt.executeUpdate();
			rs = pstmt.executeQuery();
			if (rs.next())
				user.setMoney(rs.getInt("WSALEPRICE"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//---------------------------------------------------------------------------------���Ⱝȭ
	// ��ȭ�� ������ ��ȯ
	public void changereinWeapon(UserDTO user) {
		String sql = "UPDATE WUSER  SET WNAME = ? WHERE USID = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(2, user.getUid());
			pstmt.setString(2, user.getUid());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ��ȭ�ϱ� ��ȭ�� ���� �ҷ����� - ������ �������ִ� ��-��ȭ��- ���� �װ� db������-
	// ��ȭȮ��������- �����Լ��� ���Ѵ����� �����ÿ���
	// ������ �������ִ� ��-��ȭ�� ���� �װ� db������
	public void reinforce(UserDTO user) {
		reinweapon(user); // ���� �����̸� Ȯ�� �ҷ���
		cost(user);// ��ȭ��� 50������;
		if (Random() <= user.getPer()) {
			up(user);
			System.out.println("��ȭ ����");
		} else {
			down(user);
			System.out.println("��ȭ ����");
		}
	}

	// ���׷��̵� �� ���� ������
	public void up(UserDTO user) {
		String sql = " SELECT WNAME FROM WEAPON WHERE WNUM = (?+1) ";
		String sql1 = " UPDATE WUSER SET WNAME = ? WHERE USID = ? ";
		try {
			pstmt = con.prepareStatement(sql); // ���ǹ����� �ۼ��޴�.
			pstmt.setInt(1, user.getWnum()); // ���� ����ǥ�� �´� �ڸ� 1~2 �� ���Է�
			// pstmt.executeUpdate();// �������� ����
			rs = pstmt.executeQuery();
			if (rs.next()) {
				pstmt1 = con.prepareStatement(sql1); // ���ǹ����� �ۼ��޴�.
				pstmt1.setString(1, rs.getNString("WNAME"));
				pstmt1.setString(2, user.getUid());
				pstmt1.executeUpdate();// �������� ����
				// user.setWsetw(rs.getString("WNAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���׷��̵� �� ���� ���н�
	public void down(UserDTO user) {
		String sql = " SELECT WNAME FROM WEAPON WHERE WNUM = (?-1) ";
		String sql1 = " UPDATE WUSER SET WNAME = ? WHERE USID = ? ";
		try {
			pstmt = con.prepareStatement(sql); // ���ǹ����� �ۼ��޴�.
			pstmt.setInt(1, user.getWnum()); // ���� ����ǥ�� �´� �ڸ� 1~2 �� ���Է�
			// pstmt.executeUpdate();// �������� ����
			rs = pstmt.executeQuery();
			if (rs.next()) {
				pstmt1 = con.prepareStatement(sql1); // ���ǹ����� �ۼ��޴�.
				pstmt1.setString(1, rs.getNString("WNAME"));
				pstmt1.setString(2, user.getUid());
				pstmt1.executeUpdate();// �������� ����
				// user.setWsetw(rs.getString("WNAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//���׷��̵��� ���� ����  �׹����� Ȯ�� ������ ����ѹ� �ε� --*
	public void reinweapon(UserDTO user) {
		String sql = "SELECT U.WNAME,W.WPER,W.WNUM FROM WUSER U,WEAPON W WHERE U.WNAME=W.WNAME AND USID = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			// pstmt.executeUpdate();
			rs = pstmt.executeQuery();
			if (rs.next())
				user.setWname(rs.getString("WNAME"));
			user.setPer(rs.getInt("WPER"));
			user.setWnum(rs.getInt("WNUM"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//����
	public int Random() {
		int ran = (int) (Math.random() * 100) + 1;
		return ran;
	}

	// ��� ����--*
	public void cost(UserDTO user) {
		int result = 0;
		String sql = "UPDATE WUSER  SET UMONEY = ? WHERE USID = ?  ";
		String sql1 = "SELECT * FROM WUSER WHERE USID = ? ";
		try {
			pstmt1 = con.prepareStatement(sql1);
			pstmt1.setString(1, user.getUid());
			// pstmt1.executeUpdate();
			rs = pstmt1.executeQuery();
			if (rs.next()) {
				int m = rs.getInt("UMONEY");
				if (50 <= rs.getInt("UMONEY")) {
					result = m - 50;
					pstmt = con.prepareStatement(sql);
					pstmt.setString(2, user.getUid());
					pstmt.setInt(1, result);
					pstmt.executeUpdate();
				} else {
					System.out.println("�������� ���ڶ��ϴ�.");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//-----------------------Clear �޼ҵ�
	// UMONEYĮ�� �ܾ׼���
	public void changeMoney(UserDTO user) {

		String sql = "UPDATE WUSER  SET UMONEY = ? WHERE USID = ?  ";
		String sql1 = "SELECT * FROM WUSER WHERE USID = ? ";
		try {
			pstmt1 = con.prepareStatement(sql1);
			pstmt1.setString(1, user.getUid());
			// pstmt1.executeUpdate();
			rs = pstmt1.executeQuery();
			if (rs.next()) {
				int m = user.getMoney();
				int result = rs.getInt("UMONEY") - m;
				pstmt = con.prepareStatement(sql);
				pstmt.setString(2, user.getUid());
				pstmt.setInt(1, result);
				pstmt.executeUpdate();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���� UBANK�÷��� �־��ش�
	public boolean bank(UserDTO user) {
		boolean insertResult = false;
		int result = 0;
		String sql = "UPDATE WUSER  SET UBANK = ? WHERE USID = ?  "; // ��ũĮ���� ������Ʈ
		String sql1 = "SELECT * FROM WUSER WHERE USID = ? ";
		try {
			pstmt1 = con.prepareStatement(sql1);
			pstmt1.setString(1, user.getUid());
			// pstmt1.executeUpdate();
			rs = pstmt1.executeQuery();
			if (rs.next()) {
				int m = rs.getInt("UBANK");
				result = m + user.getMoney();
				if (user.getMoney() <= rs.getInt("UMONEY"))
					pstmt = con.prepareStatement(sql);
				pstmt.setString(2, user.getUid());
				pstmt.setInt(1, result);
				pstmt.executeUpdate();
				user.setBankm(rs.getInt("UBANK"));
				insertResult = true; // ��ġ�ҽ� insertResult ���� true �κ���
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
