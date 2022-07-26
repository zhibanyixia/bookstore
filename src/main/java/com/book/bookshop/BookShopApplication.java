package com.book.bookshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.book.bookshop.mapper")
public class BookShopApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                BookShopApplication.class, args);
    }

}
