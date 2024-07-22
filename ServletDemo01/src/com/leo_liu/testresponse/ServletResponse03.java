package com.leo_liu.testresponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/4 下午 03:32
 */
@WebServlet("/leo/red2")
public class ServletResponse03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //重定向后 是否能获取原本请求的参数
        String uname = req.getParameter("uname");
        //打印获取的参数
        System.out.println("/leo/sr03-servlet重定向響應uname為："+uname);
    }
}
