package Db;

import java.sql.*;

public class DBConnection {

		public static Connection makeConnection() {
			// Connection Ÿ���� ���� con ����
			Connection con = null;
			String user = "DB"; //������ DB����
			String password = "1234"; //������ DB���
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; //����Ŭ�� �������ִ� �ּҰ�
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); //����Ŭ ���� ��� ����̹� �ε�
				con = DriverManager.getConnection(url, user, password); //db �α���
				System.out.println("DB ���� ����");
				
			} catch (ClassNotFoundException e) {
				System.out.println("DB ����̹� �ε� ���� "+e.toString());
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("DB ���� ���� "+e.toString());
				e.printStackTrace();
			}
			
	  	    return con;
	}
	}
