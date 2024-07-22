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
 * @data 2024/7/5 上午 11:18
 */
@WebServlet("/ts02")
public class TestSession02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //創建session對象
        HttpSession session = req.getSession();

        //設置session對象屬性和值
        session.setAttribute("name","jack");
        session.setAttribute("uname","jay");

        //移除session對象屬性值
        session.removeAttribute("uname");

        //請求轉發
        req.getRequestDispatcher("/ts03").forward(req,resp);
    }
}
