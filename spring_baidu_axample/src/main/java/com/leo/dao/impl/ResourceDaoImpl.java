package com.leo.dao.impl;

import com.leo.dao.ResourceDao;
import org.springframework.stereotype.Repository;

/**
 * @author Leo
 * @data 2024/7/19 下午 04:04
 */
@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    //模擬校驗
    public boolean readResource(String url, String password) {
        return password.equals("root");
    }
}
