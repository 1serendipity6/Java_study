package com.leo.mapper;

import com.leo.pojo.Brand;
import com.leo.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Leo
 * @data 2024/7/11 上午 11:41
 */
public interface BrandMapper {

/**
 * 查詢所有
 */
public List<Brand> selectAll();

//查看详情
public List<Brand> selectById(String id);

//条件查询
    /*
    * 參數接收
    *    1.散裝參數：如果方法中有多個參數，需要使用@param（“sql參數佔位符名稱”）
    *    2.對象參數：對象的屬性名要与参数占位符名称一致
    *    3.map集合：只需要保证SQL中的参数名和map集合的键的名称对应上，即可成功
    * */

    /**
     * @return
     * @param: brand
     * @param: runner
     **/
//散装参数
    List<Brand> selectByCondition(@Param("brand")String brand,@Param("runner")String runner);

    //按对象方式
    List<Brand> selectByCondition(Brand brand);

    //按集合方式
    List<Brand> selectByCondition(Map map);

    List<Brand> selectByConditionSingle(Brand brand);

    //添加操作
    void add(Brand brand);

    //修改操作
    int update(Brand brand);

    //根據id刪除操作
    int deleteById(String id);

    //根據id刪除多行數據
    void deleteByIds(@Param("ids") String []ids);


}
