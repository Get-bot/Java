package Board_practice3;

import java.util.*;;

public class BoardService {
	Scanner sc = new Scanner(System.in);
	String pw = "";
	String PwC = "";
	
	public void SetBoardA(Scanner sc, BoardDTO dto, List<BoardDTO> dtolist) {//게시글등록
		dto = new BoardDTO();
		System.out.print("글내용을 입력해주세요 > ");
		dto.setBoard(sc.next());
		System.out.print("비밀번호를 입력해주세요 > ");
		dto.setPassword(sc.next());
		dtolist.add(dto);
	}

	public void printAll(BoardDTO dto,List<BoardDTO> dtolist) {//전체글확인
		        for(int i=0; i<dtolist.size();i++) {
				System.out.println((i+1)+"번째게시물 내용 : "+dtolist.get(i).getBoard());
		}
	}	
	public void RePack(BoardDTO dto,List<BoardDTO> dtolist) {//글수정
				boolean pass = true;
				while(pass) {
					System.out.print("수정할 글번호 입력 >");
					int i =(sc.nextInt());
				if(i<=dtolist.size()) {
					System.out.print("비밀번호를 입력해주세요 > ");
					pw = dtolist.get(i-1).getPassword();
					PwC = sc.next();
				if(pw.equals(PwC)) {
				System.out.println("비밀번호가 일치합니다.");
				System.out.print("수정할 글 입력 > ");
				dtolist.get(i).setBoard(sc.next());
				pass = false;
				}else {
				System.out.println("비밀번호가 일치하지않습니다.");
				System.out.println("다시입력해주세요.");}
				}else {
					System.out.println("없는 게시글 번호 입니다 올바른 번호를 입력해주세요");
				}
			}	
	}
	public void Remove(BoardDTO dto,List<BoardDTO> dtolist) {//글삭제
		boolean pass = true;
		while(pass) {
		System.out.print("삭제할 글번호 입력 >");
		int i =(sc.nextInt());
		dtolist.indexOf((dto));
		if(i<=dtolist.size()) {
			System.out.print("비밀번호를 입력해주세요 > ");
			pw = dtolist.get(i-1).getPassword();
			PwC = sc.next();
		  if(pw.equals(PwC)) {
		System.out.println("비밀번호가 일치합니다.");
		dtolist.remove(i-1);
		System.out.println((i)+"번째 글을 삭제 했습니다.");
		pass = false;}
		else {
		System.out.println("비밀번호가 일치하지않습니다.");
		System.out.println("다시입력해주세요.");}
		}else {
			System.out.println("없는 게시는 번호 입니다 올바른 번호를 입력해주세요");
		}
	}	
}
}



