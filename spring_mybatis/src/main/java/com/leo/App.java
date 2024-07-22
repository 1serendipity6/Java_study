package com.leo;

import com.leo.dao.BrandDao;
import com.leo.domain.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //1.創建SqlSessionFactory
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //2.加載mybatis配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //3.創建SqlSessionFactory對象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        //4.獲取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5.執行SqlSession對象執行查詢，獲取結果User
        BrandDao brandDao = sqlSession.getMapper(BrandDao.class);
        Brand brand = brandDao.selectById("m1001");
        System.out.println(brand);
        //6.釋放資源
        sqlSession.close();
    }
}
