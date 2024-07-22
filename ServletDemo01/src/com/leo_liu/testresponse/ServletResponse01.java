package com.leo_liu.testresponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Leo
 * @data 2024/7/4 下午 02:06
 */
@WebServlet("/leo/sr01")
public class ServletResponse01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //防止響應亂碼，設置傳輸過程中的編碼格式
       resp.setCharacterEncoding("UTF-8");
       //高數瀏覽器解碼的時候解碼格式
        resp.setHeader("content-type","text/html;charset=UTF-8");
        //print、write字符輸出流
        resp.getWriter().write("響應");
        resp.getWriter().print("你好");

        //outstream字節輸出流，獲取字節流（能響應一切數據）
        //resp.getOutputStream().write("hello".getBytes());//不能同时使用字节和字符输出流

        //設置響應頭,一般用于更新原来的响应头
        resp.setHeader("a","123");
        resp.setHeader("a","123"); //第一個參數為響應頭名，第二個位参数值
        //设置响应头，一般用于添加新的响应头
        resp.addHeader("b","222");
        resp.addHeader("b","222");
    }
}
