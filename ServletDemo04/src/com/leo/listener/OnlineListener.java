package com.leo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Leo
 * @data 2024/7/6 下午 02:54
 */
@WebListener
public class OnlineListener implements HttpSessionListener {
    private int onlinenum=0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        //設置變量用於記錄session對象，一個session對象為一個人在線
        //創建一個session對象則onlinenum +1
        onlinenum++;
        //將在線人數記錄在application作用域中
        se.getSession().getServletContext().setAttribute("onlinenum",onlinenum);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
      //銷毀一個session對象則人數-1
        onlinenum--;
        //將在線人數記錄在application作用域中
        se.getSession().getServletContext().setAttribute("onlinenum",onlinenum);
    }
}
