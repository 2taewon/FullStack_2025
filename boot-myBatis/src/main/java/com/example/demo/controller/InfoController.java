package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookInfoServiceImpl;
import com.example.demo.vo.BookInfoVO;

@RestController
public class InfoController {

  @Autowired
  BookInfoServiceImpl bookInfoService;

  @GetMapping("/book")
  public List<BookInfoVO> selectAllBookInfo() {
    List<BookInfoVO> allBookInfo = bookInfoService.selectAllBookInfo();

    return allBookInfo;
  }

  @GetMapping("/book/{book_key}")
  public BookInfoVO selectByKey(@PathVariable String book_key) {
    BookInfoVO bookInfo = bookInfoService.selectByKey(book_key);

    return bookInfo;
  }

  @PostMapping(value="/book/new")
  public List<BookInfoVO> insertBookInfo(@RequestBody BookInfoVO bookInfo) {
      bookInfoService.insert(bookInfo);

      return bookInfoService.selectAllBookInfo();
  }

  @PutMapping(value="/book/{book_key}")
  public List<BookInfoVO> updateBookInfo(@PathVariable String book_key, @RequestBody BookInfoVO bookInfo) {
      bookInfoService.updateBookInfo(book_key, bookInfo);

      return bookInfoService.selectAllBookInfo();
  }

  @DeleteMapping("/book/{book_key}")
  public List<BookInfoVO> deleteBookInfo(@PathVariable String book_key) {
    bookInfoService.deleteBookInfo(book_key);

    return bookInfoService.selectAllBookInfo();
  }

}