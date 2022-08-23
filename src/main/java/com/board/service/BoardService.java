package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {

	/* 게시글 목록 */
	public List<BoardVO> list() throws Exception;
	
}
