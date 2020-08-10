package Weapon_Enchant;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int selectNum = 0;

		UserDTO user = null;
		UserDAO userDAO = new UserDAO();

		userDAO.dbConnection();
		System.out.println("무기 강화해서 인생역전을 노리기위해 사채업자에게 1,000,000 원을 빌리게되었다. ");
		System.out.println("어서 돈을 입금해 빚쟁이 신세를 벗어나자!!!!!! ");
		while (run) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|1.회원등록|2.회원정보수정|3.로그인|4.무기강화|5.회원정보확인");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("선택>> ");
			selectNum = sc.nextInt();
			switch (selectNum) {
			case 0:

				break;
			case 1: {

				System.out.print("이름: ");
				String uname = sc.next();
				System.out.print("아이디: ");
				String uid = sc.next();
				System.out.print("비밀번호: ");
				String upass = sc.next();
				user = new UserDTO();
				user.setUname(uname);
				user.setUid(uid);
				user.setUpass(upass);
				boolean result = userDAO.joinuser(user);
				if (result) {
					System.out.println("회원등록 성공");
				} else {
					System.out.println("회원등록 실패");
				}
				break;
			}
			case 2: {
				System.out.println(" ID : ");
				String uid = sc.next();
				System.out.println("PassWord : ");
				String upass = sc.next();
				user = new UserDTO();
				user.setUid(uid);
				user.setUpass(upass);
				boolean result = userDAO.userCheck(user);
				if (result) {
					System.out.println("회원확인 성공");
					System.out.println("-------------------------------------------");
					System.out.println("|1.PassWord변경|2.이름변경");
					System.out.println("-------------------------------------------");
					System.out.print("선택>> ");
					selectNum = sc.nextInt();
					if (selectNum == 1) {
						System.out.print("변경할 비밀번호 : ");
						String changePass = sc.next();
						user.setUpass(changePass);
						userDAO.passUpdate(user);
						System.out.println("비밀번호 변경완료");
					}
					if (selectNum == 2) {
						System.out.print("변경할 이름 : ");
						String changeName = sc.next();
						user.setUname(changeName);
						userDAO.nameUpdate(user);
						System.out.println("이름 변경완료");
					}

				} else {
					System.out.println("회원확인 실패");
				}
				break;
			}
			case 3: {
				System.out.print("아이디입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pass = sc.next();
				user = new UserDTO();
				user.setUid(id);
				user.setUpass(pass);
				boolean result = userDAO.userCheck(user); // 로그인 메소드 실행 후 result값 리턴
				if (result) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;
			}
			case 4: {
				System.out.print("ID입력 : ");
				String id1 = sc.next();
				user = new UserDTO();
				user.setUid(id1);
				boolean run1 = true;
				while (run1) {
					System.out.println("-------------------------------------------------------------------------------------");
					System.out.println("|1.무기 구매|2.무기 판매|3.무기 강화|4.무기 정보l5.입금|6.메뉴로돌아가기");
					System.out.println("-------------------------------------------------------------------------------------");
					userDAO.userState(user);
					System.out.print("선택>> ");
					selectNum = sc.nextInt();
					if (selectNum == 1) {
						userDAO.showWeapon();
						System.out.print("구매할무기 이름을 입력해주세요 : ");
						String weaponNum = sc.next();
						user.setWname(weaponNum); // 무기 이름설정
						boolean result = userDAO.buyMoney(user); // 로그인 메소드 실행 후 result값 리턴
						if (result) {
							userDAO.changeWeapon(user); // 무기 상태 교체
							System.out.println("구매 성공");
						} else {
							System.out.println("구매 실패");
						}
					} // 변수 소지금액 db에서 바뀌게
					else if (selectNum == 2) {
						userDAO.showWeapon();
						System.out.print("현재 보유하고있는 무기는");
						System.out.println(user.getWeaponsalename() + "입니다.");
						System.out.print("무기를 판매하시겠습니까  ( Y / N ): ");
						String select = sc.next();
						if (select.equals("Y") || select.equals("y")) {
							boolean result = userDAO.saleMoney(user); // 로그인 메소드 실행 후 result값 리턴
							if (result) {
								userDAO.changeSaleWeapon(user); // 무기 상태 교체
								System.out.println("판매 성공");
							} else {
								System.out.println("판매 실패");
							}
						} else {
							System.out.println("메뉴로 돌아갑니다.");
						}
					} else if (selectNum == 3) {
						boolean run2 = true;
						while (run2) {
							System.out.println("----------------------------");
							System.out.println("|1.강화 시작|2강화 종료|");
							System.out.println("----------------------------");
							userDAO.userState(user);
							System.out.println("강화 비용은 50원 입니다.");
							System.out.print("선택 >");
							int sel = sc.nextInt();
							if (sel == 1) {
								userDAO.reinforce(user);
							} else if (sel == 2) {
								run2 = false;
							}
						}
					} else if (selectNum == 4) {
						userDAO.showWeapon();
					} else if (selectNum == 5) {
						int bankmoney = 1000000;
						userDAO.userState(user);
						System.out.print("입금하실 금액을 입력해주세요 : ");
						int money = sc.nextInt();
						user.setMoney(money);
						boolean result = userDAO.bank(user);
						if (result) {
							userDAO.changeMoney(user); // UMONEY 상태 교체
							System.out.println("입금 완료");
							System.out.println("남은 대출금액 : " + (bankmoney - user.getBankm())+"원");
						} else {
							System.out.println("입금 실패");
						}if(bankmoney<=user.getBankm()) {
							System.out.println("축하합니다 모든금액을 변제하여 게임이종료됩니다.");
							System.out.println("당신의 운에 박수를 ~!!!");
							break;
					}
					} else if (selectNum == 6)
						run1 = false;
				}
				break;
			}

			case 5: {
				userDAO.userlog();
				break;
			}
			}
		}
	}
}
