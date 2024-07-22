package com.leo.service.impl;

import com.leo.dao.BrandDao;
import com.leo.domain.Brand;
import com.leo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Leo
 * @data 2024/7/17 下午 02:30
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDao brandDao;
    @Override
    public Brand selectById(String id) {
       return brandDao.selectById(id);
    }
    @Override
    public void deleteById(String id) {
     brandDao.deleteById(id);
    }
    @Override
    public void update(Brand brand) {
       brandDao.update(brand);
    }
    @Override
    public void add(Brand brand) {
        brandDao.add(brand);
    }
}
