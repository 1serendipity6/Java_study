package com.leo.dao;

import com.leo.dao.UserDao;
import com.leo.pojo.User;

import java.sql.*;


/**
 * @author Leo
 * @data 2024/7/9 上午 10:12
 */
public class UserDaoImpl implements UserDao {
    @Override
    public User selectOneUser(String uname, String pwd) {
        String url = "jdbc:mysql://10.196.7.241/db2?useSSL=false&useServerPrepstmts=true";
        User user = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //加載驅動
            Class.forName("com.mysql.cj.jdbc.Driver");
            //獲取連接
            conn = DriverManager.getConnection(url, "root", "123456");
            //創建會話
            pstmt = conn.prepareStatement("select * from user where uname=? and pwd=?");
            //設置參數
            pstmt.setString(1, uname);
            pstmt.setString(2, pwd);
            //進行查詢
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String username = rs.getString("uname");
                String password = rs.getString("pwd");
                //將數據封裝成對象
                user = new User(username, password);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                pstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return user;
    }
}
