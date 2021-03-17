package com.codegym.customer_update.services;

import com.codegym.customer_update.models.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProvinceService {
    Page<Province> findAll(Pageable pageable);
    Province findById(int id);

    void save(Province province);

    void remove(int id);
}
