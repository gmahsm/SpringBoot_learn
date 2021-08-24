package com.xuhongbin.contoller;

import com.xuhongbin.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description:
 * @Author: xuhongbin
 * @Date: 2021-08-13 16:18
 **/
@Controller
public class HelloWorld {

    @Autowired
    Person person;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/getPerson")
    @ResponseBody
    public String getPerson() {
        System.out.println("有人获取Person");
        return person.toString();
    }


    @RequestMapping("/123")
    public String TestGit() {
        System.out.println("test分支");
        return "1234";
    }
}
