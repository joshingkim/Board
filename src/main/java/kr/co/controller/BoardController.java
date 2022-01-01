package kr.co.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;
import kr.co.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Inject
	private BoardService bService;
	
	@RequestMapping(value = "/list/{curPage}", method = RequestMethod.GET)
	public String list(@PathVariable("curPage") int curPage, PageTO<BoardVO> pt, Model model) {
		pt.setCurPage(curPage);
		
		pt = bService.list(pt);
		
		model.addAttribute("pt", pt);
		
		return "board/list";
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(PageTO<BoardVO> pt, Model model) {
		pt = bService.list(pt);
		
		model.addAttribute("pt", pt);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(BoardVO vo) {
		
		bService.insert(vo);
			
		return "redirect:/board/list";
//		return "redirect:/board/read/"+vo.getBno();
	}
	
	@RequestMapping(value = "/insertui", method = RequestMethod.GET)
	public String insertui() {
		
		return "board/insert";
	}

}
