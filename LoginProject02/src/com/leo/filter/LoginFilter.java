package com.leo.filter;

import com.leo.pojo.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/9 上午 10:59
 */
//1.首先將所有的資源都進行攔截
    @WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //3.將ServletRequest對象強轉為基於Http的請求的對象
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //4.在完成2,3步驟以後，登錄index.jsp頁面後出現問題：localhost將您重定向的次數過多
        //5.所以我們要做的事就是設置放行資源-登錄界面：
        //6.通過地址欄請求的地址判斷是否現代login.jsp，如果攜帶的話，那麼放行：
        String uri = request.getRequestURI();
        if(uri.contains("/login.jsp")){
            //7.如果攜帶了login.jsp.就將資源進行放行操作
            filterChain.doFilter(request,response);
            return;
        }
        //8.對靜態資源進行放行，否則登錄界面使用的圖片、css、js的內容都無法訪問：
        if(uri.contains("/images")){
            filterChain.doFilter(request,response);
            return;
        }
        //8.2點擊登錄以後，會訪問LoginServlet,所以對LoginServlet也要放行
        if (uri.contains("/LoginServlet")){
            filterChain.doFilter(request,response);
            return;
        }
        //9.完成到第八步，已經可以攔截非法操作，但是如果登錄了以後，還訪問login.index
        //是不可以的
        //10.如果已經登陸了，就創建了會話了，就可以隨意的訪問其他頁面了
        User user =(User) request.getSession().getAttribute("user");
        if (user != null){ //1.如果用戶信息不為空，則證明以及登錄成功，放行其他資源
            filterChain.doFilter(request,response);
            return;
        }

        //2.只要進行了非法訪問，就跳轉到登錄界面：(重定向)
        response.sendRedirect("login.jsp");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
