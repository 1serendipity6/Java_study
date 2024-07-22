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
 * @data 2024/7/5 上午 10:52
 */
@WebServlet("/ts01")
public class TestSession01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //獲取session對象
        HttpSession session = req.getSession();
        //獲取Session唯一的標識符
        String id = session.getId();
        System.out.println(id);
        //判斷Session對象是否是新的
        System.out.println(session.isNew());

    }
}
