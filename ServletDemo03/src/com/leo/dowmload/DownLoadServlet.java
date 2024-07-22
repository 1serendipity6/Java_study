package com.leo.dowmload;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/6 上午 09:47
 */
@WebServlet("/downloadServlet")
public class DownLoadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //設置請求的編碼格式
        req.setCharacterEncoding("utf-8");
        //設置響應的編碼格式
        resp.setCharacterEncoding("utf-8");
        //設置響應的文本解析格式
        resp.setContentType("text/html;charset=UTF-8");

        //獲取文件名,因為為表單提交的信息，可以直接通過參數獲得
        String filename = req.getParameter("filename");
        //獲取資源的真實路徑,獲得當前路徑下的download文件下
        String realPath = req.getServletContext().getRealPath("/download/");
        //封裝File對象
        File file=new File(realPath + filename);
        //判斷文件file是否存在
        if(file.exists()){
            //文件存在，下載：
            //設置響應類型：讓其不實現跳轉，直接進行下載
           resp.setContentType("application/octet-stream");
            //設置頭信息
            resp.setHeader("Content-Disposition","attachment;filename="+filename);
            //得到輸入流
            FileInputStream fis=new FileInputStream(file);
            //得到輸出流
            ServletOutputStream os = resp.getOutputStream();
            //完成輸入輸出操作：邊輸入變輸出
            int n=fis.read();
            while (n != -1){
                os.write(n);
                n=fis.read();
            }
            //文件不存在，則進行提示
        }else {
            resp.getWriter().write("文件不存在，下載失敗");
        }


    }

}
