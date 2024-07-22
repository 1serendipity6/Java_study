package com.leo.testsession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/5 上午 11:25
 */
@WebServlet("/ts03")
public class TestSession03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //創建session對象
        HttpSession session = req.getSession();

        //獲取session對象的內容
        String name = (String) session.getAttribute("name");
        System.out.println(name);
        String uname = (String) session.getAttribute("uname");
        System.out.println(uname);
    }
}
