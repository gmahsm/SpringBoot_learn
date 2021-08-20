package com.xuhongbin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan
public class MyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(MyApplication.class);
        // 禁用命令行参数
        springApplication.setAddCommandLineProperties(false);
        springApplication.run(args);
    }

}
