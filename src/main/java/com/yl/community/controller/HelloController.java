package com.yl.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @quthor yl
 * @create 2019-11-01 16:29
 */
@Controller
public class HelloController {
    @GetMapping("/hello")          //reguestparam请求参数
    public String hello(@RequestParam(name ="name") String name, Model model){
        model.addAttribute("name" ,name);//浏览器传来的值放入moder
        return  "hello";

    }
}
