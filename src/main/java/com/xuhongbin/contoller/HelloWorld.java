package com.xuhongbin.contoller;

import com.xuhongbin.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description:
 * @Author: xuhongbin
 * @Date: 2021-08-13 16:18
 **/
@RestController
public class HelloWorld {

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/getPerson")
    public String getPerson() {
        System.out.println("有人获取Person");
        return person.toString();
    }
}
