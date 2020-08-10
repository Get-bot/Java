package LOGIN;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int selectNum = 0;
		
		LoginDTO login = null;
		
		LoginDAO LoginDAO = new LoginDAO();
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("0.DB 접속|1.회원가입|2.로그인|3.회원천체정보|4.아이디중복체크");
			System.out.println("----------------------------");
			System.out.println("선택>> ");
			selectNum = sc.nextInt();
			switch(selectNum) {
			case 0:
				 LoginDAO.dbConnection();
				break;
			case 1:{
				System.out.print("ID: ");
				String ID = sc.next();
				System.out.print("PassWord: ");
				String PassWord = sc.next();
				System.out.print("Name: ");
				String Name = sc.next();
				System.out.print("Phone : ");
				String Phone = sc.next();
				System.out.print("Age : ");
				String Age = sc.next();
				login = new LoginDTO();
				login.setId(ID);
				login.setPass(PassWord);
				login.setName(Name);
				login.setPhone(Phone);
				login.setAge(Age);
				boolean result = LoginDAO.joinLogin(login);
				if(result) {
					System.out.println("회원등록 성공");
				} else {
					System.out.println("회원등록 실패");
				}
				break;}
			case 2:{
				System.out.print("아이디입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pass = sc.next();
				login = new LoginDTO();
				login.setId(id);
				login.setPass(pass);
				boolean result = LoginDAO.Login(login); // 로그인 메소드 실행 후 result값 리턴
				if(result) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;}
			case 3:{
				LoginDAO.selectAll();
				break;}
			case 4:{
				System.out.print("아이디입력 : ");
				String id = sc.next();
				boolean result = LoginDAO.LogCheck(id); // 체크 메소드 실행 후 result값 리턴받음
				if(result) {
					System.out.println("사용중인 ID입니다.");
				} else {
					System.out.println("사용하실수있는 ID입니다.");
				}
			}
			}
			}
		}
}


