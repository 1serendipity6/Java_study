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
 * @data 2024/7/9 下午 02:33
 */
public class MybatisDemo {
    public static void main(String[] args) throws IOException {
        //1.加載mybatis的核心配置文件，獲取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.獲取SqlSession對象，用他來執行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //3.執行sql
//        List<User> users = sqlSession.selectList("test.selectAll");
//        System.out.println(users);

        User u = userMapper.selectone("張三");
        System.out.println(u);

        //4.釋放資源
        sqlSession.close();
    }
}
