package com.mycompany.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	@GetMapping("boardlist")
	public String baordlist() {
		return "board/boardList.jsp";
	}
	@GetMapping("boardwrite")
	public String boardwrite() {
		return "board/boardWrite.jsp";
	}
	@GetMapping("boardcontent")
	public String boardcontent() {
		return "board/boardContent";
	}
}
