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
		System.out.println("���� ��ȭ�ؼ� �λ������� �븮������ ��ä���ڿ��� 1,000,000 ���� �����ԵǾ���. ");
		System.out.println("� ���� �Ա��� ������ �ż��� �����!!!!!! ");
		while (run) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|1.ȸ�����|2.ȸ����������|3.�α���|4.���Ⱝȭ|5.ȸ������Ȯ��");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("����>> ");
			selectNum = sc.nextInt();
			switch (selectNum) {
			case 0:

				break;
			case 1: {

				System.out.print("�̸�: ");
				String uname = sc.next();
				System.out.print("���̵�: ");
				String uid = sc.next();
				System.out.print("��й�ȣ: ");
				String upass = sc.next();
				user = new UserDTO();
				user.setUname(uname);
				user.setUid(uid);
				user.setUpass(upass);
				boolean result = userDAO.joinuser(user);
				if (result) {
					System.out.println("ȸ����� ����");
				} else {
					System.out.println("ȸ����� ����");
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
					System.out.println("ȸ��Ȯ�� ����");
					System.out.println("-------------------------------------------");
					System.out.println("|1.PassWord����|2.�̸�����");
					System.out.println("-------------------------------------------");
					System.out.print("����>> ");
					selectNum = sc.nextInt();
					if (selectNum == 1) {
						System.out.print("������ ��й�ȣ : ");
						String changePass = sc.next();
						user.setUpass(changePass);
						userDAO.passUpdate(user);
						System.out.println("��й�ȣ ����Ϸ�");
					}
					if (selectNum == 2) {
						System.out.print("������ �̸� : ");
						String changeName = sc.next();
						user.setUname(changeName);
						userDAO.nameUpdate(user);
						System.out.println("�̸� ����Ϸ�");
					}

				} else {
					System.out.println("ȸ��Ȯ�� ����");
				}
				break;
			}
			case 3: {
				System.out.print("���̵��Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pass = sc.next();
				user = new UserDTO();
				user.setUid(id);
				user.setUpass(pass);
				boolean result = userDAO.userCheck(user); // �α��� �޼ҵ� ���� �� result�� ����
				if (result) {
					System.out.println("�α��� ����");
				} else {
					System.out.println("�α��� ����");
				}
				break;
			}
			case 4: {
				System.out.print("ID�Է� : ");
				String id1 = sc.next();
				user = new UserDTO();
				user.setUid(id1);
				boolean run1 = true;
				while (run1) {
					System.out.println("-------------------------------------------------------------------------------------");
					System.out.println("|1.���� ����|2.���� �Ǹ�|3.���� ��ȭ|4.���� ����l5.�Ա�|6.�޴��ε��ư���");
					System.out.println("-------------------------------------------------------------------------------------");
					userDAO.userState(user);
					System.out.print("����>> ");
					selectNum = sc.nextInt();
					if (selectNum == 1) {
						userDAO.showWeapon();
						System.out.print("�����ҹ��� �̸��� �Է����ּ��� : ");
						String weaponNum = sc.next();
						user.setWname(weaponNum); // ���� �̸�����
						boolean result = userDAO.buyMoney(user); // �α��� �޼ҵ� ���� �� result�� ����
						if (result) {
							userDAO.changeWeapon(user); // ���� ���� ��ü
							System.out.println("���� ����");
						} else {
							System.out.println("���� ����");
						}
					} // ���� �����ݾ� db���� �ٲ��
					else if (selectNum == 2) {
						userDAO.showWeapon();
						System.out.print("���� �����ϰ��ִ� �����");
						System.out.println(user.getWeaponsalename() + "�Դϴ�.");
						System.out.print("���⸦ �Ǹ��Ͻðڽ��ϱ�  ( Y / N ): ");
						String select = sc.next();
						if (select.equals("Y") || select.equals("y")) {
							boolean result = userDAO.saleMoney(user); // �α��� �޼ҵ� ���� �� result�� ����
							if (result) {
								userDAO.changeSaleWeapon(user); // ���� ���� ��ü
								System.out.println("�Ǹ� ����");
							} else {
								System.out.println("�Ǹ� ����");
							}
						} else {
							System.out.println("�޴��� ���ư��ϴ�.");
						}
					} else if (selectNum == 3) {
						boolean run2 = true;
						while (run2) {
							System.out.println("----------------------------");
							System.out.println("|1.��ȭ ����|2��ȭ ����|");
							System.out.println("----------------------------");
							userDAO.userState(user);
							System.out.println("��ȭ ����� 50�� �Դϴ�.");
							System.out.print("���� >");
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
						System.out.print("�Ա��Ͻ� �ݾ��� �Է����ּ��� : ");
						int money = sc.nextInt();
						user.setMoney(money);
						boolean result = userDAO.bank(user);
						if (result) {
							userDAO.changeMoney(user); // UMONEY ���� ��ü
							System.out.println("�Ա� �Ϸ�");
							System.out.println("���� ����ݾ� : " + (bankmoney - user.getBankm())+"��");
						} else {
							System.out.println("�Ա� ����");
						}if(bankmoney<=user.getBankm()) {
							System.out.println("�����մϴ� ���ݾ��� �����Ͽ� ����������˴ϴ�.");
							System.out.println("����� � �ڼ��� ~!!!");
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
