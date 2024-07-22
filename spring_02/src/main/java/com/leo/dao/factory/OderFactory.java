package com.leo.dao.factory;

import com.leo.dao.OrderDao;
import com.leo.dao.impl.OrderDaoImpl;

/**
 * @author Leo
 * @data 2024/7/15 下午 02:13
 */
public class OderFactory {

       public static OrderDao getOderDao(){
        return new OrderDaoImpl();
    }
}
