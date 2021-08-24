package com.xuhongbin.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "myServlet",urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决返回字符乱码问题
        //resp.setContentType("application/json; charset=utf-8");
        System.out.println("开始执行业务逻辑");
        resp.getWriter().append("调用了doGet()方法");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setContentType("application/json; charset=utf-8");
        resp.getWriter().append("调用了doPost()方法");
    }
}
