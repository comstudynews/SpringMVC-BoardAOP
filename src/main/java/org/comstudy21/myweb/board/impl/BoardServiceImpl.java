package org.comstudy21.myweb.board.impl;

import java.util.List;

import javax.inject.Inject;

import org.comstudy21.myweb.board.BoardService;
import org.comstudy21.myweb.board.BoardVO;
import org.comstudy21.myweb.common.LogAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDao;
	
	//@Autowired
	//@Qualifier("logAdvice")
	//@Inject
	//private LogAdvice logAdvice;

	@Override
	public BoardVO getOne(BoardVO vo) {
		//logAdvice.printLog();
		return boardDao.getBoard(vo);
	}

	@Override
	public List<BoardVO> getList(BoardVO vo) {
		//logAdvice.printLog();
		return boardDao.getBoardList(vo);
	}

	@Override
	public void insert(BoardVO vo) {
		//logAdvice.printLog();
		boardDao.insertBoard(vo);
	}

	@Override
	public void update(BoardVO vo) {
		//logAdvice.printLog();
		boardDao.updateBoard(vo);
	}

	@Override
	public void delete(BoardVO vo) {
		//logAdvice.printLog();
		boardDao.deleteBoard(vo);
	}

}
