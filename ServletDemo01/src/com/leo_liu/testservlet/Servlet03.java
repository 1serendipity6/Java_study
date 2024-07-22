package com.leo_liu.testservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/3 上午 10:29
 */
public class Servlet03 extends HttpServlet {
    //这里演示如何用浏览器3.0版本以前的方式访问

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("第一次请求");
        //服务器响应
        resp.getWriter().write("第一次响应");
    }
}
