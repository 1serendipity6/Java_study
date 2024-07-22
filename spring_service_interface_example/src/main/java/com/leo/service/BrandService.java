package com.leo.service;

import com.leo.domain.Brand;

/**
 * @author Leo
 * @data 2024/7/19 上午 10:57
 */
public interface BrandService {
    void save(Brand brand);
    void deleteById(String id);
    void update(Brand brand);
    Brand selectById(String id);
}
