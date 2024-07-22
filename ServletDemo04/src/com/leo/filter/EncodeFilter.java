package com.leo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/6 上午 11:50
 */
@WebFilter("/*")
public class EncodeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //對用戶請求進行預處理
           //對請求的編碼格式進行設置
        servletRequest.setCharacterEncoding("utf-8");
         //對響應的編碼格式進行設置
        servletResponse.setCharacterEncoding("utf-8");
        //對瀏覽器顯示的編碼格式進行設置
        servletResponse.setContentType("text/html;charset=utf-8");
       // text/html，注意二者別寫反了否則會弄成只下載不跳轉

       //放行
        filterChain.doFilter(servletRequest,servletResponse);

        //對服務器響應進行後處理
        System.out.println("過濾器對服務器響應進行後處理");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
