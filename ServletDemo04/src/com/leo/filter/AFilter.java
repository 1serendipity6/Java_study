package com.leo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * @author Leo
 * @data 2024/7/6 上午 10:57
 */
//註解是選擇攔截的資源
@WebFilter("/Servlet01")
public class AFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("過濾器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //對用戶請求進行預處理
        System.out.println("對用戶請求進行預處理");
        //放行:對請求和響應進行放行
        filterChain.doFilter(servletRequest,servletResponse);
        //對服務器響應進行後處理
        System.out.println("對服務器端進行後處理");
    }

    @Override
    public void destroy() {
        System.out.println("過濾器銷毀");
    }
}
