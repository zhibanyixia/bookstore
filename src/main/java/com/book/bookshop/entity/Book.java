package com.book.bookshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.book.bookshop.entity.enums.Category;
import com.book.bookshop.entity.enums.Suit;
import lombok.Data;

import java.util.Date;

/**
 * @Auther:
 * @Date:
 * @Description:图书实体类
 */

@Data
@TableName(value = "bs_book")   //防止查询名同名
public class Book extends Model<Book> {
    @TableId(type = IdType.AUTO)  //插入id之后会自动增加
    private  Integer id;
    private  String isbn;
    private  String name;
    private  String author;
    private  String publisher;
    private Date publishDate;
    private  double oldPrice;
    private  double newPrice;
    private  String authorLoc;
    private  Suit suit;
    private  Category category;
    private  String info;
    private  String imgUrl;

}
