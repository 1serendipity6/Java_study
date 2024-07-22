package com.leo_liu.testservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/3 上午 09:41
 */
@WebServlet("/s01")    //为了让浏览器响应到Servlet，需要添加一个注解让浏览器得到地址路径
public class Servlet01 extends HttpServlet {
    //此servlet方法是实现最为简单的实现方式
    @Override
    //service方法自动生成请求和响应对象，因此我们方法体内容顺利执行
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //控制台打印一句话
        System.out.println("hi servlet");
        //响应一句话给浏览器
        resp.getWriter().write("hi servlet");
    }
}
