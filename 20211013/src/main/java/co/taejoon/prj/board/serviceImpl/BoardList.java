package co.taejoon.prj.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.taejoon.prj.board.service.BoardService;
import co.taejoon.prj.board.service.BoardVO;
import co.taejoon.prj.comm.Command;

public class BoardList implements Command {
	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = boardService.boardSelectList();

		System.out.println("==========================================================");
		for (BoardVO vo : boards) {
			vo.toListString();
		}
		System.out.println("==========================================================");

	}
}
