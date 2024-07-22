package com.leo.upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

/**
 * @author Leo
 * @data 2024/7/5 下午 03:09
 */
@WebServlet("/uploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //設置請求的編碼格式
        req.setCharacterEncoding("UTF-8");
        //獲取表單域文本的內容
        String filename = req.getParameter("filename");
        System.out.println(filename);
        //獲取Part對象,注意getPart對象裡面的參數值要和html裡，
        //type="file" 中name的屬性值一致
        Part uploadfile = req.getPart("uploadfile");
        System.out.println(uploadfile);
        //上傳文件的名字
        String submittedFileName = uploadfile.getSubmittedFileName();
        //將文件上傳到指定路徑
       uploadfile.write("d:/Users/"+submittedFileName);
        //uploadfile.write(req.getServletContext().getRealPath("/")+"/"+submittedFileName);
    }
}
