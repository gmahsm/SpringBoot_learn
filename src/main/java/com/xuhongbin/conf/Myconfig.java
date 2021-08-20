package com.xuhongbin.conf;

import com.xuhongbin.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title:
 * @Description:
 * @Author: xuhongbin
 * @Date: 2021-08-18 16:42
 **/
@Configuration
public class Myconfig {

    @Bean
    public ServletRegistrationBean<MyServlet> getServletRegistrationBean() {
        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet(), "/myServlet");
        //参数大于0，表示程序启动后就要将Servlet初始化，数字越小，越先加载
        bean.setLoadOnStartup(1);
        return bean;
    }
}
