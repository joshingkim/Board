package kr.co.service;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;

public interface BoardService {

	PageTO<BoardVO> list(PageTO<BoardVO> pt);

	void insert(BoardVO vo);
	
}
