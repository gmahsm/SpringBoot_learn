package com.xuhongbin;

import com.xuhongbin.vo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyApplicationTests {


    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
