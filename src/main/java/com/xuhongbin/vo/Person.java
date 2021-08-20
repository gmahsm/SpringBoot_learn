package com.xuhongbin.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Title:
 * @Description:
 * @Author: xuhongbin
 * @Date: 2021-08-16 9:42
 **/
@ConfigurationProperties(prefix = "person")
@Component
public class Person {

    public String name;
    public Integer age;
    public List<String> like;

    public Person() {
    }

    public Person(String name, Integer age, List<String> like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getLike() {
        return like;
    }

    public void setLike(List<String> like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", like=" + like +
                '}';
    }
}
