package com.leo;

import com.leo.mapper.BrandMapper;
import com.leo.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Leo
 * @data 2024/7/12 上午 08:57
 */
public class MybatisTest2 {public static void main(String[] args) throws IOException {
    //條件查詢參數處理
    //接收參數
    String brand = "蘋果15";

    String runner = "A17";
    //處理參數，實現模糊匹配
    runner = "%" + runner + "%";

//       //获取对象并封装
//    Brand brand1 = new Brand();
//    brand1.setBrand(brand);
//    brand1.setRunner(runner);

    //将参数添加到Map集合
    Map map = new HashMap();
//    map.put("brand",brand);
    map.put("runner",runner);


    //1.獲取sqlSessionFactory對象
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    //2.獲取SqlSession對象，用他來執行sql
    SqlSession sqlSession = sqlSessionFactory.openSession();
    // 3.1 獲取UserMapper接口代理對象
    //獲取接口
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);


    //條件查詢-对象参数
//    List<Brand> brands = brandMapper.selectByCondition(brand1);
//    System.out.println(brands);

    //條件查詢-集合
    List<Brand> brands = brandMapper.selectByCondition(map);
    System.out.println(brands);

    //4.關閉sqlSession,釋放資源
    sqlSession.close();
}
}
