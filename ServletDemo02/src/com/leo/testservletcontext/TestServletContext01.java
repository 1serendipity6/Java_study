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
 * @data 2024/7/5 下午 01:47
 */
@WebServlet("/tsc01")
public class TestServletContext01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ServletContext对象
        //1.通过request对象获取（推荐）
        ServletContext sc1 = req.getServletContext();
        //2.通过session对象获取
       // ServletContext sc2 = req.getSession().getServletContext();
        //3.通过ServletConfig对象获取
        //ServletContext sc3 = getServletConfig().getServletContext();
        //4.通过getServletContext（）方法获取
        //ServletContext sc4 = getServletContext();

        //常用方法：
        //获取当前资源的真实路径
        String realPath = sc1.getRealPath("/");
        System.out.println("當前資源的真實路徑為："+realPath);
        //获取当前服务器信息
        String serverInfo = sc1.getServerInfo();
        System.out.println("當前服務器信息為：："+serverInfo);

        //通过域对象存储数据（共享数据）
        sc1.setAttribute("day","stuggle");
    }
}
