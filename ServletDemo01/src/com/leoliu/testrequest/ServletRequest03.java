package com.leoliu.testrequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/3 下午 06:43
 */
@WebServlet("/sr03")
public class ServletRequest03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //sr03 已經接收了sr02請求轉發的req請求對象和resp響應對象
        //因此可以直接獲取sr02已經獲取的參數
        String uname = req.getParameter("uname");
        System.out.println("sr03-Servlet 獲取的用戶名為:"+uname);
        String pwd = req.getParameter("pwd");
        System.out.println("sr03-Servlet 獲取的密碼為:"+pwd);

        //獲取轉發過程中request的域對象內容
        //默認為Object類型，強轉為String
        String age = (String) req.getAttribute("age");
        System.out.println("sr03-Servlet獲取的對象屬性age內容為："+age);

    }
}
