package kr.co.repository;

import java.util.List;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;

public interface BoardDAO {

	List<BoardVO> list(PageTO<BoardVO> to);
	
	int getAmount();
	
	void insert(BoardVO vo);

}
