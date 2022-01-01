package kr.co.repository;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Inject
	private SqlSession sqlSession;
	
	private final String NS = "kr.co.board";

	@Override
	public List<BoardVO> list(PageTO<BoardVO> to) {
		
		RowBounds rbs = new RowBounds(to.getStartNum()-1, to.getPerPage());
		
		return sqlSession.selectList(NS+".list", null, rbs);
	}

	@Override
	public int getAmount() {
		return sqlSession.selectOne(NS+".getAmount");
	}
	
	@Override
	public void insert(BoardVO vo) {
		sqlSession.insert(NS+".insert", vo);
		
	}
	
}
