package Board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int selectNum = 0;
		
		BoardDTO board = null;
		
		BoardDAO boardDAO = new BoardDAO();
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("0.DB ����|1.��ü����ȸ|2.�۾���|3.�ۻ���ȸ|4.�α�� �� ��� ��ȸ|5.�ۼ���|6.�ۻ���");
			System.out.println("----------------------------");
			System.out.println("����>> ");
			selectNum = sc.nextInt();
			switch(selectNum) {
			case 0:
				boardDAO.dbConnection();
				break;
			case 1:{//����ȸ
				boardDAO.selectAll();
				break;}
			case 2:{//�۾���
				System.out.print("�ۼ���");
				String wri = sc.next();
				System.out.print("����: ");
				String sub = sc.next();
				System.out.print("����: ");
				sc.nextLine();
				String con = sc.nextLine();
				board = new BoardDTO();
				board.setBwriter(wri);
				board.setBsubject(sub);
				board.setBcontents(con);
				// ���Ͼ��� ȣ��
//				memberDAO.joinMember(member);
				// boolean ������ �ִ� ȣ��
				boolean result = boardDAO.Write(board);
				if(result) {
					System.out.println("�۵�� ����");
				} else {
					System.out.println("�۵�� ����");
				}
				break;}
			
			case 3:{//�ۻ���ȸ ��ȸ�� 1���� ��Ű��
				System.out.println("��ȸ�� �� ��ȣ : ");
				int bnumber = sc.nextInt();
				boolean result = boardDAO.Finding(bnumber);
				if(result) {
					System.out.println("��ȸ ����");
				} else {
					System.out.println("��ȸ ����");
				}
				break;
			}

			case 4:{//�α�� �� ��� ��ȸ
				
				System.out.println("��ȸ�� ������ �۸�� : ");
				boardDAO.Findinghits();
				
				break;
			
		}
			
			case 5:{//�ۼ���
				System.out.println("������ �� ��ȣ : ");
				int num = sc.nextInt();
				System.out.println("������ ���� : ");
				String contents = sc.next();		
				board = new BoardDTO();
				board.setBnumber(num);
				board.setBcontents(contents);
				boolean result = boardDAO.Update(board);
				if(result) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				break;
			}
			case 6:{//�� ����
				System.out.println("������ �� ��ȣ : ");
				int num = sc.nextInt();
				board = new BoardDTO();
				board.setBnumber(num);
				boolean result = boardDAO.Delete(board);
				if(result) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				break;
			}
			}
			}
}
}

