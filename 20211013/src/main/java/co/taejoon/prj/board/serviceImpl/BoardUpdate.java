package co.taejoon.prj.board.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.board.service.BoardService;
import co.taejoon.prj.board.service.BoardVO;
import co.taejoon.prj.comm.Command;
import co.taejoon.prj.comm.GB;

public class BoardUpdate implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		BoardVO vo = new BoardVO();

		System.out.println("게시글을 수정합니다.");
		System.out.println("수정할 게시글의 번호를 입력해주세요.");
		vo.setBId(sc.nextInt());
		sc.nextLine();
		vo = boardService.boardSelect(vo);
		if (vo != null) {
			if (vo.getBWriter().equals(GB.NAME)) {
				vo.toString();
				System.out.println("수정할 내용을 입력하세요.");
				vo.setBContents(sc.nextLine());
				int n = boardService.boardUpdate(vo);
				String message = (n != 0) ? "수정 성공" : "수정 실패";
				System.out.println(message);
			} else {
				System.out.println("작성자만 수정이 가능합니다.");
			}
		} else {
			System.out.println("존재하지 않는 게시글입니다.");
		}
	}
}
