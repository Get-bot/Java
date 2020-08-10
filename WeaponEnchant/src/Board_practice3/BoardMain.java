package Board_practice3;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDTO dto = new BoardDTO();	
		List<BoardDTO> dtolist = new ArrayList<BoardDTO>();
		BoardService ser = new BoardService();
		//DTO를 전역변수 설정하고
		//실제자리에서 선언하자
		boolean run = true;
		while(run) {			
	    System.out.println("--------------------------------------------------------------------------------");
        System.out.println("| 1. 게시글등록 | 2. 전체글확인 | 3.글수정 | 4.글삭제 | 5.종료 |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("선택 > ");
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
        	System.out.println("종료합니다.");
        	run =false;
        	break;
    }
   	}
   }
}
}

