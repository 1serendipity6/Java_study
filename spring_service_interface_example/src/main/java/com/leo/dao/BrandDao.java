package com.leo.dao;

import com.leo.domain.Brand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author Leo
 * @data 2024/7/19 上午 10:51
 */
public interface BrandDao {
@Insert("value(#{brand},#{runner},#{price})")
    void save(Brand brand);
@Delete("delete from tb_brand where id = #{id}")
    void deleteById(String id);
@Update("update tb_brand set brand = #{brand},runner = #{runner},price=#{price} where id = #{id}")
    void update(Brand brand);

@Select("select * from tb_brand where id = #{id}")
    Brand selectById(String id);
}
