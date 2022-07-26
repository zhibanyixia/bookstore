package com.book.bookshop.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.bookshop.entity.Book;
import com.book.bookshop.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
 * @Auther:
 * @Date:
 * @Description:图书业务层
 */

@Service
public class BookService extends ServiceImpl<BookMapper, Book> {
}
