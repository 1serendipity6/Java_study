package com.leo_liu.testresponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/4 下午 03:26
 */
@WebServlet("/leo/red1")
public class ServletResponse02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获取参数请求
        String uname = req.getParameter("uname");
        System.out.println("ServletResponse02獲取的uname为："+uname);
        //重定向  可以跳轉到外部資源
        resp.sendRedirect("https://www.baidu.com/");
       // resp.sendRedirect(req.getContextPath()+"/leo/red2");
        //打印重定向后的信息
        System.out.println("重定向是否能獲取到uname:"+uname);
    }
}
