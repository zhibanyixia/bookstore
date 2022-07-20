package com.book.bookshop.web;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.book.bookshop.entity.Book;
import com.book.bookshop.entity.enums.Category;
import com.book.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:
 * @Date:
 * @Description:图书控制器
 */

@Controller
@RequestMapping("/home")   //访问商城当前首页
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/index")
    public  String index(){
        return "index";
    }

     /**
     * 获取图书信息
     */
     @RequestMapping("/getBookData")
    public String getBookData(Model model,Integer page,Integer category){
         //mybatis plus分页
         QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
         queryWrapper.eq("category",category);
         IPage<Book> iPage = bookService.page(new Page<>(page,4),queryWrapper);
         model.addAttribute("bookList",iPage.getRecords());
         model.addAttribute("pre",iPage.getCurrent()-1);
         model.addAttribute("next",iPage.getCurrent()+1);
         model.addAttribute("cur",iPage.getCurrent());
         model.addAttribute("last",iPage.getPages());
         model.addAttribute("category",category);


        return "bookData";

    }

//    /**
//     * 图书列表页
//     */
//    @RequestMapping("/bookList")
//    public String bookList(String category, Model model){
//        model.addAttribute("category",category);
//        return "books_list";
//    }
}
