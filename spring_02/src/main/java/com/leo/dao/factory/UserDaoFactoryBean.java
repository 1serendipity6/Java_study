package com.leo.dao.factory;

import com.leo.dao.UserDao;
import com.leo.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Leo
 * @data 2024/7/15 下午 03:06
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始實例工廠中創建對象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new  UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
//用於控制單例，不寫此方法則默認單例，返回false則為多例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
