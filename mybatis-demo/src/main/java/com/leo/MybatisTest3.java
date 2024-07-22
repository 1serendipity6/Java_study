package com.leo;

import com.leo.mapper.BrandMapper;
import com.leo.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Leo
 * @data 2024/7/12 上午 09:58
 */
public class MybatisTest3 {
  public static void main(String[] args) throws IOException {
    //條件查詢參數處理
    //接收參數
    String brand = "蘋果15";

    String runner = "A17";
    //處理參數，實現模糊匹配
    runner = "%" + runner + "%";

    //封装对象
    Brand brand1 = new Brand();
//    brand1.setRunner(runner);
    brand1.setBrand(brand);


    //1.獲取sqlSessionFactory對象
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    //2.獲取SqlSession對象，用他來執行sql
    SqlSession sqlSession = sqlSessionFactory.openSession();
    // 3.1 獲取UserMapper接口代理對象
    //獲取接口
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    //动态单条件查询
    List<Brand> brands = brandMapper.selectByConditionSingle(brand1);
    System.out.println(brands);

    //4.關閉sqlSession,釋放資源
    sqlSession.close();
  }
@Test
  public void testAdd() throws  IOException{

  //接收參數
  String brand = "小米14pro";
  String runner = "驍龍八加第三代處理器";
  String id="m1005";
  int price=5999;

  //封装对象
  Brand brand1 = new Brand();
  brand1.setRunner(runner);
  brand1.setBrand(brand);
  brand1.setId(id);
  brand1.setPrice(price);


  //1.獲取sqlSessionFactory對象
  String resource = "mybatis-config.xml";
  InputStream inputStream = Resources.getResourceAsStream(resource);
  SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

  //2.獲取SqlSession對象，用他來執行sql
  // 自動提交事務，在openSession裡參數設為true
  SqlSession sqlSession = sqlSessionFactory.openSession(true);
  // 3.1 獲取UserMapper接口代理對象
  //獲取接口
  BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

  //向數據庫中添加數據
  brandMapper.add(brand1);
  System.out.println(brand1);

  //提交事務-手動提交
//  sqlSession.commit();

  //4.關閉sqlSession,釋放資源
  sqlSession.close();
}

  @Test
  public void testAdd2() throws  IOException{

    //接收參數
    String brand = "小米14 ultra";
    String runner = "驍龍八加第三代處理器";
    String id="m1006";
    int price=6999;

    //封装对象
    Brand brand1 = new Brand();
    brand1.setRunner(runner);
    brand1.setBrand(brand);
    brand1.setId(id);
    brand1.setPrice(price);


    //1.獲取sqlSessionFactory對象
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    //2.獲取SqlSession對象，用他來執行sql
    // 自動提交事務，在openSession裡參數設為true
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    // 3.1 獲取UserMapper接口代理對象
    //獲取接口
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    //向數據庫中添加數據
    brandMapper.add(brand1);
    String id1 = brand1.getId();
    System.out.println(id1);

    //提交事務-手動提交
//  sqlSession.commit();

    //4.關閉sqlSession,釋放資源
    sqlSession.close();
  }

  @Test
  public void testUpdate() throws  IOException{

    //接收參數
    String brand = "小米14-版本機皇";
    String runner = "驍龍八加第三代處理器";
    String id="m1003";
    int price=5999;

    //封装对象
    Brand brand1 = new Brand();
//    brand1.setRunner(runner);
    brand1.setBrand(brand);
    brand1.setId(id);
//    brand1.setPrice(price);


    //1.獲取sqlSessionFactory對象
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    //2.獲取SqlSession對象，用他來執行sql
    // 自動提交事務，在openSession裡參數設為true
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    // 3.1 獲取UserMapper接口代理對象
    //獲取接口
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    //向數據庫中添加數據
    int updatenum = brandMapper.update(brand1);
    System.out.println(updatenum);


    //4.關閉sqlSession,釋放資源
    sqlSession.close();
  }

  @Test
  public void testDeleteById() throws  IOException{

    //接收參數
    String id="h1003";


    //1.獲取sqlSessionFactory對象
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    //2.獲取SqlSession對象，用他來執行sql
    // 自動提交事務，在openSession裡參數設為true
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    // 3.1 獲取UserMapper接口代理對象
    //獲取接口
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    //根據id刪除一行數據
    int deleteNum = brandMapper.deleteById(id);
    System.out.println(deleteNum);

    //4.關閉sqlSession,釋放資源
    sqlSession.close();
  }

  @Test
  public void testDeleteByIds() throws  IOException{

    //接收參數
   String []ids={"p1003","m1002","p1001"};

    //1.獲取sqlSessionFactory對象
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    //2.獲取SqlSession對象，用他來執行sql
    // 自動提交事務，在openSession裡參數設為true
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    // 3.1 獲取UserMapper接口代理對象
    //獲取接口
    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    //根據id批量刪除數據
    brandMapper.deleteByIds(ids);


    //4.關閉sqlSession,釋放資源
    sqlSession.close();
  }
}
