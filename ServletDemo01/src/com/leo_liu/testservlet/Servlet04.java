package com.leo_liu.testservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/3 上午 10:55
 */
@WebServlet("/s04")
public class Servlet04 extends HttpServlet {

//servlet的生命周期
    //空参构造方法
    public Servlet04(){
        System.out.println("这是一个空参构造");
    }
    //Servlet对象初始化
    @Override
    public void init() throws ServletException {
        System.out.println("对象正在初始化中");
    }

    //处理业务逻辑
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理业务中");
    }
    //销毁servlet对象
    @Override
    public void destroy() {
        System.out.println("对象被销毁");
    }
}
