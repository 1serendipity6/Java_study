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
 * @data 2024/7/5 上午 10:26
 */
@WebServlet("/tc05")
public class TestCookie05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //創建cookie對象
        Cookie cookie = new Cookie("hobby", "tabletennis");
        //設置路徑
        cookie.setPath("/s");
        resp.addCookie(cookie);
    }
}
