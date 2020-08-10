package Db;

import java.sql.*;

public class DBConnection {

		public static Connection makeConnection() {
			// Connection 타입의 변수 con 선언
			Connection con = null;
			String user = "DB"; //접속할 DB계정
			String password = "1234"; //접속할 DB비번
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; //오라클이 가지고있는 주소값
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클 접속 명령 드라이버 로딩
				con = DriverManager.getConnection(url, user, password); //db 로그인
				System.out.println("DB 연결 성공");
				
			} catch (ClassNotFoundException e) {
				System.out.println("DB 드라이버 로딩 실패 "+e.toString());
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("DB 접속 실패 "+e.toString());
				e.printStackTrace();
			}
			
	  	    return con;
	}
	}
