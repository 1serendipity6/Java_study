package com.leoliu.testrequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Leo
 * @data 2024/7/3 下午 01:52
 */
@WebServlet("/sr01")
public class ServletRequest01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取客户端发出请求的完整url
        StringBuffer url = req.getRequestURL();
        System.out.println("客戶端發出請求的完整url為："+url);

        //获取请求行中的资源名称部分
        String uri = req.getRequestURI();
        System.out.println("資源名稱為："+uri);

        //获取请求行中的参数部分
        String queryString = req.getQueryString();
        System.out.println("請求行參數部分為："+queryString);

        //获取客户端请求方式
        String method = req.getMethod();
        System.out.println("客戶端的請求號為："+method);

        //获取HTTP版本号
        String reqProtocol = req.getProtocol();
        System.out.println("HTTP版本號為："+reqProtocol);

        //获取webapp名字
        String contextPath = req.getContextPath();
        System.out.println("webapp名字為："+contextPath);

        System.out.println("-------------");
        //获取参数
        String uname = req.getParameter("uname");
        System.out.println("用戶名名為："+uname);
        String pwd = req.getParameter("pwd");
        System.out.println("密碼為："+pwd);
        //获取参数值(数组)
        String[] hobbies = req.getParameterValues("hobby");
        //将数组转换成字符串
        System.out.println("指定的hobby參數為："+ Arrays.toString(hobbies));
    }
}
