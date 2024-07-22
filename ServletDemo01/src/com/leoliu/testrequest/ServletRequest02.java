package com.leoliu.testrequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/3 下午 03:41
 */
@WebServlet("/sr02")
public class ServletRequest02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //   獲取參數
        String uname = req.getParameter("uname");
        System.out.println("sr02-Servlet獲取的用戶名為："+uname);
        String pwd = req.getParameter("pwd");
        System.out.println("sr02-Servlet獲取的密碼為："+pwd);
        //域對象的數據共享
        //設置域對象的內容
         req.setAttribute("age","18");
         //獲取域對象的內容
        String age = (String)req.getAttribute("age");
        System.out.println("sr02-Servlet域對象屬性age所設置的內容為:"+age);

        //請求轉發
        req.getRequestDispatcher("sr03").forward(req,resp);
        //請求轉發以後輸出一句話
        System.out.println("----sr02請求轉發");
    }
}
