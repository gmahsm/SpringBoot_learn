package com.xuhongbin.contoller;

import com.xuhongbin.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

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


    @RequestMapping("/123")
    public String TestGit() {
        System.out.println("tasdfsafedsast分支");
        return "1234";
    }

    //Object abc() {
    //    return "123";
    //}
    //
    //String abc() {
    //    return "abc";
    //}

    public static void main(String[] args) {
        //int i = 2;
        //int j = 2;
        //i += j;
        //i = i + j;

        //
        //int q = 100;
        //double w = 2.5;
        //q = (int) (q / w);
        //System.out.println(q);
        //
        //int q1 = 100;
        //double w1 = 2.5;
        //q1 /= w1;
        //System.out.println(q1);
        //
        //char A = 'A';
        //double b =1.5;
        ////A /= 1.5;
        //System.out.println(A *=b);
        //
        //char ch = '0';
        //System.out.println(ch);
        //ch *= 1.1;
        //System.out.println(ch);
        //char ch1 = '0';
        //System.out.println((byte)ch1);
        //ch1 *= 1.1;
        //System.out.println((byte)ch1);
        //
        //System.out.println((byte)'4');

        for (int i = 0; i < 10; i++) {
            System.out.println((Integer)i);

        }

    }

}
