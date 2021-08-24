package com.xuhongbin.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title:
 * @Description:
 * @Author: xuhongbin
 * @Date: 2021-08-20 15:53
 **/

//过滤器url一般配置成 /* ,表示所有请求都要被过滤器过滤，多个过滤器的执行顺序
@WebFilter(filterName = "myFilter" ,urlPatterns = "/*")
public class MyFilter  implements Filter {
    public static void main(String[] args) {
        System.out.println("这是一个过滤器");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter初始化执行");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    /**
     * 编码过滤器
     */
    //@Override
    //public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    //    System.out.println("编码过滤器开始执行");
    //    HttpServletRequest req = (HttpServletRequest) request;
    //    HttpServletResponse resp = (HttpServletResponse) response;
    //    req.setCharacterEncoding("utf-8");
    //    resp.setCharacterEncoding("utf-8");
    //    //resp.setContentType("application/json; charset=utf-8");
    //    System.out.println("编码过滤器执行成功");
    //    chain.doFilter(req,resp);
    //}

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
