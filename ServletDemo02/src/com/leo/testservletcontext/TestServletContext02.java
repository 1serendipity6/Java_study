package com.leo.testservletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/5 下午 02:09
 */
@WebServlet("/tsc02")
public class TestServletContext02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取域对象所存储的数据（数据共享）
        //获取域对象
        ServletContext sc = req.getServletContext();

        //获取数据
        String day = (String) sc.getAttribute("day");
        System.out.println("tsc2通過域對象設置的day的值為："+day);
    }
}
