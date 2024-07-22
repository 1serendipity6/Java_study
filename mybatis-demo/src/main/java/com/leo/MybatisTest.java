package com.leo;

import com.leo.mapper.BrandMapper;
import com.leo.mapper.UserMapper;
import com.leo.pojo.Brand;
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
 * @data 2024/7/11 上午 11:47
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
       //條件查詢參數處理
        //接收參數
        String brand="蘋果15";
        String runner="A17";
        //處理參數，實現模糊匹配
        runner="%" + runner +"%";

        //1.獲取sqlSessionFactory對象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.獲取SqlSession對象，用他來執行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3.1 獲取UserMapper接口代理對象
        //獲取接口
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        //使用接口中的方法
//          //查询所有数据
//        List<Brand> brands = brandMapper.selectAll();
//        System.out.println(brands);
//
//         //查看详情
//        List<Brand> brands1 = brandMapper.selectById("m1001");
//        System.out.println(brands1);

        //條件查詢-散装参数
        List<Brand> brandList = brandMapper.selectByCondition(brand, runner);
        System.out.println(brandList);


        //4.關閉sqlSession,釋放資源
        sqlSession.close();

    }

}
