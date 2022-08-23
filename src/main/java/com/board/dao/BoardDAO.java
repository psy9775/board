package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {

	/* 게시글 목록 */
	public List<BoardVO> list() throws Exception;
	
}
