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
 * @data 2024/7/5 上午 11:39
 */
//session對象的銷毀
@WebServlet("/ts04")
public class TestSession04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //獲取session對象
        HttpSession session = req.getSession();
        //獲取session對象的最大不活動時間
    //    int deadline = session.getMaxInactiveInterval();
      //  System.out.println("session對象默認的最大不活動時間為："+deadline);

        //設置session對象的最大不活動時間  設置三小時
        session.setMaxInactiveInterval(60*60*3);
        int daedline = session.getMaxInactiveInterval();
        System.out.println("session對象默認的最大不活動時間為："+daedline);

        //設置立即失效
        session.invalidate();

    }
}
