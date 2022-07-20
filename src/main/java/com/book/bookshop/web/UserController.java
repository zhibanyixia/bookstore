package com.book.bookshop.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:
 * @Date:
 * @Description:用户控制器
 */

@Controller
@RequestMapping("/user")
public class UserController {
    //验证用户名是否存在
    @RequestMapping("/checkUserName")
    public  String chekUserName(String username){

        return "101";
    }
}
