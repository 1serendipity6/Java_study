package com.leo.controllor;

import com.leo.pojo.User;
import com.leo.service.UserService;
import com.leo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/9 上午 10:00
 */@WebServlet("/LoginServlet")
public class LoginServlet  extends HttpServlet {
     //利用多態，接口等於實現類，提升可擴展性
    UserService userService=new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //設置編碼格式
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        //1.接收頁面傳送過來的數據
        String uname=req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        System.out.println(uname);
        System.out.println(pwd);

        //2.調用業務層，訪問數據庫
        User user=userService.selectUserInfo(uname,pwd);
        System.out.println(user);

        //3.根據數據庫處理的結果響應數據，響應數據
        if(user != null){
            //一旦有這個用戶，登錄成功，就將用戶信息存在session作用域中。
            req.getSession().setAttribute("user",user);//實際可以存儲對象

            //使用重定向跳轉到首頁
            resp.sendRedirect(req.getContextPath()+"/index.jsp");

        }else {  //如果賬號密碼不正確，則進行提示
            //登錄錯誤的提示信息數據存儲在request作用域中
            req.setAttribute("failmsg","登錄失敗");
            //請求轉發
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
