package Board_practice3;

import java.util.*;;

public class BoardService {
	Scanner sc = new Scanner(System.in);
	String pw = "";
	String PwC = "";
	
	public void SetBoardA(Scanner sc, BoardDTO dto, List<BoardDTO> dtolist) {//�Խñ۵��
		dto = new BoardDTO();
		System.out.print("�۳����� �Է����ּ��� > ");
		dto.setBoard(sc.next());
		System.out.print("��й�ȣ�� �Է����ּ��� > ");
		dto.setPassword(sc.next());
		dtolist.add(dto);
	}

	public void printAll(BoardDTO dto,List<BoardDTO> dtolist) {//��ü��Ȯ��
		        for(int i=0; i<dtolist.size();i++) {
				System.out.println((i+1)+"��°�Խù� ���� : "+dtolist.get(i).getBoard());
		}
	}	
	public void RePack(BoardDTO dto,List<BoardDTO> dtolist) {//�ۼ���
				boolean pass = true;
				while(pass) {
					System.out.print("������ �۹�ȣ �Է� >");
					int i =(sc.nextInt());
				if(i<=dtolist.size()) {
					System.out.print("��й�ȣ�� �Է����ּ��� > ");
					pw = dtolist.get(i-1).getPassword();
					PwC = sc.next();
				if(pw.equals(PwC)) {
				System.out.println("��й�ȣ�� ��ġ�մϴ�.");
				System.out.print("������ �� �Է� > ");
				dtolist.get(i).setBoard(sc.next());
				pass = false;
				}else {
				System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�.");
				System.out.println("�ٽ��Է����ּ���.");}
				}else {
					System.out.println("���� �Խñ� ��ȣ �Դϴ� �ùٸ� ��ȣ�� �Է����ּ���");
				}
			}	
	}
	public void Remove(BoardDTO dto,List<BoardDTO> dtolist) {//�ۻ���
		boolean pass = true;
		while(pass) {
		System.out.print("������ �۹�ȣ �Է� >");
		int i =(sc.nextInt());
		dtolist.indexOf((dto));
		if(i<=dtolist.size()) {
			System.out.print("��й�ȣ�� �Է����ּ��� > ");
			pw = dtolist.get(i-1).getPassword();
			PwC = sc.next();
		  if(pw.equals(PwC)) {
		System.out.println("��й�ȣ�� ��ġ�մϴ�.");
		dtolist.remove(i-1);
		System.out.println((i)+"��° ���� ���� �߽��ϴ�.");
		pass = false;}
		else {
		System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�.");
		System.out.println("�ٽ��Է����ּ���.");}
		}else {
			System.out.println("���� �Խô� ��ȣ �Դϴ� �ùٸ� ��ȣ�� �Է����ּ���");
		}
	}	
}
}



