package Weapon_Enchant;

import java.sql.*;

public class UserDAO {
	Connection con = null; // 접속허가 정보를 담는 변수
	PreparedStatement pstmt = null; // 쿼리문 전송을 담당하는 변수
	PreparedStatement pstmt1 = null; // 쿼리문 전송을 담당하는 변수
	PreparedStatement pstmt2 = null; // 쿼리문 전송을 담당하는 변수
	ResultSet rs = null; // SELECT 결과를 저장하는 변수
	ResultSet rs1 = null;
	ResultSet rs2 = null;

	UserDAO userDAO = null;

	// DB 접속 및 접속허가를 위한 메소드
	public void dbConnection() {
		con = DBConnection.makeConnection();
	}

	// DB에서 회원 정보불러오기
	public void userState(UserDTO user) {
		String sql = " SELECT * FROM WUSER U , WEAPON W  WHERE W.WNAME = U.WNAME AND USID = ? ";
		try {
			pstmt = con.prepareStatement(sql);// 쿼리문 입력
			pstmt.setString(1, user.getUid());
			pstmt.executeUpdate();// 쿼리문을 실행
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("  이    름   : " + rs.getString("UNAME"));
				System.out.println("소지한무기 : " + rs.getString("WNAME"));
				System.out.println("소지한금액 : " + rs.getString("UMONEY"));
				user.setWeaponsalename(rs.getString("WNAME"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 회원등록 메소드
	public boolean joinuser(UserDTO user) {
		String sql = "INSERT INTO WUSER (USID, UPASS, UNAME, WNAME, UMONEY, UBANK)"
				+ "VALUES(?, ?, ?, '검' , 10000, 0 )";
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

	// ID,PassWord 확인 메소드 로그인
	public boolean userCheck(UserDTO user) {
		boolean insertResult = false;
		try {
			String sql = "select UPASS,USID from WUSER where USID = ?"; // login테이블에서 id, 조회 id에맞는
			pstmt = con.prepareStatement(sql); // id 에맞는 id불러오기
			pstmt.setString(1, user.getUid()); // 설정한 id 에 맞는 id 컬럼 호출
			pstmt.executeUpdate();
			rs = pstmt.executeQuery(); // 쿼리 실행
			if (rs.next()) {
				if (rs.getString("UPASS").equals(user.getUpass()))
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
	// 회원정보 수정 메소드

	// PassWord수정
	public void passUpdate(UserDTO user) {
		String sql = "UPDATE WUSER SET UPASS = ? WHERE USID = ? ";
		try {
			pstmt = con.prepareStatement(sql); // 위의문장을 작성햇다.
			pstmt.setString(1, user.getUpass());
			pstmt.setString(2, user.getUid()); // 위의 물음표에 맞는 자리 1~2 에 값입력
			pstmt.executeUpdate();// 쿼리문을 실행

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Name수정
	public boolean nameUpdate(UserDTO user) {
		String sql = "UPDATE WUSER SET UNAME = ? WHERE USID = ? ";
		boolean insertResult = false;
		try {
			pstmt = con.prepareStatement(sql); // 위의문장을 작성햇다.
			pstmt.setString(1, user.getUname());
			pstmt.setString(2, user.getUid()); // 위의 물음표에 맞는 자리 1~2 에 값입력
			pstmt.executeUpdate();
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

	// DB에서 가입한 회원 정보불러오기
	public void userlog() {
		String sql = " SELECT * FROM WUSER U , WEAPON W  WHERE W.WNAME = U.WNAME ";
		try {
			pstmt = con.prepareStatement(sql);// 쿼리문 입력
			// pstmt.setString(1, user.getUid());
			// pstmt.executeUpdate();// 쿼리문을 실행
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("이름   : " + rs.getString("UNAME"));
				System.out.println("아이디 : " + rs.getString("USID"));
				System.out.println("비밀번호 : " + rs.getString("UPASS"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 무기 목록
	public void showWeapon() {
		String sql = "SELECT * FROM WEAPON";
		try {
			pstmt = con.prepareStatement(sql);
			// pstmt.executeUpdate();
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("WNUM") + "강" + "\t");
				System.out.print("이름 : " + rs.getString("WNAME") + "\t");
				System.out.print("가격 : " + rs.getInt("WPRICE") + "\t");
				System.out.print("판매가 : " + rs.getInt("WSALEPRICE") + "\t");
				System.out.println("강화확률 : " + rs.getInt("WPER") + "%" + "\t");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//-----------------------------------------------------------------------------------------------------------------------------무기구매
	// 무기구매 //뷰를 만들거나 조인
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

//무기구매 돈지급
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
					insertResult = true; // 일치할시 insertResult 값을 true 로변경
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

//구매한 무기 메소드 구매하고자하는 무기의 가격저장
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
//-----------------------------------------------------------------------------------------------------------------------------무기판매

	// 무기판매 판매후 기본장비 검으로 변환
	public void changeSaleWeapon(UserDTO user) {
		String sql = "UPDATE WUSER  SET WNAME = '검' WHERE USID = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//무기판매 돈지급
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
				insertResult = true; // 일치할시 insertResult 값을 true 로변경
			} else {
				insertResult = false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertResult;
	}

//구매한 무기 메소드 구매하고자하는 무기의 가격저장
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

//---------------------------------------------------------------------------------무기강화
	// 강화후 성공시 변환
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

	// 강화하기 강화할 무기 불러온후 - 유저가 가지고있는 돈-강화비- 한후 그값 db에저장-
	// 강화확률따오고- 랜덤함수로 비교한다음에 성공시에는
	// 유저가 가지고있는 돈-강화비 한후 그값 db에저장
	public void reinforce(UserDTO user) {
		reinweapon(user); // 유저 무기이름 확률 불러옴
		cost(user);// 강화비용 50원감소;
		if (Random() <= user.getPer()) {
			up(user);
			System.out.println("강화 성공");
		} else {
			down(user);
			System.out.println("강화 실패");
		}
	}

	// 업그레이드 후 무기 성공시
	public void up(UserDTO user) {
		String sql = " SELECT WNAME FROM WEAPON WHERE WNUM = (?+1) ";
		String sql1 = " UPDATE WUSER SET WNAME = ? WHERE USID = ? ";
		try {
			pstmt = con.prepareStatement(sql); // 위의문장을 작성햇다.
			pstmt.setInt(1, user.getWnum()); // 위의 물음표에 맞는 자리 1~2 에 값입력
			// pstmt.executeUpdate();// 쿼리문을 실행
			rs = pstmt.executeQuery();
			if (rs.next()) {
				pstmt1 = con.prepareStatement(sql1); // 위의문장을 작성햇다.
				pstmt1.setString(1, rs.getNString("WNAME"));
				pstmt1.setString(2, user.getUid());
				pstmt1.executeUpdate();// 쿼리문을 실행
				// user.setWsetw(rs.getString("WNAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 업그레이드 후 무기 실패시
	public void down(UserDTO user) {
		String sql = " SELECT WNAME FROM WEAPON WHERE WNUM = (?-1) ";
		String sql1 = " UPDATE WUSER SET WNAME = ? WHERE USID = ? ";
		try {
			pstmt = con.prepareStatement(sql); // 위의문장을 작성햇다.
			pstmt.setInt(1, user.getWnum()); // 위의 물음표에 맞는 자리 1~2 에 값입력
			// pstmt.executeUpdate();// 쿼리문을 실행
			rs = pstmt.executeQuery();
			if (rs.next()) {
				pstmt1 = con.prepareStatement(sql1); // 위의문장을 작성햇다.
				pstmt1.setString(1, rs.getNString("WNAME"));
				pstmt1.setString(2, user.getUid());
				pstmt1.executeUpdate();// 쿼리문을 실행
				// user.setWsetw(rs.getString("WNAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//업그레이드할 무기 셀렉  그무기의 확률 유저의 무기넘버 로드 --*
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

//랜덤
	public int Random() {
		int ran = (int) (Math.random() * 100) + 1;
		return ran;
	}

	// 비용 감소--*
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
					System.out.println("소지금이 모자랍니다.");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//-----------------------Clear 메소드
	// UMONEY칼럼 잔액수정
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

	// 돈을 UBANK컬럼에 넣어준다
	public boolean bank(UserDTO user) {
		boolean insertResult = false;
		int result = 0;
		String sql = "UPDATE WUSER  SET UBANK = ? WHERE USID = ?  "; // 뱅크칼럼에 업데이트
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
				insertResult = true; // 일치할시 insertResult 값을 true 로변경
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
