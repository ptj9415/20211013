package co.taejoon.prj.board.service;

import java.util.List;

public interface BoardMapper {
	List<BoardVO> boardSelectList();

	BoardVO boardSelect(BoardVO vo);

	int boardUpdate(BoardVO vo);

	int boardInsert(BoardVO vo);

	int boardDelete(BoardVO vo);

}
