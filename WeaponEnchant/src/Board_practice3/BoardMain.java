package Board_practice3;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDTO dto = new BoardDTO();	
		List<BoardDTO> dtolist = new ArrayList<BoardDTO>();
		BoardService ser = new BoardService();
		//DTO�� �������� �����ϰ�
		//�����ڸ����� ��������
		boolean run = true;
		while(run) {			
	    System.out.println("--------------------------------------------------------------------------------");
        System.out.println("| 1. �Խñ۵�� | 2. ��ü��Ȯ�� | 3.�ۼ��� | 4.�ۻ��� | 5.���� |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("���� > ");
        dto.setSelectNo(sc.nextInt());
        switch(dto.getSelectNo()) {
        case 1:{
    		ser.SetBoardA(sc, dto, dtolist);
        	break;
        }
        case 2:{
        	ser.printAll(dto,dtolist);
        	break;
        }
        case 3:{
        	ser.RePack(dto,dtolist);
        	break;
        }
        case 4:{	
        	ser.Remove(dto,dtolist);
        	break;
        }
        case 5 :{
        	System.out.println("�����մϴ�.");
        	run =false;
        	break;
    }
   	}
   }
}
}

