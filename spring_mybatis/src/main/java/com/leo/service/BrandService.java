package com.leo.service;

import com.leo.dao.BrandDao;
import com.leo.domain.Brand;

/**
 * @author Leo
 * @data 2024/7/17 下午 02:30
 */
public interface BrandService {
public Brand selectById(String id);
public void deleteById(String id);
public void update(Brand brand);
public void add(Brand brand);

}
