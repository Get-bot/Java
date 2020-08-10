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
			System.out.println("0.DB 접속|1.전체글조회|2.글쓰기|3.글상세조회|4.인기순 글 목록 조회|5.글수정|6.글삭제");
			System.out.println("----------------------------");
			System.out.println("선택>> ");
			selectNum = sc.nextInt();
			switch(selectNum) {
			case 0:
				boardDAO.dbConnection();
				break;
			case 1:{//글조회
				boardDAO.selectAll();
				break;}
			case 2:{//글쓰기
				System.out.print("작성자");
				String wri = sc.next();
				System.out.print("제목: ");
				String sub = sc.next();
				System.out.print("내용: ");
				sc.nextLine();
				String con = sc.nextLine();
				board = new BoardDTO();
				board.setBwriter(wri);
				board.setBsubject(sub);
				board.setBcontents(con);
				// 리턴없이 호출
//				memberDAO.joinMember(member);
				// boolean 리턴이 있는 호출
				boolean result = boardDAO.Write(board);
				if(result) {
					System.out.println("글등록 성공");
				} else {
					System.out.println("글등록 실패");
				}
				break;}
			
			case 3:{//글상세조회 조회수 1증가 시키기
				System.out.println("조회할 글 번호 : ");
				int bnumber = sc.nextInt();
				boolean result = boardDAO.Finding(bnumber);
				if(result) {
					System.out.println("조회 성공");
				} else {
					System.out.println("조회 실패");
				}
				break;
			}

			case 4:{//인기순 글 목록 조회
				
				System.out.println("조회수 높은순 글목록 : ");
				boardDAO.Findinghits();
				
				break;
			
		}
			
			case 5:{//글수정
				System.out.println("수정할 글 번호 : ");
				int num = sc.nextInt();
				System.out.println("수정할 내용 : ");
				String contents = sc.next();		
				board = new BoardDTO();
				board.setBnumber(num);
				board.setBcontents(contents);
				boolean result = boardDAO.Update(board);
				if(result) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
				break;
			}
			case 6:{//글 삭제
				System.out.println("삭제할 글 번호 : ");
				int num = sc.nextInt();
				board = new BoardDTO();
				board.setBnumber(num);
				boolean result = boardDAO.Delete(board);
				if(result) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			}
			}
			}
}
}

