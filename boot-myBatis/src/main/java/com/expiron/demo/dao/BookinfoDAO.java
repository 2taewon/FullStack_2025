package com.expiron.demo.dao;

import java.util.List;

import com.example.demo.vo.BookInfoVO;

public interface BookinfoDAO {
	List<BookInfoVO> selectAllBookInfo();
	BookInfoVO selectBykey(String book_key);
	void insert(BookInfoVO bookinfo);
	
	
	void updateBookInfo(String book_key, BookInfoVO bookinfo);
	void deleteBookInfo(BookInfoVO bookinfo);
}
