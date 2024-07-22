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
 * @data 2024/7/5 上午 08:38
 */
@WebServlet("/tc01")
public class TestCookie01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //創建cookie對象,需要设置参数name和value值
        Cookie c = new Cookie("name", "lili");
        //响应給瀏覽器
        resp.addCookie(c);
    }
}
