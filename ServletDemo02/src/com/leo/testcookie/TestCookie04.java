package com.leo.testcookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author Leo
 * @data 2024/7/5 上午 09:57
 */
@WebServlet("/tc04")
public class TestCookie04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //防止請求和響應亂碼
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        //创建cookie对象
        //若含有中文，則需要進行編碼，解碼
        String uname="興趣";
        String value="打球";
        //編碼
        uname = URLEncoder.encode(uname);
        value = URLEncoder.encode(value);
        Cookie cookie = new Cookie(uname, value);

        //设置cookie到期时间为三天
        cookie.setMaxAge(60*60*24*3);
        //响应给浏览器
        resp.addCookie(cookie);
        //获取cookie
        Cookie[] cookies = req.getCookies();
        //判空
        if(cookies != null &cookies.length>0){
            //遍历
            for (Cookie c:cookies){
                //解碼
                System.out.println(URLDecoder.decode(c.getName())+
                        "="+  URLDecoder.decode(c.getValue())
                );

            }
        }
    }
}
