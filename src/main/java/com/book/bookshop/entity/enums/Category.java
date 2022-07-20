package com.book.bookshop.entity.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther:
 * @Date:
 * @Description:图书类型枚举类
 */

//enum 列举型别名
@Getter
public enum Category {
   SELECTED(1,"精选图书"),RECOMMEND(2,"推荐图书"),BARGAIN(3,"特价图书");

   Category(int code,String desc){
       this.code = code;
       this.desc = desc;

   }
   @EnumValue  //标记数据库存的值是code
    private  final  int code;
    private  final  String desc;

}
