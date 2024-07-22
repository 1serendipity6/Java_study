package com.leo;

import com.leo.mapper.UserMapper;
import com.leo.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Leo
 * @data 2024/7/11 上午 10:03
 * mybatis代理開發
 */
public class MybatisDemo02 {
    public static void main(String[] args) throws IOException {
        //1.加載mybatis的核心配置文件，獲取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.獲取SqlSession對象，用他來執行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        //3.執行sql
//        List<Object> users = sqlSession.selectList("test.selectAll");
//        System.out.println(users);
        // 3.1 獲取UserMapper接口代理對象
           //獲取接口
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
          //使用接口中的方法
        List<User> users = userMapper.selectAll();
        System.out.println(users);


// 4. 关闭 SqlSession
        sqlSession.close();

    }

}
