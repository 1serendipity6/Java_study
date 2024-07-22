package com.leo.service.impl;

import com.leo.dao.BrandDao;
import com.leo.domain.Brand;
import com.leo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Leo
 * @data 2024/7/19 上午 10:58
 */
@Service
public class BrandServiceImpl implements BrandService {
   @Autowired
    private BrandDao brandDao;

    @Override
    public void save(Brand brand) {
       brandDao.save(brand);
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
    public Brand selectById(String id) {
        return brandDao.selectById(id);

    }
}
