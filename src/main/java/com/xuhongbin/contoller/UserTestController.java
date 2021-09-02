package com.xuhongbin.contoller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title:
 * @Description:
 * @Author: xuhongbin
 * @Date: 2021-09-02 14:50
 **/

@RestController
@RequestMapping("/test")
public class UserTestController {

    @GetMapping("/{id}/{username}")
    public Map<String,String> getUserById(@PathVariable Map<String,String> pv) {
        return pv;
    }

    //@GetMapping("/{id}/{username}")
    //public Map<String,Object> getUserById(@PathVariable("id") String id, @PathVariable("username") String username) {
    //    Map<String, Object> map = new HashMap<>();
    //    map.put(id, username);
    //    return map;
    //}


    @RequestMapping("/02")
    public void addUserById(String id) {
        System.out.println("添加成功");

    }
}
