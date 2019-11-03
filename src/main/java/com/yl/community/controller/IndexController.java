package com.yl.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @quthor yl
 * @create 2019-11-01 16:29
 * 1注解controller
 * 2@GetMapping("/")的/为默认，直接返回路径 ，即index.html
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() { return "index"; }
}

/**
public class IndexController {
    @GetMapping("/hello")          //reguestparam请求参数
    public String hello(@RequestParam(name ="name") String name, Model model){
        model.addAttribute("name" ,name);//浏览器传来的值放入moder
        return  "hello";

    }
}*/
