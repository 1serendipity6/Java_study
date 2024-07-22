package com.leo.testcookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/5 上午 08:52
 */
@WebServlet("/tc02")
public class TestCookie02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取cookie  得到的是一个数组
        Cookie[] cookies = req.getCookies();
        //进行非空判断
        if(cookies != null&cookies.length>0){
            //遍历获取每一个值
            for (Cookie c:cookies){
                System.out.println(c.getName());
                System.out.println(c.getValue());
            }
        }
    }
}
