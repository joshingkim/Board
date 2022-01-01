package kr.co.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;
import kr.co.repository.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO bDao;

	@Override
	public PageTO<BoardVO> list(PageTO<BoardVO> pt) {

		int amount = bDao.getAmount();
		pt.setAmount(amount);

		List<BoardVO> list = bDao.list(pt);
		pt.setList(list);

		return pt;
	}

	/* @Transactional */
	@Override
	public void insert(BoardVO vo) {
		bDao.insert(vo);

//		String[] arr = vo.getInsertfiles();
//		int bno = vo.getBno();
//		
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("bno", bno);
//		if (arr != null) {
//			for (int i = 0; i < arr.length; i++) {
//				map.put("filename", arr[i]);
//				aDao.insert(map);
//			}
//		}
	}
	
}
