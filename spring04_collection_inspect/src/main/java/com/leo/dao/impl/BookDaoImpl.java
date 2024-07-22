package com.leo.dao.impl;

import com.leo.dao.BookDao;

import java.util.*;

/**
 * @author Leo
 * @data 2024/7/16 下午 01:50
 */
public class BookDaoImpl implements BookDao {
    private String[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties properties;

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("這是collection集合注入的測試");

        System.out.println("遍歷數組:" + Arrays.toString(array));

        System.out.println("遍歷List:" + list);

        System.out.println("遍歷Set:" + set);

        System.out.println("遍歷Map:" + map);

        System.out.println("遍歷Properties:" + properties);
    }
}
