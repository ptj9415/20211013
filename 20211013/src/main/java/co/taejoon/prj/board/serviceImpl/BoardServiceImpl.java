package co.taejoon.prj.board.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.taejoon.prj.board.service.BoardMapper;
import co.taejoon.prj.board.service.BoardService;
import co.taejoon.prj.board.service.BoardVO;
import co.taejoon.prj.comm.DataSource;

public class BoardServiceImpl implements BoardService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private BoardMapper map = sqlSession.getMapper(BoardMapper.class);

	public List<BoardVO> boardSelectList() {
		// TODO Auto-generated method stub
		return map.boardSelectList();
	}

	public BoardVO boardSelect(BoardVO vo) {
		// TODO Auto-generated method stub
		vo = map.boardSelect(vo);
		if (vo.getBWriter() != null) {
		}
		return vo;
	}

	public int boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardUpdate(vo);
	}

	public int boardInsert(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardInsert(vo);
	}

	public int boardDelete(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardDelete(vo);
	}
}
