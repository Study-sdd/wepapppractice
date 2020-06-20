package com.example.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*
这是注解，和注释不同，注解是引入资源的一种方式
如果只是使用@RestController注解Controller，
则Controller中的方法无法返回jsp页面，或者html，
配置的视图解析器 InternalResourceViewResolver不起作用，
返回的内容就是Return 里的内容。
例如：本来应该到success.jsp页面的，则其显示success.
 */
public class hiController {
    @GetMapping("/hi")   //后面请求的映射，路径。GetMapping是一个组合注解

    @RequestMapping("/hii")
    public String hii(){    //执行的操作
        return "Hello World";
    }
}
