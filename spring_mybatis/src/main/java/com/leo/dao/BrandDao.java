package com.leo.dao;

import com.leo.domain.Brand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Leo
 * @data 2024/7/17 下午 02:29
 */

public interface BrandDao {
    // 查询一条操作
    @Select("select * from tb_brand where id=#{id}")
    Brand selectById(String id);

    // 添加操作
    @Insert("insert into tb_brand(brand, price, id, runner) values(#{id}, #{price}, #{id}, #{runner})")
    void add(Brand brand);

    // 修改操作
    @Update("update tb_brand set brand=#{brand}, price=#{price}, runner=#{runner} where id=#{id}")
    void update(Brand brand);

    // 根据id删除操作
    @Delete("delete from tb_brand where id=#{id}")
    void deleteById(String id);
}
