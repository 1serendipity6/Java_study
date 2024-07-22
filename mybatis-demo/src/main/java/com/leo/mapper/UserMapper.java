package com.leo.mapper;

import com.leo.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Leo
 * @data 2024/7/10 下午 04:33
 */
public interface UserMapper {
    //查很多個利用集合實現
    List<User> selectAll();
    //使用註解查詢
    @Select("select * from user where uname = #{uname}")
    public User selectone(String uname);

}
